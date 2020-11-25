package com.company;

class Solution1 {
    public String licenseKeyFormatting(String S, int K) {
        char[] charArray = S.toUpperCase().toCharArray();
        int nIndex = charArray.length - 1;
        int nCount = 0;
        StringBuilder sb = new StringBuilder();
        boolean bNeedDash = false;

        while (nIndex >= 0) {
            if (charArray[nIndex] != '-') {
                bNeedDash = true;
                nCount++;

                sb.insert(0, charArray[nIndex]);
            }

            if (nCount % K == 0 && bNeedDash) {
                bNeedDash = false;
                sb.insert(0, '-');
            }
//            System.out.println(sb.toString());
            nIndex--;
        }

        // return nCount % K == 0 && sb.length > 0 ? sb.substring(1) : sb.substring();
        System.out.println(nCount);
        return nCount % K == 0 && sb.length()>0 ? sb.substring(1) : sb.toString();


    }
}