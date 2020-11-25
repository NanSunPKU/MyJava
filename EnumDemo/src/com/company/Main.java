package com.company;

enum Dept {
    CS("John", "Block A"),
    IT("Smith", "Block B"),
    CIVIL("Nancy", "Block C"),
    ECE("Mary", "Block D");

    String head;
    String location;

    private Dept(String head, String loc) {
        this.head = head;
        this.location = loc;
    }

    public String getHead() { return head; }
    public String getLocation() { return location; }

    public void Display() {
        System.out.println(this.name()+" "+this.ordinal());
    }
}

public class Main {

    public static void main(String[] args) {
        Dept d = Dept.CIVIL; // d can only be initialized with the four final values in Dept enum
        System.out.println(d.ordinal());//CIVIL is index of 2 in the list
        System.out.println(Dept.valueOf("IT")); //return IT if exists in the Dept Enum

        Dept[] list = Dept.values();
        for (Dept x: list) {
            System.out.println(x);//print CS, IT, CIVIL, ECE
        }

//        switch (d) {
//            case CS: System.out.println("Head: John \nBlock: A");
//                break;
//            case IT: System.out.println("Head: Smith \nBlock: B");
//                break;
//            case CIVIL: System.out.println("Head: Srinivas \nBlock: C");
//                break;
//            case ECE: System.out.println("Head: Dave \nBlock: D");
//                break;
//        }
    }
}
