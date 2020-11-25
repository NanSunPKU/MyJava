package com.company;

public class DemoGroup {
    private int numDemos;
    private String demoShortName[];
    private String demoLongName[];
    private int demoAccounts[];
    private int demoCurrentSpending[];
    private int demoPreviousSpending[];
    private int demoTotalSpending[];
    private String demoWatchingHistory[];
    private final int LIMIT_DEMOS = 10;

    public DemoGroup(int numDemos,
                     String[] demoShortName,
                     String[] demoLongName) {
        this.numDemos = numDemos;
        this.demoShortName = demoShortName;
        this.demoLongName = demoLongName;
    }
}
