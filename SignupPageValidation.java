package Enzigma;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

class SignupPageValidation extends BaseClass{
	public static void main(String[] args) throws InterruptedException {
		//call the email module test scripts
		  signupUsingEmail();
		  signupUsingEmail1();
		  emailtestCase1();
		  emailtestCase2();
		  emailtestCase3();
		  emailtestCase4();
		  emailtestCase5();
		  emailtestCase6();
		  emailtestCase7();
		  emailtestCase8();
		  emailtestCase9();
		  emailtestCase10();
		  
		//call the email module test scripts
		  signupUsingPhone();
		  signupUsingPhone1();
		  phoneTestCase1();
		  phoneTestCase2();
		  phoneTestCase3();
		  phoneTestCase4();
		  phoneTestCase5();
		  phoneTestCase6();
		  phoneTestCase7();
		  phoneTestCase8();
		  phoneTestCase9();
		  phoneTestCase10();
		  
		  
	    
	}
	
	 //email module scenario 
	 public static void emailModule() throws InterruptedException {	
		 
      preCondition();
      //click the sign up link
      driver.findElement(By.linkText("Sign up")).click();
      //pass email
      driver.findElement(By.xpath("//input[@type='email']")).sendKeys("newareanuradha7@gmail.com");
      //click checkbox
      driver.findElement(By.className("slds-checkbox_faux")).click();
      //click the proceed button
      driver.findElement(By.className("slds-button slds-button_brand")).click();
      //get a popup : verification code sent successfully
      WebElement verfCode_sent=driver.findElement(By.xpath("//h2[@class='slds-text-heading_small']"));
      String code = verfCode_sent.getText();
      System.out.println(code);
      //pass the OTP
      driver.findElement(By.id("id_17368049630897033")).sendKeys("584637");
      //click on verify button
      driver.findElement(By.xpath("//div[@title='Verify Code']")).click();
      
     
  	  postCondition();
	 }
	 
	 public static void signupUsingEmail() throws InterruptedException {
		 
		  preCondition();
		  //click the sign up link
	      driver.findElement(By.linkText("Sign up")).click();
	      //pass empty email
	      driver.findElement(By.xpath("//input[@type='email']")).sendKeys("");
	      //click checkbox
	      driver.findElement(By.className("slds-checkbox_faux")).click();
	      //click the proceed button
	      driver.findElement(By.className("slds-button slds-button_brand")).click();
	      //get a error when we pass blank input field
	      WebElement error = driver.findElement(By.xpath("//h2[@class='slds-text-heading_small']"));
	      String message=error.getText();
	      System.out.println(message);
	      
	      postCondition();
	 }
	 
	 public static void signupUsingEmail1() throws InterruptedException {
		 
		  preCondition();
		  //click the sign up link
	      driver.findElement(By.linkText("Sign up")).click();
	      //pass empty email
	      driver.findElement(By.xpath("//input[@type='email']")).sendKeys("");
	      //click checkbox
	      driver.findElement(By.className("slds-checkbox_faux")).click();
	      //click the proceed button
	      driver.findElement(By.className("slds-button slds-button_brand"));
	      //error occured when we not accept the terms and condition
	      WebElement error = driver.findElement(By.xpath("//h2[@class='slds-text-heading_small']"));
	      String message=error.getText();
	      System.out.println(message);
	      postCondition();
	      
	 }
	 
	 
	 
	 
	 public static void emailtestCase1() throws InterruptedException {	
		 
	      preCondition();
	      //click the sign up link
	      driver.findElement(By.linkText("Sign up")).click();
	      //pass email
	      driver.findElement(By.xpath("//input[@type='email']")).sendKeys("newareanuradha7@gmail.com");
	      //click checkbox
	      driver.findElement(By.className("slds-checkbox_faux")).click();
	      //click the proceed button
	      driver.findElement(By.className("slds-button slds-button_brand")).click();
	      //get a error when pass registered email
	      WebElement error = driver.findElement(By.xpath("//div[@class='slds-notify__content']/div/h2"));
	      String message = error.getText();
	      System.out.println(message);
	      
	      postCondition();
   }
	 
