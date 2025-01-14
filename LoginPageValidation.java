package Enzigma;
import org.openqa.selenium.*;

public class LoginPageValidation extends BaseClass {
	
    public static void main(String[] args) throws InterruptedException {
   
        // Test Phone Module
        
        //test case 1
        preCondition();
        LoginPageValidation.testPhoneLogin("9209169248", "Ajinkya@987"); //valid detail :pass registered phone number and password
        postCondition();
        //waiting condition
        Thread.sleep(2000);
        //test case 2
        preCondition();
        LoginPageValidation.testPhoneLogin("9209169248", ""); // Invalid detail: Pass empty password
        postCondition();
        //waiting condition
        Thread.sleep(2000);
        //test case 3
        preCondition();
        LoginPageValidation.testPhoneLogin("", "Ajinkya@987"); // Invalid detail: Pass empty phone number
        postCondition();
        //waiting condition
        Thread.sleep(2000);
        //test case 4
        preCondition();
        LoginPageValidation.testPhoneLogin("9209169248", "ajinkya@987"); // Invalid detail: Pass Incorrect password
        postCondition();
        //waiting condition
        Thread.sleep(2000);
        //test case 5
        preCondition();
        LoginPageValidation.testPhoneLogin("9209169249", "ajinkya@987");  //Invalid detail: Pass unregistered phone number
        postCondition();
        //waiting condition
        Thread.sleep(2000);
        //test case 6
        preCondition();
        LoginPageValidation.testPhoneLogin("92091692", "ajinkya@987");  //Invalid detail: Pass invalid phone number 
        postCondition();
        //waiting condition
        Thread.sleep(2000);
        //test case 7
        preCondition();
        LoginPageValidation.testPhoneLogin("9209169249", "Ajinkya987"); //Invalid detail :Password invalid
        postCondition();
        //waiting condition
        Thread.sleep(2000);

        // Test Email Module
        //test case1
        preCondition();
        LoginPageValidation.testEmailLogin("newareanuradha7@gmail.com", "Ajinkya@987");  // Valid detail :Registered email id and correct password
        postCondition();
        //waiting condition
        Thread.sleep(2000);
        //test case 2
        preCondition();
        LoginPageValidation.testEmailLogin("newareanu@1gmail.com", ""); // Invalid detail: Pass empty password
        postCondition();
        //waiting condition
        Thread.sleep(2000);
        //test case 3
        preCondition();
        LoginPageValidation.testEmailLogin("", "Ajinkya@987"); // Invalid detail:Pass empty email
        postCondition();
        //waiting condition
        Thread.sleep(2000);
        //test case 4
        preCondition();
        LoginPageValidation.testEmailLogin("newareanuradha7@gmail.com", "ajinkya@987"); // Invalid detail: Pass incorrect or invalid password
        postCondition();
        //waiting condition
        Thread.sleep(2000);
        //test case 5
        preCondition();
        LoginPageValidation.testEmailLogin("newreanugmail.com", "Ajinkya@987"); //Invalid detail :Pass invalid email missing the @ symbol
        postCondition();
        //waiting condition
        Thread.sleep(2000);
        //test case 6
        preCondition();
        LoginPageValidation.testEmailLogin("newareanu@gmail.", "Ajinkya@987"); //Invalid detail :Pass invalid email missing domain
        postCondition();
        //waiting condition
        Thread.sleep(2000);
        //test case 7
        preCondition();
        LoginPageValidation.testEmailLogin("newareanu@.com", "Ajinkya@987");  //Invalid detail : Pass invalid email
        postCondition();
        //waiting condition
        Thread.sleep(2000);
        
        
        
        // Test Password Module
    
        //test case1
        preCondition();
        LoginPageValidation.testPasswordLogin("newareanuradha7@gmail.com", "Ajinkya@987");  // Valid detail :Pass registered email id and correct password
        postCondition();
        //waiting condition
        Thread.sleep(2000);
        //test case2
        preCondition();
        LoginPageValidation.testPasswordLogin("newareanuradha7@gmail.com", ""); // Invalid detail: Pass empty password
        postCondition();
        //waiting condition
        Thread.sleep(2000);
        //test case3
        preCondition();
        LoginPageValidation.testPasswordLogin("", "Ajinkya@987"); // Invalid detail: Pass empty email
        postCondition();
        //waiting condition
        Thread.sleep(2000);
        //test case4
        preCondition();
        LoginPageValidation.testPasswordLogin("newareanuradha7@gmail.com", "Ajinkya987"); // Invalid detail: Pass invalid password
        postCondition();
        //waiting condition
        Thread.sleep(2000);
        //test case5
        preCondition();
        LoginPageValidation.testPasswordLogin("newareanu@.com", "Ajinkya@987");  //Invalid detail : Pass invalid email
        postCondition();
        //waiting condition
        Thread.sleep(2000);
        //test case6
        preCondition();
        LoginPageValidation.testPasswordLogin("newareanu@gmail.", "Ajinkya@987");  //Invalid detail :Pass invalid email missing domain
        postCondition();
        //waiting condition
        Thread.sleep(2000);
        //test case7
        preCondition();
        LoginPageValidation.testPasswordLogin("newreanugmail.com", "Ajinkya@987"); //Invalid detail :Pass invalid email missing the @ symbol
        postCondition();
        //waiting condition
        Thread.sleep(2000);
      

        
        // Test OTP Module
        
        //test case1
        preCondition();
        LoginPageValidation.testOTPLogin("newareanuradha7@gmail.com", "337883"); // Valid detail:Pass valid data
        postCondition();
        //waiting condition
        Thread.sleep(2000);
        //test case2
        preCondition();
        LoginPageValidation.testOTPLogin("newareanuradha7@gmail.com", ""); // Invalid detail: Pass empty OTP
        postCondition();
        //waiting condition
        Thread.sleep(2000);
        //test case 3
        preCondition();
        LoginPageValidation.testOTPLogin("", "841342"); // Invalid detail: Pass empty email
        postCondition();
        //waiting condition
        Thread.sleep(2000);
        //test case 4
        preCondition();
        LoginPageValidation.testOTPLogin("newareanuradha7@gmail.com", "337882"); // Invalid detail: Pass invalid OTP
        postCondition();
        //waiting condition
        Thread.sleep(2000);
        //test case 5
        preCondition();
        LoginPageValidation.testOTPLogin("newareanuradha7gmail.com", ""); // Invalid detail: Pass invalid email missing @ symbol
        postCondition();
        //waiting condition
        Thread.sleep(2000);
        //test case 6
        preCondition();
        LoginPageValidation.testOTPLogin("newareanuradha7@gmail.", ""); // Invalid detail: Pass invalid email missing domain name
        postCondition();
        //waiting condition
        Thread.sleep(2000);
    }
  
