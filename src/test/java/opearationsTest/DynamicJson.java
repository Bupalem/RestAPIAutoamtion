package opearationsTest;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import files.Payload;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class DynamicJson {

	// @Test
	public void addbook() {

		RestAssured.baseURI = "http://216.10.245.166";
		Response resp = given()// .log().all().header("Content-Type", "application/json")
				.body(Payload.addbook()).when().post("Library/Addbook.php").then().assertThat().statusCode(200)
				.extract().response();

		System.out.println(resp.asString());
	}

	// @Test
	public void getbook() {

		RestAssured.baseURI = "http://216.10.245.166";
		Response resp1 = given()// .log().all()

				.queryParam("ID", "bcd227").header("Content-Type", "application/json").when().get("Library/GetBook.php")
				.then().assertThat().statusCode(200).extract().response();

		System.out.println(resp1.asString());
	}

	
	public String id;
	@Test(dataProvider = "BooksData")

	public void addBook(String isbn, String aisle)

	{

		RestAssured.baseURI = "http://216.10.245.166";

		String resp = given().

				header("Content-Type", "application/json").

				body(Payload.Addbookparameters(isbn, aisle)).

				when().

				post("/Library/Addbook.php").

				then().assertThat().statusCode(200).

				extract().response().asString();
		
		System.out.println("complete output"+resp);

		JsonPath js = new JsonPath(resp);

	 id = js.get("ID");

		System.out.println(id);

		// deleteBOok	
		
		
	}

	@Test(dataProvider = "BooksData")

	public void deletebook(String isbn, String aisle)

	{
	
	
	String deleresp= given().

			header("Content-Type", "application/json").

			body(Payload.deleteParameters(id)).

			when().

			delete("/Library/DeleteBook.php").

			then().assertThat().statusCode(200).

			extract().response().asString();

	System.out.println("Delete output"+deleresp);
	
	}

	@DataProvider(name = "BooksData")

	public Object[][] getData() {
		// array=collection of elements

		// multidimensional array= collection of arrays

		return new Object[][] { { "jfw12ty", "213613" }, { "wet1e", "5131" }, { "m1fet", "1344" } };

	}

}