	 public static void emailtestCase2() throws InterruptedException {	
		 
	      preCondition();
	      //click the sign up link
	      driver.findElement(By.linkText("Sign up")).click();
	      //pass email
	      driver.findElement(By.xpath("//input[@type='email']")).sendKeys("newareanuradha7@gmail.com");
	      //click checkbox
	      driver.findElement(By.className("slds-checkbox_faux")).click();
	      //click the proceed button
	      driver.findElement(By.className("slds-button slds-button_brand")).click();
	      //get a popup :  verification code sent successfully
	      WebElement verfCode_sent=driver.findElement(By.xpath("//h2[@class='slds-text-heading_small']"));
	      String code = verfCode_sent.getText();
	      System.out.println(code);
	      //pass the OTP
	      driver.findElement(By.id("id_17368049630897033")).sendKeys("584637");
	      //click on verify button
	      driver.findElement(By.xpath("//div[@title='Verify Code']")).click();
	      //get a error when pass invalid or expired OTP
	      WebElement error = driver.findElement(By.xpath("//he[@class='slds-form-element__help']"));
	      String message = error.getText();
	      System.out.println(message);
	      
	      postCondition();
  }
	 
	 
	 
	 
	 public static void emailtestCase3() throws InterruptedException {	
		 
		  String excepted_url="https://app-in1.nokodr.com/super/apps/core/v1/index.html#/enzipvlt/default/dashboard";
	      preCondition();
	      emailModule();
	      //pass first name
	      driver.findElement(By.id("id_17368051901723555")).sendKeys("Anuradha");
	      //pass last name
	      driver.findElement(By.id("id_1736805190178876")).sendKeys("Neware");
	      //pass password
	      driver.findElement(By.id("id_17368051901831351")).sendKeys("Neware@123");
	      //pass confirm password
	      driver.findElement(By.id("id_17368051901831351-confirmpassword")).sendKeys("Neware@123");
	      //click on register button
	      driver.findElement(By.xpath("//div[@title='Register']")).click();
	      String actual_url=driver.getCurrentUrl();
	  	  if(excepted_url.equals(actual_url))
	  	  {
	  		System.out.println("Registered successfully!");
	  	  }
	  	  
	      postCondition();
	      
	 }
	 
	 
	 public static void emailtestCase4() throws InterruptedException {	
		 
	      preCondition();
	      emailModule();
	      //pass first name
	      driver.findElement(By.id("id_17368051901723555")).sendKeys("Anuradha");
	      //pass last name
	      driver.findElement(By.id("id_1736805190178876")).sendKeys("Neware");
	      //pass password
	      driver.findElement(By.id("id_17368051901831351")).sendKeys("Neware@123");
	      //pass confirm password
	      driver.findElement(By.id("id_17368051901831351-confirmpassword")).sendKeys("Neware123");
	      //get a error when the password and confirm passsord is not match
	      WebElement error = driver.findElement(By.xpath("//div[@class='slds-form-element__help']"));
	      String message= error.getText();
	      System.out.println(message);
	      postCondition();
	      
	 }
	 
	 public static void emailtestCase5() throws InterruptedException {	
		 
	      preCondition();
	      emailModule();
	      //pass empty name
	      driver.findElement(By.id("id_17368051901723555")).sendKeys("");
	      //get a error 
	      WebElement field_required_error = driver.findElement(By.xpath("//div[@class='slds-form-element__help']"));
	      String message= field_required_error.getText();
	      System.out.println(message);
	      //pass last name
	      driver.findElement(By.id("id_1736805190178876")).sendKeys("Neware");
	      //pass password
	      driver.findElement(By.id("id_17368051901831351")).sendKeys("Neware@123");
	      //pass confirm password
	      driver.findElement(By.id("id_17368051901831351-confirmpassword")).sendKeys("Neware@123");
	      postCondition();
	      
	 }
	 
	 
	 public static void emailtestCase6() throws InterruptedException {	
		 
	      preCondition();
	      emailModule();
	      //pass first name
	      driver.findElement(By.id("id_17368051901723555")).sendKeys("Anuradha");
	      //pass last name as a empty
	      driver.findElement(By.id("id_1736805190178876")).sendKeys("");
	      //get a error 
	      WebElement field_rquired_error = driver.findElement(By.xpath("//div[@class='slds-form-element__help']"));
	      String message= field_rquired_error.getText();
	      System.out.println(message);
	      //pass password
	      driver.findElement(By.id("id_17368051901831351")).sendKeys("Neware@123");
	      //pass confirm password
	      driver.findElement(By.id("id_17368051901831351-confirmpassword")).sendKeys("Neware@123");
	      postCondition();
	      
	 }
	 
	 
	 public static void emailtestCase7() throws InterruptedException {	
		 
	      preCondition();
	      emailModule();
	      //pass first name
	      driver.findElement(By.id("id_17368051901723555")).sendKeys("Anuradha");
	      //pass last name 
	      driver.findElement(By.id("id_1736805190178876")).sendKeys("Neware");
	      //pass password as empty string
	      driver.findElement(By.id("id_17368051901831351")).sendKeys("");
	      //get a error 
	      WebElement field_required_error = driver.findElement(By.xpath("//div[@class='slds-form-element__help']"));
	      String message= field_required_error.getText();
	      System.out.println(message);
	      //pass confirm password as a empty string
	      driver.findElement(By.id("id_17368051901831351-confirmpassword")).sendKeys("");
	      //get a error 
	      WebElement field_required_error1 = driver.findElement(By.xpath("//div[@class='slds-form-element__help']"));
	      String message1= field_required_error1.getText();
	      System.out.println(message1);
	      postCondition();
	      
	 }
	 
	 
	 public static void emailtestCase8() throws InterruptedException {	
		 
	      preCondition();
	      emailModule();
	      //pass first name
	      driver.findElement(By.id("id_17368051901723555")).sendKeys("Anuradha");
	      //pass last name
	      driver.findElement(By.id("id_1736805190178876")).sendKeys("Neware");
	      //pass incorrect password :Password must contain at least eight characters
	      driver.findElement(By.id("id_17368051901831351")).sendKeys("Neware");
	      //get a error
	      WebElement error= driver.findElement(By.xpath("//div[@class='slds-form-element__help']"));
	      String message= error.getText();
	      System.out.println(message);
	      postCondition();
	      
	 }
	 