    // Method to validate text field is present or not
    public static void validateTextField(WebElement element, String fieldName) {
 
        try {
            if (element.isDisplayed() && element.isEnabled()) {
                System.out.println(fieldName + " is present and enabled.");
            } else {
                System.out.println(fieldName + " is not displayed or enabled.");
            }
        } catch (NoSuchElementException e) {
            System.out.println(fieldName + " is not present.");
        }
    }

    // Method to test valid and invalid input for the Phone module
    public static void testPhoneLogin(String phone, String otp) {
    	
        WebElement phoneField = driver.findElement(By.id("phone"));
        WebElement otpField = driver.findElement(By.xpath("//input[@name='otp']"));
        WebElement sendCode = driver.findElement(By.xpath("//div[@title='Send Code']"));
        WebElement logIn= driver.findElement(By.id("//div[@title='Log In']"));
        
        phoneField.clear();
        phoneField.sendKeys(phone);
        sendCode.click();
        otpField.clear();
        sendCode.click();
        otpField.sendKeys(otp);
        logIn.click();

        String excepted_url="https://app-in1.nokodr.com/super/apps/core/v1/index.html#/enzipvlt/default/dashboard";
        try {
        	String actual_url = driver.getCurrentUrl();
            if(excepted_url.equals(actual_url)) {
           System.out.println("Login Successfully");
            }
        } catch (Exception e) {
            WebElement errorMessage = driver.findElement(By.xpath("//h2[@class='slds-text-heading_small']"));
            System.out.println("Login Failed: " + errorMessage.getText());
        }
    }

