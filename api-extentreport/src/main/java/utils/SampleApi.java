package utils;
import static io.restassured.RestAssured.given;

	import io.restassured.RestAssured;
	import io.restassured.response.Response;


	public class SampleApi 
	{
		
		public static void api1(String uri,String Apibody)
		{
			
			given().log().all().body(Apibody).post(uri).then().log().all().assertThat().statusCode(301);
		}
		
	public static String api2() {
		String uri="http://moolya.com";
		String Apibody1="{\n" + " \"name\" : \"nitesh\" \n " + "}";
		given().log().all().body(Apibody1).post(uri).then().log().all();
		return uri;
	}

	public static void api3()
	{
		Response response= RestAssured.get("https://reqres.in/api/users?page=2");
		System.out.println(response.asString());
		System.out.println(response.getBody().asString());
		System.out.println(response.getStatusCode());
	}

}
