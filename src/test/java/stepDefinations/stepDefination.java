package stepDefinations;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import resources.TestDataBuild;
import resources.Utils;

public class stepDefination extends Utils {

	RequestSpecification res;
	ResponseSpecification resspec;
	Response response;
	TestDataBuild data= new TestDataBuild();

	@Given("Add Place Payload")
	public void add_place_payload() {
		// Write code here that turns the phrase above into concrete actions
		
		resspec = new ResponseSpecBuilder().expectStatusCode(200).expectContentType(ContentType.JSON).build();
		res = given().spec(requestSpecification()).body(data.addplacePayload());
	}

	@When("user calls {string} with the Post http request")
	public void user_calls_with_the_post_http_request(String string) {
		// Write code here that turns the phrase above into concrete actions
		response = res.when().post("map/api/place/add/json").then().spec(resspec).extract().response();
	}

	@Then("the API call got  success with the status code {int}")
	public void the_api_call_got_success_with_the_status_code(Integer int1) {
		// Write code here that turns the phrase above into concrete actions
		assertEquals(response.statusCode(), 201);
	}

	@Then("{string} in response body is {string}")
	public void in_response_body_is(String KeyValue, String ExpectedValue) {
		// Write code here that turns the phrase above into concrete actions
		String response1 = response.asString();
		JsonPath js = new JsonPath(response1);
		assertEquals(js.get(KeyValue).toString(), ExpectedValue);

	}
}
