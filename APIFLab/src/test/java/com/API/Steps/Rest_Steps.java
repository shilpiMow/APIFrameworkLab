package com.API.Steps;

import java.util.List;
import java.util.Map;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.json.JSONObject;

import com.API.excel.API_Excel;
import com.API.utilities.Utilities;
import com.API.utilities.API_Calls;
import com.API.utilities.Rest_Utility;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;

public class Rest_Steps {
	public static Response response;
	public static JSONObject jsn;
	public static String _id = "1234";
	public static JSONObject updateInfo = new JSONObject();
	private static Logger log = Utilities.getLog(Rest_Steps.class);
	public static String excelValue = null;
	Properties p = Utilities.readPropFile();
	String base_uri = p.get("base_uri").toString();

	@Given("^I send a \"([^\"]*)\" request using \"([^\"]*)\"$")
	public void i_send_a_request_using(String request, String endpoint) throws Throwable {
		System.out.println("getting screwed");
		log.info("Retrieving User's Information");
		System.out.println("still going strong");
		response = API_Calls.executeRquest(request, base_uri,endpoint);
		response.prettyPrint();
		System.out.println("-------------------------------------------");
	}

	@Then("^I verify the following fields$")
	public void i_verify_the_following_fields(DataTable data) throws Throwable {
		log.info("Validating User's Information");
		Map<String, Map<String, String>> information = Rest_Utility.mangeInputData(data);
		Rest_Utility.printVerify(information, response);
		System.out.println("-----------------------------------------------");
	}

	
	@And("^I verify the HTTP status code for \"([^\"]*)\"$")
	public void i_verify_the_HTTP_status_code_for(String arg1) throws Throwable {
		log.info("Verifying HTTP Code");
		if (response.statusCode() == 200|| response.statusCode()==201) {
			System.out.println("For " +arg1+"ing " +"a Users info a valid HTTP code " + response.statusCode() + " occured");
		} else {
			System.out.println("For retrieving a  Users info a invalid HTTP code " + response.statusCode() + " occured");
		}
		System.out.println("----------------------------------------------------");
	}
	

	
	@When("^I send a \"([^\"]*)\" request  by using \"([^\"]*)\"$")
	public void i_send_a_request_by_using(String request, String endpoint, DataTable data) throws Throwable {
		log.info("Creating A New User");
		List<List<String>> v = data.raw();
		excelValue = API_Excel.readExcel(v.get(0).get(1),v.get(0).get(0));
		response = API_Calls.executeRquest(request, base_uri, endpoint);
		
	}
	

	

	
	
	
}
	
