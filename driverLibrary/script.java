import oracle.oats.scripting.modules.basic.api.*;
import oracle.oats.scripting.modules.browser.api.*;
import oracle.oats.scripting.modules.functionalTest.api.*;
import oracle.oats.scripting.modules.utilities.api.*;
import oracle.oats.scripting.modules.utilities.api.sql.*;
import oracle.oats.scripting.modules.utilities.api.xml.*;
import oracle.oats.scripting.modules.utilities.api.file.*;
import oracle.oats.scripting.modules.webdom.api.*;
import oracle.oats.scripting.modules.adf.api.*;
import oracle.oats.scripting.modules.adf.api.elements.ADFTreeTable;

public class script extends IteratingVUserScript {
	@ScriptService oracle.oats.scripting.modules.utilities.api.UtilitiesService utilities;
	@ScriptService oracle.oats.scripting.modules.browser.api.BrowserService browser;
	@ScriptService oracle.oats.scripting.modules.functionalTest.api.FunctionalTestService ft;
	@ScriptService oracle.oats.scripting.modules.webdom.api.WebDomService web;
	@ScriptService oracle.oats.scripting.modules.adf.api.ADFService adf;
	
	public void initialize() throws Exception {
		
	}
		
	/**
	 * Add code to be executed each iteration for this virtual user.
	 */
	public void run() throws Exception {
		
		//Get total currently visible rows in the tree 
		int total_rows = adf.tree(" path of your tree ").getRowCount();
		
		//Scroll to the last row
		adf.tree("path").scrollToRow(total_rows-1); //as rowcount is +1 to actual index value
		
		//Again take the total visible rows in the tree as sometimes it loads more rows after scrolling last row
		int new_total_rows = adf.tree(" path of your tree ").getRowCount();
		
		
		//Compare previous totalrowcount with current and proceed scrolling down if required till you reach end row
			
		for(int i=0 ; i<50 ; i++){
			if(! (total_rows == new_total_rows) ){
				//Get total currently visible rows in the tree 
				 total_rows = adf.tree(" path of your tree table ").getRowCount();
				
				//Scroll to the last row
				adf.tree("path").scrollToRow(total_rows-1); //as rowcount is +1 to actual index value
				
				//Again take the total visible rows in the tree as sometimes it loads more rows after scrolling last row
				 new_total_rows = adf.tree(" path of your tree table ").getRowCount();
				continue;
			}
			break;
		}
			

			ADFTreeTable obj = adf.treeTable("path of your tree table");
			//Selecting from first row to the last row in the table
			obj.multiSelectByIndex(0,new_total_rows-1);
	} 
	
	public void finish() throws Exception {
	}
	
	
	// Start of all methods
	
	
/*
@Function Name : Addition of Two Numbers 
@Pupose :  Add two whole numbers and return the result
@Example:  
@Return: Returns and non zero value after additing two numbers
			Returns 0 in case of invalid input or execption
@Thows: Artheatic exeption
@Developer: Saurabh Thawali
@Date: 03-03-2019
@Revesion History: Created new funtiuon on 3rf march 
@JIRA: ABC-1234 */
 public int addTwoWholeNumbers(int num1, int num2 )throws Exception {
		info("Inside addTwoWholeNumbers() method ");
		info("Inout received from caller num1 = "+num1+" and num2 = "+num2);
		
		try{
			
			//Validate Input
			if(num1 < 0 && num2 < 0){
				info("Invalid number for num1 , Please provide positive non-zero input");
				return 0;
			}
				
			//int result = num1 + num2;
			// return result;
			return  (num1 + num2);
	
		}catch(Exception e){
			info("Printing exception "+e.getMessage());	
			return 0;
		}
	}
	
 
 
 
 
 public int divideWholeNumbers(int numerator, int denominator )throws Exception {
		info("Inside divideWholeNumbers() method ");
		info("Inout received from caller num1 = "+numerator+" and num2 = "+denominator);
		
		try{
			
			//Validate Input
			if(denominator == 0){
				info("Invalid denominator , Please provide non-zero denominator");
				return 0;
			}
				
			//int result = num1 + num2;
			// return result;
			return  (numerator/denominator);
	
		}catch(Exception e){
			info("Printing exception "+e.getMessage());	
			return 0;
		}
	}
 
 

 
 
 
	
}
