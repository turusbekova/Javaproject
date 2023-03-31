package com.java.class34;


import java.util.Scanner;

interface Browser{
    void openBrowser();
    void viewHistory();
    void openURL();
}

interface MobileBrowser extends Browser{
    void shareURLViaWhatsApp();
    void rotate();
}

interface WebBrowser extends Browser{
    void inspectElement();
    void printPage();
}

class FireFoxWeb implements WebBrowser{
    @Override
    public void openBrowser() {
        System.out.println("FireFox Web Open Browser");
    }

    @Override
    public void viewHistory() {

    }

    @Override
    public void openURL() {

    }

    @Override
    public void inspectElement() {

    }

    @Override
    public void printPage() {

    }
}

class ChromeWeb implements WebBrowser{
    @Override
    public void openBrowser() {
        System.out.println("Chrome Web Open Browser");
    }

    @Override
    public void viewHistory() {

    }

    @Override
    public void openURL() {

    }

    @Override
    public void inspectElement() {

    }

    @Override
    public void printPage() {

    }
}

class ChromeMobile implements MobileBrowser{

    @Override
    public void openBrowser() {
        System.out.println("Chrome Web Mobile Open Browser");
    }

    @Override
    public void viewHistory() {

    }

    @Override
    public void openURL() {

    }

    @Override
    public void shareURLViaWhatsApp() {

    }

    @Override
    public void rotate() {

    }
}

public class InterfaceDemo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your browser");
        String browserFromUser = scan.nextLine();
        Browser browser = null;

        if (browserFromUser.contains("Mobile")){
            browser = new ChromeMobile();
        }
        else if (browserFromUser.contains("Web")){
            if (browserFromUser.contains("Chrome")){
                browser = new ChromeWeb();
            }
            else {
                browser = new FireFoxWeb();
            }
        }

        browser.openBrowser();
        browser.openURL();
        browser.viewHistory();


    }
}
