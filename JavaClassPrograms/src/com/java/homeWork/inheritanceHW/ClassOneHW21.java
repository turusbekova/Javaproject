package com.java.homeWork.inheritanceHW;
class Page {
    private boolean pageLoaded;

    public Page() {
        System.out.println("Page constructor called.");
    }

    public void loadPage() {
        this.pageLoaded = true;
    }

    public boolean isPageLoaded() {
        return this.pageLoaded;
    }
}

class LoginPage extends Page {
    public void doLogin() {
        System.out.println("Perform Login");
    }

    public void logout() {
        System.out.println("Perform logout");
    }
}

class HomePage extends Page {
    public void openHomePage() {
        System.out.println("Open HomePage");
    }

    public void verifyLogo() {
        System.out.println("Verify Logo");
    }
}

 class MainClass {
    public static void main(String[] args) {
        LoginPage loginPage = new LoginPage();
        loginPage.loadPage();
        loginPage.doLogin();
        loginPage.logout();

        HomePage homePage = new HomePage();
        homePage.loadPage();
        homePage.openHomePage();
        homePage.verifyLogo();
    }
}



public class ClassOneHW21 {
//    Task 1:
//    Create a class called Page & have 2 methods loadPage() & isPageLoaded()
//    Create a no argument Constructor in the Page class & print message in the Constructor
//    Create a child class called LoginPage that extends Page class
//    Create methods - doLogin(), logout() in the LoginPage
//    Create a child class HomePage that extends Page class
//    Create methods - openHomePage(), verifyLogo() in the HomePage
//    Create MainClass
//    Create an object of LoginPage and call method doLogin() and logout()
//    Create an object of HomePage and call method openHomePage(),
//    verifyLogo()


}
