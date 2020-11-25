package com.company;

public class Studio {
    private int numStudios;
    private String studioShortName[];
    private String studioLongName[];
    private int studioCurrentRevenue[];
    private int studioPreviousRevenue[];
    private int studioTotalRevenue[];
    private final int LIMIT_STUDIOS = 10;

    public Studio(String[] studioShortName, String[] studioLongName) {
        this.studioShortName = studioShortName;
        this.studioLongName = studioLongName;
    }
}
