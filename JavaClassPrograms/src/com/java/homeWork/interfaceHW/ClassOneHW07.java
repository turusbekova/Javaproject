package com.java.homeWork.interfaceHW;


import java.util.Scanner;

interface Browser1 {
    void openBrowser();

    void viewHistory();

    void openURL();
}

class Chrome implements Browser1 {

    @Override
    public void openBrowser() {
        System.out.println("Chrome Web Open Browser");
    }

    @Override
    public void viewHistory() {
        System.out.println("Chrome view history");
    }

    @Override
    public void openURL() {
        System.out.println("Chrome open url");
    }

}

class Firefox implements Browser1 {

    @Override
    public void openBrowser() {
        System.out.println("Firefox Web Open Browser");
    }

    @Override
    public void viewHistory() {
        System.out.println("Firefox View History");
    }

    @Override
    public void openURL() {
        System.out.println("Firefox Open url");
    }

}

class Edge implements Browser1{

    @Override
    public void openBrowser() {
        System.out.println("Edge Web Open Browser");
    }

    @Override
    public void viewHistory() {
        System.out.println("Edge View History");
    }

    @Override
    public void openURL() {
        System.out.println("Edge Open url");
    }
}

class Safari implements Browser1{

    @Override
    public void openBrowser() {
        System.out.println("Safari Web Open Browser");
    }

    @Override
    public void viewHistory() {
        System.out.println("Safari View History");
    }

    @Override
    public void openURL() {
        System.out.println("Safari Open url");
    }
}

public class ClassOneHW07 {
    public static void main(String[] args) {
        System.out.println("Please enter your browser");
        Scanner input = new Scanner(System.in);
        String browserFromUser = input.nextLine();


        Browser1 browser = null;

        if (browserFromUser.contains("Chrome")) {
            browser = new Chrome();
        } else if (browserFromUser.contains("Firefox")) {
            browser = new Firefox();
        } else if (browserFromUser.contains("Edge")){
            browser = new Edge();
        } else if (browserFromUser.contains("Safari")){
            browser = new Safari();
        }

        browser.openBrowser();
        browser.openURL();
        browser.viewHistory();


    }
}
