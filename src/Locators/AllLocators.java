package Locators;

public class AllLocators {

	public static void main(String[] args) {
		
		/*
		Every Object may not have ID, ClassName or name - Xpath and CSS Preferred
		Alpha Numeric ID may vary on every refresh - Check
		Confirm the link object with anchor "a" tag
		Classes should not have spaces - Compound classes cannot be accepted
		Mutiple values - Selenium identifiers the first one - scan from the top left
		Double quotes inside double quotes are not accepted
		Xpath/CSS can be blue highlighted html code to generate xpath
		Firepath depreciated from firefox.
		When xpath starts with html-Not reliable-Switch browser to get another one
		There is no direct way to get CSS in chrome. you will find it in tool bar.
		Degrade browser to less firefox 55 to get firefox - To generate xpath ( Mostly Not recommend) 
		
		
		XPath :
		
		Validate in console - $x(" ")
		---------------------> Validating
		
		1. //tagName[@attribute = 'value'] -  Syntax  Ex: //input[@type='email']
		2. //*[@attribute = 'value']   
		3. //tagName[contains(@attribute, 'value' )]  --- Regular Expression   
			Syntax Ex: //input[contains(@name= 'username')]
		
		CSS :
		
		Validate in console - $(" ")
		--------------------------> Validating
		
		1. tagName[attribute = 'value']
		2. tagName[attribute* = 'value'] - - Regular Expression
		2. *[attribute = 'value']    
		3. tagName.classname		
		4. tagName#id
		5. #id
		
		
		*/
		
	

		
		
		
	}

}