	 public static void emailtestCase9() throws InterruptedException {	
		 
	      preCondition();
	      emailModule();
	      //pass first name
	      driver.findElement(By.id("id_17368051901723555")).sendKeys("Anuradha");
	      //pass last name  
	      driver.findElement(By.id("id_1736805190178876")).sendKeys("Neware");
	      //pass incorrect password :Password must contain at least one special character
	      driver.findElement(By.id("id_17368051901831351")).sendKeys("Neware123");
	      //get a error
	      WebElement error= driver.findElement(By.xpath("//div[@class='slds-form-element__help']"));
	      String message= error.getText();
	      System.out.println(message);
	      postCondition();
	      
	 }
	 
	 
	 public static void emailtestCase10() throws InterruptedException {	
		 
	      preCondition();
	      emailModule();
	      //pass first name
	      driver.findElement(By.id("id_17368051901723555")).sendKeys("Anuradha");
	      //pass last name  
	      driver.findElement(By.id("id_1736805190178876")).sendKeys("Neware");
	      //pass incorrect password :Password must contain at least one number (0-9).
	      driver.findElement(By.id("id_17368051901831351")).sendKeys("Neware@");
	      //get a error
	      WebElement error= driver.findElement(By.xpath("//div[@class='slds-form-element__help']"));
	      String message= error.getText();
	      System.out.println(message);
	      postCondition();
	      
	 }
	 
	 
	  //phone module scenario 
		 public static void phoneModule() throws InterruptedException {	
			 
	      preCondition();
	      //click the sign up link
	      driver.findElement(By.linkText("Sign up")).click();
	      //click phone
	      driver.findElement(By.xpath("//span@[title='Phone']")).click();
	      //pass phone number
	      driver.findElement(By.id("id_17368095013895625']")).sendKeys("9209169248");
	      //click checkbox
	      driver.findElement(By.className("slds-checkbox_faux")).click();
	      //click the proceed button
	      driver.findElement(By.className("slds-button slds-button_brand")).click();
	      //get a popup : verification code sent successfully
	      WebElement verfCode_sent=driver.findElement(By.xpath("//h2[@class='slds-text-heading_small']"));
	      String code = verfCode_sent.getText();
	      System.out.println(code);
	      //pass the OTP
	      driver.findElement(By.id("id_17368049630897033")).sendKeys("561910");
	      //click on verify button
	      driver.findElement(By.xpath("//div[@title='Verify Code']")).click();
	  	  postCondition();
	  	
	      
		 }
		 
		 public static void signupUsingPhone() throws InterruptedException {
			 
			  preCondition();
			  //click the sign up link
		      driver.findElement(By.linkText("Sign up")).click();
		      //pass empty phone number input field
		      driver.findElement(By.xpath("//input[@type='email']")).sendKeys("");
		      //click checkbox
		      driver.findElement(By.className("slds-checkbox_faux")).click();
		      //click the proceed button
		      driver.findElement(By.className("slds-button slds-button_brand")).click();
		      //get a error when we pass blank input field
		      WebElement error = driver.findElement(By.xpath("//h2[@class='slds-text-heading_small']"));
		      String message=error.getText();
		      System.out.println(message);
		      
		      postCondition();
		 }
		 
