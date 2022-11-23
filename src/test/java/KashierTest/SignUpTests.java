package KashierTest;

import Base.BaseTests;
import Data.ReadData;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.*;

public class SignUpTests extends BaseTests {
    @Test
    public void testSignupWithCommercialRegisterAndTaxCard(){
   String title= signUp.SignupWithCommercialRegisterAndTaxCard();
   assertEquals(title,"Payment Status");
    }
    @Test
    public void testSignUpWithoutCommercialRegisterAndTaxCard(){
        String title= signUp.SignUpWithoutCommercialRegisterAndTaxCard();
        assertEquals(title,"Payment Status");
    }
    @Test
    public void testCheckLogin(){
        String title=signUp.CheckLogin();
        assertEquals(title,"Login");
    }
    @Test
    public void testSignUpWithEmptyFields(){
        String title=signUp.SignUpWithEmptyFields();
        assertEquals(title,"Sign Up");
    }
    @Test
    public void testSignUpWithoutName(){
        String title=signUp.SignUpWithoutName();
        assertEquals(title,"Oops! There were some missing data!");
    }
    @Test
    public void testSignUpWithoutStoreName(){
        String title=signUp.SignUpWithoutStoreName();
        assertEquals(title,"Oops! There were some missing data!");
    }

    @Test(dataProviderClass = ReadData.class,dataProvider = "Data")
    public void testInvalidPhoneFormat(String name,String Storename,String Phone,String Email,String Password,String RPassword){
        String title=signUp.InvalidEmailFormat( name, Storename, Phone, Email, Password, RPassword);
        assertEquals(title,"Your mobile number is not valid");

    }
    @Test(dataProviderClass = ReadData.class,dataProvider = "Data")
    public void testInvalidEmailFormat(String name,String Storename,String Phone,String Email,String Password,String RPassword){
        String title=signUp.InvalidEmailFormat( name, Storename, Phone, Email, Password, RPassword);
       assertEquals(title,"Please make sure your email is in valid format");

    }
    @Test
    public void testSignUpWithExstingEmail(){
        String title=signUp.SignUpWithExstingEmail();
        assertEquals(title,"User already exists with the email provided");
    }

    @Test(dataProviderClass = ReadData.class,dataProvider = "Data")
    public void testInvalidPasswordFormat(String name,String Storename,String Phone,String Email,String Password,String RPassword){
        String title=signUp.InvalidPasswordFormat( name, Storename, Phone, Email, Password, RPassword);
        assertEquals(title,"include both lower & upper case");

    }

    @Test(dataProviderClass = ReadData.class,dataProvider = "Data")
    public void testDismatchPasswordFormat(String name,String Storename,String Phone,String Email,String Password,String RPassword){
        String title=signUp.DismatchPasswordFormat( name, Storename, Phone, Email, Password, RPassword);
        assertEquals(title,"Please enter the same value again.");

    }


}
