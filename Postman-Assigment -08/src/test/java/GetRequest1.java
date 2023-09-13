import static io.restassured.RestAssured.given;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
public class GetRequest1 {

@BeforeTest
public void setup() {
RestAssured.baseURI="https://restcountries.com";
RestAssured.basePath="/v3.1/name/Vaneesa?fullText=True";
}
@Test
public void testget() {
given().
when().
get().
then().statusCode(404).log().all();
}
}