		 public static void signupUsingPhone1() throws InterruptedException {
			 
			  preCondition();
			  //click the sign up link
		      driver.findElement(By.linkText("Sign up")).click();
		      //pass empty email
		      driver.findElement(By.xpath("//input[@type='email']")).sendKeys("");
		      //click checkbox
		      driver.findElement(By.className("slds-checkbox_faux")).click();
		      //click the proceed button
		      driver.findElement(By.className("slds-button slds-button_brand"));
		      //error occured when we not accept the terms and condition
		      WebElement error = driver.findElement(By.xpath("//h2[@class='slds-text-heading_small']"));
		      String message=error.getText();
		      System.out.println(message);
		      postCondition();
		      
		 }
		 public static void phoneTestCase1() throws InterruptedException {	
			 
		      preCondition();
		      //click the sign up link
		      driver.findElement(By.linkText("Sign up")).click();
		      //pass email
		      driver.findElement(By.id("id_17368095013895625']")).sendKeys("9209169248");
		      //click checkbox
		      driver.findElement(By.className("slds-checkbox_faux")).click();
		      //click the proceed button
		      driver.findElement(By.className("slds-button slds-button_brand")).click();
		      //get a error when pass registered phone number
		      WebElement error = driver.findElement(By.xpath("//div[@class='slds-notify__content']/div/h2"));
		      String message = error.getText();
		      System.out.println(message);
		      
		      postCondition();
	   }
		
		 
		 public static void phoneTestCase2() throws InterruptedException {	
			 
		      preCondition();
		      //click the sign up link
		      driver.findElement(By.linkText("Sign up")).click();
		      //pass email
		      driver.findElement(By.id("id_17368095013895625")).sendKeys("9209169248");
		      //click checkbox
		      driver.findElement(By.className("slds-checkbox_faux")).click();
		      //click the proceed button
		      driver.findElement(By.className("slds-button slds-button_brand")).click();
		      //get a popup : verification code sent successfully
		      WebElement verfCode_sent=driver.findElement(By.xpath("//h2[@class='slds-text-heading_small']"));
		      String code = verfCode_sent.getText();
		      System.out.println(code);
		      //pass the OTP
		      driver.findElement(By.id("id_17368049630897033")).sendKeys("157177");
		      //click on verify button
		      driver.findElement(By.xpath("//div[@title='Verify Code']")).click();
		      //get a error when pass invalid or expired OTP
		      WebElement error = driver.findElement(By.xpath("//he[@class='slds-form-element__help']"));
		      String message = error.getText();
		      System.out.println(message);
		      postCondition();
	  }
		 