    // Method to test valid and invalid input for the Email module
    public static void testEmailLogin(String email, String password) {
    	
        //click on email for login details
        WebElement emailClick = driver.findElement(By.xpath("//span[@title='Email']"));
        emailClick.click();
        WebElement emailField = driver.findElement(By.xpath("//input[@type='email']"));
        WebElement passwordField = driver.findElement(By.xpath("//input[@type='password']"));
        WebElement logIn= driver.findElement(By.id("//div[@title='Log In']"));

        emailField.clear();
        emailField.sendKeys(email);
        passwordField.clear();
        passwordField.sendKeys(password);
        logIn.click();

        String excepted_url="https://app-in1.nokodr.com/super/apps/core/v1/index.html#/enzipvlt/default/dashboard";
        try {
        	String actual_url = driver.getCurrentUrl();
            if(excepted_url.equals(actual_url)) {
           System.out.println("Login Successfully");
            }
        } catch (Exception e) {
            WebElement errorMessage = driver.findElement(By.xpath("//h2[@class='slds-text-heading_small']"));
            System.out.println("Login Failed: " + errorMessage.getText());
        }
    }

    // Method to test valid and invalid input for the Password module
    public static void testPasswordLogin(String email, String password) {
    	
    	//click on password for login details
        WebElement Password = driver.findElement(By.xpath("//span[@title='Password']"));
        Password.click();
        WebElement emailField = driver.findElement(By.xpath("//input[@type='email']"));
        WebElement passwordField = driver.findElement(By.xpath("//input[@type='password']"));
        WebElement logIn= driver.findElement(By.id("//div[@title='Log In']"));
        
        emailField.clear();
        emailField.sendKeys(email);
        passwordField.clear();
        passwordField.sendKeys(password);
        logIn.click();

       
        String excepted_url="https://app-in1.nokodr.com/super/apps/core/v1/index.html#/enzipvlt/default/dashboard";
             try {
             	String actual_url = driver.getCurrentUrl();
                 if(excepted_url.equals(actual_url)) {
                System.out.println("Login Successfully");
                 }
        } catch (Exception e) {
            WebElement errorMessage = driver.findElement(By.xpath("//h2[@class='slds-text-heading_small']"));
            System.out.println("Login Failed: " + errorMessage.getText());
        }
    }

    // Method to test valid and invalid input for the OTP module
    public static void testOTPLogin(String email, String otp) {
    	
    	//click on OTP for login details
        WebElement OTP= driver.findElement(By.xpath("//span[@title='OTP']"));
        OTP.click();
        WebElement emailField = driver.findElement(By.xpath("//input[@type='email']"));
        WebElement otpField = driver.findElement(By.xpath("//input[@name='otp']"));
        WebElement sendCode = driver.findElement(By.xpath("//div[@title='Send Code']"));
        WebElement logIn= driver.findElement(By.id("//div[@title='Log In']"));
        emailField.clear();
        emailField.sendKeys(email);
        otpField.clear();
        sendCode.click();
        otpField.sendKeys(otp);
        logIn.click();

        String excepted_url="https://app-in1.nokodr.com/super/apps/core/v1/index.html#/enzipvlt/default/dashboard";
        try {
        	String actual_url = driver.getCurrentUrl();
            if(excepted_url.equals(actual_url)) {
           System.out.println("Login Successfully");
            }
        } catch (Exception e) {
            WebElement errorMessage = driver.findElement(By.xpath("//h2[@class='slds-text-heading_small']"));
            System.out.println("Login Failed: " + errorMessage.getText());
        }
    }
}

