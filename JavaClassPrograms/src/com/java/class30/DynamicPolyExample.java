package com.java.class30;

import java.util.Scanner;

class Browser{
    void openWebsite(){
        System.out.println("Opening Website");
    }
    void createLogin(){
        System.out.println("Logging in");
    }
    void logout(){
        System.out.println("Logging out");
    }
}
class Chrome extends Browser{

}

class FireFox extends Browser{

}

public class DynamicPolyExample {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter browser:");
        String browser = scan.nextLine();

        Browser browser1 = null;

        if (browser.trim().equalsIgnoreCase("Chrome")){
//            Chrome chrome = new Chrome();
//            chrome.openWebsite();
//            chrome.createLogin();
//            chrome.logout();

            browser1 = new Chrome();

        }
        else if (browser.trim().equalsIgnoreCase("Fire Fox")){
//            FireFox fireFox = new FireFox();
//            fireFox.openWebsite();
//            fireFox.createLogin();
//            fireFox.logout();

            browser1 = new FireFox();
        }
        else {
//            System.err.println("Invalid browser specified");
            throw new RuntimeException("Invalid browser specified"); // if you want to stop after this message
        }

        browser1.openWebsite();
        browser1.createLogin();
        browser1.logout();
    }
}