		 public static void phoneTestCase3() throws InterruptedException {	
			 
			  String excepted_url="https://app-in1.nokodr.com/super/apps/core/v1/index.html#/enzipvlt/default/dashboard";
		      preCondition();
		      phoneModule();
		      //pass first name
		      driver.findElement(By.id("id_17368051901723555")).sendKeys("Anuradha");
		      //pass last name
		      driver.findElement(By.id("id_1736805190178876")).sendKeys("Neware");
		      //pass password
		      driver.findElement(By.id("id_17368051901831351")).sendKeys("Mummy@123");
		      //pass confirm password
		      driver.findElement(By.id("id_17368051901831351-confirmpassword")).sendKeys("Mummy@123");
		      //click on register button
		      driver.findElement(By.xpath("//div[@title='Register']")).click();
		      String actual_url=driver.getCurrentUrl();
		  	  if(excepted_url.equals(actual_url))
		  	  {
		  		System.out.println("Registered successfully!");
		  	  }
		  	  
		      postCondition();
		      
		 }
		 
		 
		 public static void phoneTestCase4() throws InterruptedException {	
			 
		      preCondition();
		      phoneModule();
		      //pass first name
		      driver.findElement(By.id("id_17368051901723555")).sendKeys("Anuradha");
		      //pass last name
		      driver.findElement(By.id("id_1736805190178876")).sendKeys("Neware");
		      //pass incorrect password :Password must contain at least eight characters
		      driver.findElement(By.id("id_17368051901831351")).sendKeys("Mummy");
		      //get a error
		      WebElement error= driver.findElement(By.xpath("//div[@class='slds-form-element__help']"));
		      String message= error.getText();
		      System.out.println(message);
		      postCondition();
		      
		 }
		 
		 
		 public static void phoneTestCase5() throws InterruptedException {	
			 
		      preCondition();
		      phoneModule();
		      //pass first name
		      driver.findElement(By.id("id_17368051901723555")).sendKeys("Anuradha");
		      //pass last name  
		      driver.findElement(By.id("id_1736805190178876")).sendKeys("Neware");
		      //pass incorrect password :Password must contain at least one number (0-9).
		      driver.findElement(By.id("id_17368051901831351")).sendKeys("Mummy@");
		      //get a error
		      WebElement error= driver.findElement(By.xpath("//div[@class='slds-form-element__help']"));
		      String message= error.getText();
		      System.out.println(message);
		      postCondition();
		      
		 }
		 
		 
		 public static void phoneTestCase6() throws InterruptedException {	
			 
		      preCondition();
		      phoneModule();
		      //pass first name
		      driver.findElement(By.id("id_17368051901723555")).sendKeys("Anuradha");
		      //pass last name  
		      driver.findElement(By.id("id_1736805190178876")).sendKeys("Neware");
		      //pass incorrect password :Password must contain at least one special character
		      driver.findElement(By.id("id_17368051901831351")).sendKeys("Mummy123");
		      //get a error
		      WebElement error= driver.findElement(By.xpath("//div[@class='slds-form-element__help']"));
		      String message= error.getText();
		      System.out.println(message);
		      postCondition();
		      
		 }
		 
		 
		 public static void phoneTestCase7() throws InterruptedException {	
			 
		      preCondition();
		      phoneModule();
		      //pass first name
		      driver.findElement(By.id("id_17368051901723555")).sendKeys("Anuradha");
		      //pass last name 
		      driver.findElement(By.id("id_1736805190178876")).sendKeys("Neware");
		      //pass password as empty string
		      driver.findElement(By.id("id_17368051901831351")).sendKeys("");
		      //get a error 
		      WebElement field_required_error = driver.findElement(By.xpath("//div[@class='slds-form-element__help']"));
		      String message= field_required_error.getText();
		      System.out.println(message);
		      //pass confirm password as a empty string
		      driver.findElement(By.id("id_17368051901831351-confirmpassword")).sendKeys("");
		      //get a error 
		      WebElement field_required_error1 = driver.findElement(By.xpath("//div[@class='slds-form-element__help']"));
		      String message1= field_required_error1.getText();
		      System.out.println(message1);
		      postCondition();
		      
		 }
		 
		 
		 public static void phoneTestCase8() throws InterruptedException {	
			 
		      preCondition();
		      phoneModule();
		      //pass first name
		      driver.findElement(By.id("id_17368051901723555")).sendKeys("Anuradha");
		      //pass last name as a empty
		      driver.findElement(By.id("id_1736805190178876")).sendKeys("");
		      //get a error 
		      WebElement field_rquired_error = driver.findElement(By.xpath("//div[@class='slds-form-element__help']"));
		      String message= field_rquired_error.getText();
		      System.out.println(message);
		      //pass password
		      driver.findElement(By.id("id_17368051901831351")).sendKeys("Mummy@123");
		      //pass confirm password
		      driver.findElement(By.id("id_17368051901831351-confirmpassword")).sendKeys("Mummy@123");
		      postCondition();
		      
		 }
		 
		 
		 public static void phoneTestCase9() throws InterruptedException {	
			 
		      preCondition();
		      phoneModule();
		      //pass empty name
		      driver.findElement(By.id("id_17368051901723555")).sendKeys("");
		      //get a error 
		      WebElement field_required_error = driver.findElement(By.xpath("//div[@class='slds-form-element__help']"));
		      String message= field_required_error.getText();
		      System.out.println(message);
		      //pass last name
		      driver.findElement(By.id("id_1736805190178876")).sendKeys("Neware");
		      //pass password
		      driver.findElement(By.id("id_17368051901831351")).sendKeys("Mummy@123");
		      //pass confirm password
		      driver.findElement(By.id("id_17368051901831351-confirmpassword")).sendKeys("Mummy@123");
		      postCondition();
		      
		 }
		 
		 public static void phoneTestCase10() throws InterruptedException {	
			 
		      preCondition();
		      phoneModule();
		      //pass first name
		      driver.findElement(By.id("id_17368051901723555")).sendKeys("Anuradha");
		      //pass last name
		      driver.findElement(By.id("id_1736805190178876")).sendKeys("Neware");
		      //pass password
		      driver.findElement(By.id("id_17368051901831351")).sendKeys("Mummy@123");
		      //pass confirm password
		      driver.findElement(By.id("id_17368051901831351-confirmpassword")).sendKeys("Mummy123");
		      //get a error when the password and confirm passsord is not match
		      WebElement error = driver.findElement(By.xpath("//div[@class='slds-form-element__help']"));
		      String message= error.getText();
		      System.out.println(message);
		      postCondition();
		      
		 }
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
	 
	 
	 
	 
}