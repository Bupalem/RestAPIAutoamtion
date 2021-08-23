package opearationsTest;

import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.path.json.JsonPath;

import static org.hamcrest.Matchers.*;

import files.Payload;

import static io.restassured.RestAssured.*;


public class Basics {

	public static void main (String args[]) {
		
		//given- all input details
		//when- Submit the API-resource and http methods
		//then- validate the response
		
		RestAssured.baseURI="https://rahulshettyacademy.com";
		String responsedata=given().queryParam("key", "qaclick127").header("Content-type","application/json")
		.body(Payload.bodycontent()).when().post("maps/api/place/add/json")
		.then().assertThat().statusCode(200).body("scope", equalTo("APP"))
//		.header("server","Apache/2.4.18 (ubuntu)")
		.extract().response().asString();
		System.out.println(responsedata);
		
		JsonPath path = new JsonPath(responsedata);
		String placeid=path.getString("place_id");
		
		System.out.println("Place id :"+placeid);
		
		//update place
		
		given().queryParam("key", "qaclick127").header("Content-type","application/json")
		.body("{\r\n" + 
				"\"place_id\":\""+placeid+"\",\r\n" + 
				"\"address\":\"70 Summer walks, UK\",\r\n" + 
				"\"key\":\"qaclick123\"\r\n" + 
				"}\r\n" + 
				"").when().put("maps/api/place/update/json")
		.then().assertThat().statusCode(200).body("msg",equalTo("Address successfully updated"));
		
		//System.out.println("update response: "+ response);
		
		//GetPlace
		
			
			  String getPlaceResponse = given()
			//.queryParam("key", "qaclick127")
			.queryParam("place_id", placeid) 
			  .when().get("maps/api/place/get/json")
			  .then().assertThat().statusCode(200).extract().response().
			  asString();
			  
			  //System.out.println("//getplaceresponse"+getPlaceResponse); 
			  JsonPath js =
			  new JsonPath(getPlaceResponse); String
			  getmethodplaceid=js.getString("place_id");
			  System.out.println(getmethodplaceid);
			  
			  
			 
			  
			
		}
}




