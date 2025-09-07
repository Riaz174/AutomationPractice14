package Capstone.AutomationPractice14;

import static io.restassured.RestAssured.*;

import java.io.File;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;

import org.testng.Assert;

public class API {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Response io = get("https://jsonplaceholder.typicode.com/users");
		io.prettyPrint();
		int statuscode = io.getStatusCode();
		System.out.println(statuscode);
		Assert.assertEquals(statuscode, 200);
		ResponseBody body = io.getBody();
		String convertToString = body.asString();
		System.out.println(convertToString);
		Assert.assertEquals(convertToString.contains("Leanne Graham"),true,"name is displaying");*/
		Post();
	}
	public static void Post() {
		File ot = new File(System.getProperty("user.dir")+"\\House.json");
		Response us = given().contentType(ContentType.JSON).body(ot).post("https://jsonplaceholder.typicode.com/users");
		us.prettyPrint();
		System.out.println(us.getStatusCode());
		
		
		
		
		
	

	}

	}


