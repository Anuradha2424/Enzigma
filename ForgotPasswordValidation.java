package Enzigma;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ForgotPasswordValidation extends BaseClass  {
	public static void main(String[] args) throws InterruptedException  {
    //call all the  email module test cases
		emailTestCase1();
		emailTestCase2();
		emailTestCase3();
		emailTestCase4();
		emailTestCase5();
		emailTestCase6();
		emailTestCase7();
		emailTestCase8();
		emailTestCase9();
		
	//call all the  phone module test cases
		phoneTestCase1();
		phoneTestCase2();
		phoneTestCase3();
		phoneTestCase4();
		phoneTestCase5();
		phoneTestCase6();
		phoneTestCase7();
		phoneTestCase8();
		phoneTestCase9();
		
		
	}	

    public static void emailTestCase1() throws InterruptedException {
	
    preCondition();
	//click the forgot link
	driver.findElement(By.linkText("Forgot Password?")).click();
	String excepted_url="https://app-in1.nokodr.com/super/apps/core/v1/index.html#/enzipvlt/default/dashboard";
	//waiting condition
	Thread.sleep(2000);
	//pass the registered email
	driver.findElement(By.id("id_17367889792711712")).sendKeys("newareanuradha7@gmail.com");
	//click on proceed button
	driver.findElement(By.xpath("//div[@title='Proceed'] ")).click();
	// get success message when pass registered email
	WebElement success_message = driver.findElement(By.className("slds-text-heading_small"));
	String message = success_message.getText();
	System.out.println(message);
	//pass the OTP to reset password
    driver.findElement(By.id("id_17367901260362547")).sendKeys("528797");
    ////click on verify code button
    driver.findElement(By.xpath("//div[@title='Verify Code']")).click();
    //set a new password
    WebElement new_password = driver.findElement(By.id("id_17367912109406942"));
    new_password.sendKeys("Anuradha@123");
    WebElement confirm_password=driver.findElement(By.id("id_17367912109406942"));
    confirm_password .sendKeys("Anuradha@123");
    //click the confirm button
    driver.findElement(By.xpath("//div[@title='Confirm']")).click();
    String actual_url=driver.getCurrentUrl();
	if(excepted_url.equals(actual_url))
	{
		System.out.println("Password updated successfully!");
	}
	
	postCondition();
   }
   
    
    
    public static void emailTestCase2() throws InterruptedException{
    	
     preCondition();
    //click the forgot link
    driver.findElement(By.linkText("Forgot Password?")).click();
    //waiting condition
    Thread.sleep(2000);
	//pass the registered email
	driver.findElement(By.id("id_17367889792711712")).sendKeys("newareanuradha7@gmail.com");
	//click on proceed button
	driver.findElement(By.xpath("//div[@title='Proceed'] ")).click();
	// get success message when pass 
	WebElement success_message = driver.findElement(By.className("slds-text-heading_small"));
	String message=success_message.getText();
	System.out.println(message);
	//pass the OTP to reset password
    driver.findElement(By.id("id_17367901260362547")).sendKeys("528796");
    ////click on verify code button
    driver.findElement(By.xpath("//div[@title='Verify Code']")).click();
    //get error message when pass expired code
    WebElement error_message = driver.findElement(By.xpath("//div[@class='content-margin']/h2"));
    String message1 = error_message.getText();
    System.out.println(message1);
    
    postCondition();
    
    }
    
    public static void emailTestCase3() throws InterruptedException {
    	
    preCondition();
    String excepted_url="https://app-in1.nokodr.com/super/apps/core/v1/index.html#/enzipvlt/default/dashboard";
    //click the forgot link
    driver.findElement(By.linkText("Forgot Password?")).click();
    //waiting condition
    Thread.sleep(2000);
    //pass the registered email
  	driver.findElement(By.id("id_17367889792711712")).sendKeys("newareanuradha7@gmail.com");
  	//click on proceed button
  	driver.findElement(By.xpath("//div[@title='Proceed']")).click();
  	// get success message when pass 
  	WebElement success_message2= driver.findElement(By.className("slds-text-heading_small"));
  	String message=success_message2.getText();
  	System.out.println(message);
  	//pass the OTP to reset password
    driver.findElement(By.id("id_17367901260362547")).sendKeys("533813");
    //click on verify code button
    driver.findElement(By.xpath("//div[@title='Verify Code']")).click();
    //get error message when pass expired code
    WebElement error_message2 = driver.findElement(By.xpath("//div[@class='content-margin']/h2"));
    error_message2.getText();
    //click on resend code link
    driver.findElement(By.linkText(" Resend Code "));
    //pass the resended OTP to reset password
    driver.findElement(By.id("id_17367901260362547")).sendKeys("839436");
    //click on verify code button
    driver.findElement(By.xpath("//div[@title='Verify Code']")).click();
    //set a new password
    WebElement new_password1 = driver.findElement(By.id("id_17367912109406942"));
    new_password1.sendKeys("Anurag@123");
    WebElement confirm_password1=driver.findElement(By.id("id_17367912109406942"));
    confirm_password1.sendKeys("Anurag@123");
    String actual_url=driver.getCurrentUrl();
	if(excepted_url.equals(actual_url))
	{
		System.out.println("Password updated successfully!");
	}
	
    
    postCondition();
    }
    
    
    public static void emailTestCase4() throws InterruptedException{
    	
     preCondition();
    //click the forgot link
    driver.findElement(By.linkText("Forgot Password?")).click();
    //waiting condition
    Thread.sleep(2000);
    //pass the email
  	driver.findElement(By.id("id_17367889792711712")).sendKeys("newareanuradha7@gmail.com");
  	//click on proceed button
  	driver.findElement(By.xpath("//div[@title='Proceed'] ")).click();
  	//click on proceed button
  	driver.findElement(By.xpath("//div[@title='Proceed'] ")).click();
  	// get error message when pass unregistered email
  	WebElement errorMessage = driver.findElement(By.xpath("//h2[@class='slds-text-heading_small']"));
  	String message = errorMessage.getText();
  	System.out.println(message);
  	
  	postCondition();
  	
    }
  	
    public static void emailTestCase5()  throws InterruptedException {
    	
       preCondition();
      //click the forgot link
      driver.findElement(By.linkText("Forgot Password?")).click();
      //waiting condition
      Thread.sleep(2000);
      //pass the registered email
  	  driver.findElement(By.id("id_17367889792711712")).sendKeys("newareanuradha7@gmail.com");
  	  //click on proceed button
  	  driver.findElement(By.xpath("//div[@title='Proceed'] ")).click();
  	  // get success message when pass 
  	  WebElement success_message = driver.findElement(By.className("slds-text-heading_small"));
  	  String message=success_message.getText();
  	  System.out.println(message);
  	  //pass the OTP to reset password
      driver.findElement(By.id("id_17367901260362547")).sendKeys("528797");
      ////click on verify code button
      driver.findElement(By.xpath("//div[@title='Verify Code']")).click();
      //set a new password
      WebElement new_password = driver.findElement(By.id("id_17367912109406942"));
      new_password.sendKeys("Anuradha@123");
      WebElement confirm_password=driver.findElement(By.id("id_17367912109406942"));
      confirm_password .sendKeys("Anu@123");
      //click the confirm button
      driver.findElement(By.xpath("//div[@title='Confirm']")).click();
      //get error message when the password and confirm password is not same
      WebElement passwordIncorrect = driver.findElement(By.xpath("//div[@class='slds-has-error']/div"));
      String error_mess=passwordIncorrect.getText();
      System.out.println(error_mess);
      
      postCondition();
      
    }
      
    public static void emailTestCase6() throws InterruptedException {
    	
      preCondition();
      //click the forgot link
      driver.findElement(By.linkText("Forgot Password?")).click();
      //waiting condition
      Thread.sleep(2000);
      //pass the registered email
      driver.findElement(By.id("id_17367889792711712")).sendKeys("newareanuradha7@gmail.com");
      //click on proceed button
      driver.findElement(By.xpath("//div[@title='Proceed'] ")).click();
      // get success message when pass registered email
      WebElement success_message = driver.findElement(By.className("slds-text-heading_small"));
      String message=success_message.getText();
      System.out.println(message);
      //pass the OTP to reset password
      driver.findElement(By.id("id_17367901260362547")).sendKeys("528797");
      //click on verify code button
      driver.findElement(By.xpath("//div[@title='Verify Code']")).click();
      //set a new password 
      WebElement new_password = driver.findElement(By.id("id_17367912109406942"));
      new_password.sendKeys("Anu@123");
      //when we pass incorrect password format
      WebElement passwordIncorrect = driver.findElement(By.xpath("//div[@class='slds-has-error']/div"));
      String message1=passwordIncorrect.getText();
      System.out.println(message1);
      
      postCondition();
      
    }
        
    public static void emailTestCase7() throws InterruptedException {
    	
       preCondition();
      //click the forgot link
      driver.findElement(By.linkText("Forgot Password?")).click();
      //waiting condition
      Thread.sleep(2000);
      //pass the registered email
  	  driver.findElement(By.id("id_17367889792711712")).sendKeys("newareanuradha7@gmail.com");
  	  //click on proceed button
  	  driver.findElement(By.xpath("//div[@title='Proceed'] ")).click();
  	  // get success message when pass 
  	  WebElement success_message = driver.findElement(By.className("slds-text-heading_small"));
  	  String message1=success_message.getText();
  	  System.out.println(message1);
  	  //pass the OTP to reset password
      driver.findElement(By.id("id_17367901260362547")).sendKeys("528797");
      ////click on verify code button
      driver.findElement(By.xpath("//div[@title='Verify Code']")).click();
      //set a new password
      WebElement new_password = driver.findElement(By.id("id_17367912109406942"));
      new_password.sendKeys("Anuradha@123");
      WebElement confirm_password=driver.findElement(By.id("id_17367912109406942"));
      confirm_password .sendKeys("Anuradha@123");
      //click the confirm button
      driver.findElement(By.xpath("//div[@title='Confirm']")).click();
      //Get a error message is invalid verification code 
      WebElement error_message = driver.findElement(By.xpath("//div[@class='content-margin']/h2"));
      String message=error_message.getText();
      System.out.println(message);
      
      postCondition();
    }
      
      public static void emailTestCase8() throws InterruptedException {
    	
      preCondition();
      //click the forgot link
      driver.findElement(By.linkText("Forgot Password?")).click();
      //waiting condition
      Thread.sleep(2000);
      //pass the registered email
  	  driver.findElement(By.id("id_17367889792711712")).sendKeys("newareanuradha7@gmail.com");
  	  //click on proceed button
  	  driver.findElement(By.xpath("//div[@title='Proceed'] ")).click();
  	  // get success message when pass 
  	  WebElement success_message = driver.findElement(By.className("slds-text-heading_small"));
  	  String message=success_message.getText();
  	  System.out.println(message);
  	  //pass the OTP to reset password
      driver.findElement(By.id("id_17367901260362547")).sendKeys("528797");
      ////click on verify code button
      driver.findElement(By.xpath("//div[@title='Verify Code']")).click();
      //set a new password
      WebElement new_password = driver.findElement(By.id("id_17367912109406942"));
      new_password.sendKeys("Anuradha@123");
      WebElement confirm_password=driver.findElement(By.id("id_17367912109406942"));
      confirm_password .sendKeys("Anuradha@123");
      //click the confirm button
      driver.findElement(By.xpath("//div[@title='Confirm']")).click();
      //Get a error when new password same as the previous password
      WebElement error_message = driver.findElement(By.xpath("//div[@class='content-margin']/h2"));
      String message1=error_message.getText();
      System.out.println(message1);
      
      postCondition();
      }
      
      public static void emailTestCase9()  throws InterruptedException {
    		
      preCondition();
      //click the forgot link
      driver.findElement(By.linkText("Forgot Password?")).click();
      String excepted_url="https://app-in1.nokodr.com/super/apps/core/v1/index.html#/enzipvlt/default/dashboard";
      //waiting condition
      Thread.sleep(2000);
      //pass the registered email
  	  driver.findElement(By.id("id_17367889792711712")).sendKeys("newareanuradha7@gmail.com");
  	  //click on proceed button
  	  driver.findElement(By.xpath("//div[@title='Proceed'] ")).click();
  	  // get success message when pass 
  	  WebElement success_message = driver.findElement(By.className("slds-text-heading_small"));
  	  success_message.getText();
  	  //pass the OTP to reset password
      driver.findElement(By.id("id_17367901260362547")).sendKeys("528797");
      ////click on verify code button
      driver.findElement(By.xpath("//div[@title='Verify Code']")).click();
      //set a new password
      WebElement new_password = driver.findElement(By.id("id_17367912109406942"));
      new_password.sendKeys("Anuradha@123");
      WebElement confirm_password=driver.findElement(By.id("id_17367912109406942"));
      confirm_password .sendKeys("Anuradha@123");
      //click the confirm button
      driver.findElement(By.xpath("//div[@title='Confirm']")).click();
      //Get a error message is invalid verification code 
      WebElement error_message = driver.findElement(By.xpath("//div[@class='content-margin']/h2"));
      String message=error_message.getText();
      System.out.println(message);
      //try with new password
      //set a new password
      WebElement new_password1 = driver.findElement(By.id("id_17367912109406942"));
      new_password1.sendKeys("Chakuli@123");
      WebElement confirm_password1=driver.findElement(By.id("id_17367912109406942"));
      confirm_password1 .sendKeys("Chakuli@123");
      //click the confirm button
      driver.findElement(By.xpath("//div[@title='Confirm']")).click();
      String actual_url=driver.getCurrentUrl();
  	  if(excepted_url.equals(actual_url))
  	   {
  		System.out.println("Password updated successfully!");
  	   }
        postCondition();
        
      }
    
    
    public static void phoneTestCase1() throws InterruptedException{
    	
    preCondition();
    driver.findElement(By.linkText("Forgot Password?")).click();
    String excepted_url="https://app-in1.nokodr.com/super/apps/core/v1/index.html#/enzipvlt/default/dashboard";
    
    //click on phone
    driver.findElement(By.xpath("//span[@title='Phone']")).click();
    //pass the registered mobile number
	driver.findElement(By.id("id_17367971893572411")).sendKeys("9209169248");
	//click on proceed button
	driver.findElement(By.xpath("//div[@title='Proceed'] ")).click();
	// get success message when pass 
    WebElement success_message = driver.findElement(By.className("slds-text-heading_small"));
    String message=success_message.getText();
    System.out.println(message);
    //pass the OTP to reset password
    driver.findElement(By.id("id_17367901260362547")).sendKeys("541667");
    ////click on verify code button
    driver.findElement(By.xpath("//div[@title='Verify Code']")).click();
    //set a new password
    WebElement new_password = driver.findElement(By.id("id_17367912109406942"));
    new_password.sendKeys("Neware@987");
    WebElement confirm_password=driver.findElement(By.id("id_17367912109406942"));
    confirm_password .sendKeys("Neware@987@123");
    //click the confirm button
    driver.findElement(By.xpath("//div[@title='Confirm']")).click();
    String actual_url=driver.getCurrentUrl();
	if(excepted_url.equals(actual_url))
	{
		System.out.println("Password updated successfully!");
	}
	
	postCondition(); 
    
    }
    
    
    public static void phoneTestCase2() throws InterruptedException{
    	
        preCondition();
        driver.findElement(By.linkText("Forgot Password?")).click();
        //click on phone
        driver.findElement(By.xpath("//span[@title='Phone']")).click();
        //waiting condition
        Thread.sleep(2000);
        
        //pass the registered mobile number
    	driver.findElement(By.id("id_17367971893572411")).sendKeys("9209169248");
    	//click on proceed button
    	driver.findElement(By.xpath("//div[@title='Proceed'] ")).click();
    	// get success message when pass registered phone number
        WebElement success_message = driver.findElement(By.className("slds-text-heading_small"));
        String message=success_message.getText();
        System.out.println(message);
        //pass the OTP to reset password
        driver.findElement(By.id("id_17367901260362547")).sendKeys("528797");
        //click on verify code button
        driver.findElement(By.xpath("//div[@title='Verify Code']")).click();
        //set a new password 
        WebElement new_password = driver.findElement(By.id("id_17367912109406942"));
        new_password.sendKeys("Anu@987");
        //when we pass incorrect password format
        WebElement passwordIncorrect = driver.findElement(By.xpath("//div[@class='slds-has-error']/div"));
        String message1=passwordIncorrect.getText();
        System.out.println(message1);
        
        postCondition();
    
    }
    
    
    
      public static void phoneTestCase3() throws InterruptedException{
    	
        preCondition();
        driver.findElement(By.linkText("Forgot Password?")).click();
        //click on phone
        driver.findElement(By.xpath("//span[@title='Phone']")).click();
        //waiting condition
        Thread.sleep(2000);
        
        //pass the registered mobile number
    	driver.findElement(By.id("id_17367971893572411")).sendKeys("9209169248");
    	//click on proceed button
    	driver.findElement(By.xpath("//div[@title='Proceed'] ")).click();
    	// get success message when pass registered phone number
        WebElement success_message = driver.findElement(By.className("slds-text-heading_small"));
        String message=success_message.getText();
        System.out.println(message);
        //pass the OTP to reset password
        driver.findElement(By.id("id_17367901260362547")).sendKeys("528797");
        ////click on verify code button
        driver.findElement(By.xpath("//div[@title='Verify Code']")).click();
        //set a new password
        WebElement new_password = driver.findElement(By.id("id_17367912109406942"));
        new_password.sendKeys("Mummy@987");
        WebElement confirm_password=driver.findElement(By.id("id_17367912109406942"));
        confirm_password .sendKeys("Mummy@987");
        //click the confirm button
        driver.findElement(By.xpath("//div[@title='Confirm']")).click();
        //Get a error message is invalid verification code 
        WebElement error_message = driver.findElement(By.xpath("//div[@class='content-margin']/h2"));
        String message1=error_message.getText();
        System.out.println(message1);
        
        postCondition();
        
        
      }
    
    
      public static void phoneTestCase4() throws InterruptedException{
      	
        preCondition();
        String excepted_url="https://app-in1.nokodr.com/super/apps/core/v1/index.html#/enzipvlt/default/dashboard";
        driver.findElement(By.linkText("Forgot Password?")).click();
        //click on phone
        driver.findElement(By.xpath("//span[@title='Phone']")).click();
        //waiting condition
        Thread.sleep(2000);
          
        //pass the registered mobile number
      	driver.findElement(By.id("id_17367971893572411")).sendKeys("9209169248");
      	//click on proceed button
      	driver.findElement(By.xpath("//div[@title='Proceed'] ")).click();
        // get success message when pass registered phone number
        WebElement success_message = driver.findElement(By.className("slds-text-heading_small"));
        String message=success_message.getText();
        System.out.println(message);
        //pass the OTP to reset password
        driver.findElement(By.id("id_17367901260362547")).sendKeys("541647");
        //click on verify code button
        driver.findElement(By.xpath("//div[@title='Verify Code']")).click();
        //get error message when pass expired code
        WebElement error_message2 = driver.findElement(By.xpath("//div[@class='content-margin']/h2"));
        error_message2.getText();
        //click on resend code link
        driver.findElement(By.linkText(" Resend Code "));
        //pass the resended OTP to reset password
        driver.findElement(By.id("id_17367901260362547")).sendKeys("839436");
        //click on verify code button
        driver.findElement(By.xpath("//div[@title='Verify Code']")).click();
        //set a new password
        WebElement new_password1 = driver.findElement(By.id("id_17367912109406942"));
        new_password1.sendKeys("AnuradhaN@123");
        WebElement confirm_password1=driver.findElement(By.id("id_17367912109406942"));
        confirm_password1.sendKeys("AnuradhaN@123");
        String actual_url=driver.getCurrentUrl();
    	if(excepted_url.equals(actual_url))
    	{
    		System.out.println("Password updated successfully!");
    	}
        
      	
      	postCondition();
      	
      }
      
      
      public static void phoneTestCase5() throws InterruptedException{
      	
        preCondition();
        driver.findElement(By.linkText("Forgot Password?")).click();
        //click on phone
        driver.findElement(By.xpath("//span[@title='Phone']")).click();
        //waiting condition
        Thread.sleep(2000); 
        //pass the registered mobile number
      	driver.findElement(By.id("id_17367971893572411")).sendKeys("9209169248");
      	//click on proceed button
      	driver.findElement(By.xpath("//div[@title='Proceed'] ")).click();
        // get error message when pass unregistered phone number
      	WebElement errorMessage = driver.findElement(By.xpath("//h2[@class='slds-text-heading_small']"));
      	String message = errorMessage.getText();
      	System.out.println(message);
      	
      	postCondition();
    
      }
      
      public static void phoneTestCase6() throws InterruptedException{
        	
          preCondition();
          String excepted_url="https://app-in1.nokodr.com/super/apps/core/v1/index.html#/enzipvlt/default/dashboard";
          driver.findElement(By.linkText("Forgot Password?")).click();
          //click on phone
          driver.findElement(By.xpath("//span[@title='Phone']")).click();
          //waiting condition
          Thread.sleep(2000);
            
          //pass the registered mobile number
          driver.findElement(By.id("id_17367971893572411")).sendKeys("9209169248");
          //click on proceed button
          driver.findElement(By.xpath("//div[@title='Proceed'] ")).click();
          // get success message when pass registered phone number
          WebElement success_message = driver.findElement(By.className("slds-text-heading_small"));
          String message=success_message.getText();
          System.out.println(message);
        //pass the OTP to reset password
          driver.findElement(By.id("id_17367901260362547")).sendKeys("650537");
          ////click on verify code button
          driver.findElement(By.xpath("//div[@title='Verify Code']")).click();
          //set a new password
          WebElement new_password = driver.findElement(By.id("id_17367912109406942"));
          new_password.sendKeys("Ajinkya@987");
          WebElement confirm_password=driver.findElement(By.id("id_17367912109406942"));
          confirm_password .sendKeys("Ajinkya@987");
          //click the confirm button
          driver.findElement(By.xpath("//div[@title='Confirm']")).click();
          //Get a error message is invalid verification code 
          WebElement error_message = driver.findElement(By.xpath("//div[@class='content-margin']/h2"));
          String message1=error_message.getText();
          System.out.println(message1);
          //try with new password
          //set a new password
          WebElement new_password1 = driver.findElement(By.id("id_17367912109406942"));
          new_password1.sendKeys("Radha@123");
          WebElement confirm_password1=driver.findElement(By.id("id_17367912109406942"));
          confirm_password1 .sendKeys("Radha@123");
          //click the confirm button
          driver.findElement(By.xpath("//div[@title='Confirm']")).click();
          String actual_url=driver.getCurrentUrl();
      	  if(excepted_url.equals(actual_url))
      	   {
      		System.out.println("Password updated successfully!");
      	   }
      	  
      	  preCondition();
          
      }
      
      
      public static void phoneTestCase7() throws InterruptedException{
      	
          preCondition();
          driver.findElement(By.linkText("Forgot Password?")).click();
          //click on phone
          driver.findElement(By.xpath("//span[@title='Phone']")).click();
          //waiting condition
          Thread.sleep(2000);
            
          //pass the registered mobile number
          driver.findElement(By.id("id_17367971893572411")).sendKeys("9209169248");
          //click on proceed button
          driver.findElement(By.xpath("//div[@title='Proceed'] ")).click();
          // get success message when pass registered phone number
          WebElement success_message = driver.findElement(By.className("slds-text-heading_small"));
          String message=success_message.getText();
          System.out.println(message);
          //pass the OTP to reset password
          driver.findElement(By.id("id_17367901260362547")).sendKeys("980442");
          ////click on verify code button
          driver.findElement(By.xpath("//div[@title='Verify Code']")).click();
          //get error message when pass expired code
          WebElement error_message = driver.findElement(By.xpath("//div[@class='content-margin']/h2"));
          String message1 = error_message.getText();
          System.out.println(message1);
          
          postCondition();
          
          
      }
      
      
      public static void phoneTestCase8() throws InterruptedException{
        	
          preCondition();
          driver.findElement(By.linkText("Forgot Password?")).click();
          //click on phone
          driver.findElement(By.xpath("//span[@title='Phone']")).click();
          //waiting condition
          Thread.sleep(2000);
            
          //pass the registered mobile number
          driver.findElement(By.id("id_17367971893572411")).sendKeys("9209169248");
          //click on proceed button
          driver.findElement(By.xpath("//div[@title='Proceed'] ")).click();
          // get success message when pass registered phone number
          WebElement success_message = driver.findElement(By.className("slds-text-heading_small"));
          String message=success_message.getText();
          System.out.println(message);
        //pass the OTP to reset password
          driver.findElement(By.id("id_17367901260362547")).sendKeys("528797");
          ////click on verify code button
          driver.findElement(By.xpath("//div[@title='Verify Code']")).click();
          //set a new password
          WebElement new_password = driver.findElement(By.id("id_17367912109406942"));
          new_password.sendKeys("AnuradhaN@123");
          WebElement confirm_password=driver.findElement(By.id("id_17367912109406942"));
          confirm_password .sendKeys("AnuradhaN@123");
          //click the confirm button
          driver.findElement(By.xpath("//div[@title='Confirm']")).click();
          //Get a error when new password same as the previous password
          WebElement error_message = driver.findElement(By.xpath("//div[@class='content-margin']/h2"));
          String message1=error_message.getText();
          System.out.println(message1);
          
          postCondition();
          
          
      }
    
      
      public static void phoneTestCase9() throws InterruptedException{
        	
          preCondition();
          driver.findElement(By.linkText("Forgot Password?")).click();
          //click on phone
          driver.findElement(By.xpath("//span[@title='Phone']")).click();
          //waiting condition
          Thread.sleep(2000);
            
          //pass the registered mobile number
          driver.findElement(By.id("id_17367971893572411")).sendKeys("9209169248");
          //click on proceed button
          driver.findElement(By.xpath("//div[@title='Proceed'] ")).click();
          // get success message when pass registered phone number
          WebElement success_message = driver.findElement(By.className("slds-text-heading_small"));
          String message=success_message.getText();
          System.out.println(message);
          
          //pass the OTP to reset password
          driver.findElement(By.id("id_17367901260362547")).sendKeys("527687");
          ////click on verify code button
          driver.findElement(By.xpath("//div[@title='Verify Code']")).click();
          //set a new password
          WebElement new_password = driver.findElement(By.id("id_17367912109406942"));
          new_password.sendKeys("Anuradha@876");
          WebElement confirm_password=driver.findElement(By.id("id_17367912109406942"));
          confirm_password .sendKeys("Anu@876");
          //click the confirm button
          driver.findElement(By.xpath("//div[@title='Confirm']")).click();
          //get error message when the password and confirm password is not same
          WebElement passwordIncorrect = driver.findElement(By.xpath("//div[@class='slds-has-error']/div"));
          String error_mess=passwordIncorrect.getText();
          System.out.println(error_mess);
          
          postCondition();
          
          
      }

}

