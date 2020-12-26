package Base;

import static io.restassured.RestAssured.given;

public class BaseClass
{
	
	public static void getMethod(String uri)
	{
		given().log().all().get(uri).then().log().all().assertThat().statusCode(200);
	}
	public static void getMethod1(String uri1, String name)
	{
		given().log().all().queryParam(name, "+name+").get(uri1).then().log().all();
	}
	public static void getMethod2(String uri3,String name)
	{
		given().log().all().pathParam(name, uri3).then().log().all();
	}

}

