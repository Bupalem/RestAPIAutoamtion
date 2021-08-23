package opearationsTest;

import org.testng.Assert;

import files.Payload;
import io.restassured.path.json.JsonPath;

class ComplexJsonParse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		JsonPath jsp= new JsonPath(Payload.coursePrice());
		int count= jsp.getInt("courses.size");
		int pur= jsp.getInt("dashboard.purchaseAmount");
		System.out.println("Coursecount"+count);
		System.out.println("purchaseAmount: "+pur);
		
		String var= jsp.getString("courses[0].title");
		String var1= jsp.getString("courses[1].title");
		String var2= jsp.getString("courses[2].title");
		System.out.println(var);
		System.out.println(var1);
		System.out.println(var2);
		
		String p1= jsp.getString("courses[0].price");
		String p2= jsp.getString("courses[1].price");
		String p3= jsp.getString("courses[2].price");
		
		
		//Print All course titles and their respective Prices
		
		System.out.println("FirstCoure: "+var+" Price is "+p1);
		System.out.println("SecondCoure: "+var1+" Price is "+p2);
		System.out.println("ThirdCoure: "+var2+" Price is "+p3);
		System.out.println("");
		for(int i=0;i<count;i++) {
			
			System.out.println("Courses "+jsp.getString("courses["+i+"].title")+" Price is "+jsp.getString("courses["+i+"].price"));
		
		}
		
		//Print no of copies sold by RPA Course
for(int i=0;i<count;i++) {
			
	String str=jsp.getString("courses["+i+"].title");
	if(str.contains("RPA")) {
		System.out.println("No of copies sold by RPA :"+jsp.getString("courses["+i+"].copies"));
		break;
	}
			
		}


//Verify if Sum of all Course prices matches with Purchase Amount

int temp=0;
for(int i=0;i<count;i++) {
	int copies=jsp.getInt("courses["+i+"].copies");
		int pr=	jsp.getInt("courses["+i+"].price");
		int mul=copies*pr;
		
	System.out.println(temp=temp+mul);
	}

Assert.assertEquals(temp, pur);
			
		




		
	}

}
