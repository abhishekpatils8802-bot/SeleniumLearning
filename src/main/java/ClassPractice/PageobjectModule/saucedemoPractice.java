package ClassPractice.PageobjectModule;

import ClassPractice.PageobjectModule.DriverrManager.*;
import org.openqa.selenium.edge.EdgeDriver;

public class saucedemoPractice {
    public static void main(String[] args) {
        EdgeDriver driver=new EdgeDriver();
        OpenUrlMaxi.OpenUrl(driver,"https://www.saucedemo.com/");
        OpenUrlMaxi.Maximize(driver);
        loginpage.Login(driver,"standard_user","secret_sauce");
        AddtoCart_Tc02.Addtocart(driver);
        Cartbutton.Cart(driver);
        Checkout.Checkout(driver);
        CustomerDetails.Details(driver,"Abhishek","Patil",415212);
        FinalFinish.Finish(driver);
        JanaToPadega.BacktoHome(driver);
    }
}
