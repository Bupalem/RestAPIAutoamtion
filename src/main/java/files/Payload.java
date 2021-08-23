package files;

public class Payload {

	
	public static String bodycontent() {
	
		String var="{\r\n" + 
				"  \"location\": {\r\n" + 
				"    \"lat\": -38.383494,\r\n" + 
				"    \"lng\": 33.427362\r\n" + 
				"  },\r\n" + 
				"  \"accuracy\": 50,\r\n" + 
				"  \"name\": \"Frontline house\",\r\n" + 
				"  \"phone_number\": \"(+91) 983 893 3937\",\r\n" + 
				"  \"address\": \"29, side layout, cohen 09\",\r\n" + 
				"  \"types\": [\r\n" + 
				"    \"shoe park\",\r\n" + 
				"    \"shop\"\r\n" + 
				"  ],\r\n" + 
				"  \"website\": \"http://google.com\",\r\n" + 
				"  \"language\": \"French-IN\"\r\n" + 
				"}\r\n"+
				"";
		return var;
	}
	
	public static String coursePrice() {
		
		String var01="{\r\n" + 
				"\"dashboard\": {\r\n" + 
				"\"purchaseAmount\": 910,\r\n" + 
				"\"website\": \"rahulshettyacademy.com\"\r\n" + 
				"},\r\n" + 
				"\"courses\": [\r\n" + 
				"{\r\n" + 
				"\"title\": \"Selenium Python\",\r\n" + 
				"\"price\": 50,\r\n" + 
				"\"copies\": 6\r\n" + 
				"},\r\n" + 
				"{\r\n" + 
				"\"title\": \"Cypress\",\r\n" + 
				"\"price\": 40,\r\n" + 
				"\"copies\": 4\r\n" + 
				"},\r\n" + 
				"{\r\n" + 
				"\"title\": \"RPA\",\r\n" + 
				"\"price\": 45,\r\n" + 
				"\"copies\": 10\r\n" + 
				"}\r\n" + 
				"]\r\n" + 
				"}\r\n" + 
				"";
		
		return var01;
		
		
	}
	
	
public static String addbook() {
		String va="{\r\n" + 
				"\r\n" + 
				"\"name\":\"Learn Apasspium Automation with Java book\",\r\n" + 
				"\"isbn\":\"bat man dd\",\r\n" + 
				"\"aisle\":\"2279\",\r\n" + 
				"\"author\":\"John foe fin\"\r\n" + 
				"}\r\n" + 
				"";

		
		return va;
	}
	

public static String getbook() {
	String va="{\r\n" + 
			" \r\n" + 
			"Name : “Learn Apasspium Automation with Java book” \r\n" + 
			"Isbn :  “bat man dd”\r\n" + 
			"Aisle : 2279\r\n" + 
			" \r\n" + 
			"}\r\n" + 
			"";

	
	return va;
}
	
public static String Addbookparameters(String bbok, String aisle) {
	String va="{\r\n" + 
			"\r\n" + 
			"\"name\":\""+bbok+"\",\r\n" + 
			"\"isbn\":\"bat man dd\",\r\n" + 
			"\"aisle\":\""+aisle+"\",\r\n" + 
			"\"author\":\"John foe fin\"\r\n" + 
			"}\r\n" + 
			"";

	
	return va;
}
	

public static String deleteParameters(String placeid) {
	String del="{\r\n" + 
			"    \"place_id\":\""+placeid+"\"\r\n" + 
			"}\r\n" + 
			"";

	
	return del;
}
	
}
