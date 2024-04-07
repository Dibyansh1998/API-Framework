package stepDefinations;

import java.util.ArrayList;
import java.util.List;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import pojo.AddPlace;
import pojo.Location;

public class stepDefination {

	@Given("Add Place Payload")
	public void add_place_payload() {
		// Write code here that turns the phrase above into concrete actions
		RestAssured.baseURI="https://rahulshettyacademy.com";
		
		AddPlace  p= new AddPlace();
		p.setAccuracy(50);
		p.setAddress("29, side layout, cohen 90");
		p.setLanguage("French-IN");
		p.setPhone_number("(+91) 6394127923");
		p.setWebsite("https://rahulshettyacademy.com");
		p.setName("Frontline House");
		p.setLocation(1);
		
		List<String> mylist= new  ArrayList<String>();
		mylist.add("shoe Park");
		mylist.add("shop");
		
		p.setTypes(mylist);
		
		Location l= new Location();
		l.setLat(-38.383494);
		l.setLng(33.427362);
		
		
		RequestSpecification req=new RequestSpecBuilder().setBaseUri("https://rahulshettyacademy.com").addQueryParam("Key", "qaclick123")
				.setContentType(ContentType.JSON).build();
	}

	@When("user calls {string} with the Post http request")
	public void user_calls_with_the_post_http_request(String string) {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@Then("the API call got  success with the status code {int}")
	public void the_api_call_got_success_with_the_status_code(Integer int1) {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@Then("{string} in response body is {string}")
	public void in_response_body_is(String string, String string2) {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();

	}
}
