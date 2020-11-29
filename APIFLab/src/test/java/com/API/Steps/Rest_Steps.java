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
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;

public class Rest_Steps {
	public static Response res;
	public static JSONObject jsn;
	public static JSONObject updateInfo = new JSONObject();
	private static Logger log = Utilities.getLog(Rest_Steps.class);
	public static String info = null;
	Properties p = Utilities.readPropFile();
	String base_uri = p.get("base_uri").toString();
	String specific_endpoint = p.get("specific_endpoint").toString();
	String general_endpoint = p.get("general_endpoint").toString();
	@Given("^I send a  \"([^\"]*)\" call  to create a new user$")
	public void i_send_a_call_to_create_a_new_user(String arg1, DataTable data) throws Throwable {

		List<List<String>> v = data.raw();
		info = API_Excel.readExcel(v.get(0).get(0));
		res = API_Calls.executeRquest(arg1, base_uri, general_endpoint);
		res.prettyPrint();
	}

	@Then("^I verify that the user is created through HTTP Status code$")
	public void i_verify_that_the_user_is_created_through_HTTP_Status_code() throws Throwable {
		log.info("Verifying that a new user is created succesfully");
		if (res.statusCode() == 201 || res.statusCode() == 200) {
			System.out.println("For creating a new User a valid HTTP code " + res.statusCode() + " occured");
		} else {
			System.out.println("For creating a new User a invalid HTTP code " + res.statusCode() + " occured");
		}

	}



	@Then("^I want to retrieve the users Info through \"([^\"]*)\" call$")
	public void i_want_to_retrieve_the_users_Info_through_call(String arg1) throws Throwable {

		res = API_Calls.executeRquest(arg1, base_uri, specific_endpoint);
		res.prettyPrint();

	}

	@Then("^Also verify that I got the users info through HTTP Status code$")
	public void also_verify_that_I_got_the_users_info_through_HTTP_Status_code() throws Throwable {
		log.info("Verifying users info");
		if (res.statusCode() == 200) {
			System.out.println("For retriving a  Users info a valid HTTP code " + res.statusCode() + " occured");
		} else {
			System.out.println("For retriving a  Users info a invalid HTTP code " + res.statusCode() + " occured");
		}
	}
	
	
	
	
	@Then("^I want to update the users Info through \"([^\"]*)\"  call$")
	public void i_want_to_update_the_users_Info_through_call(String arg1, DataTable holding) throws Throwable {

		List<List<String>> v = holding.raw();
		info = API_Excel.readExcel(v.get(0).get(0));
		res = API_Calls.executeRquest(arg1, base_uri, specific_endpoint);
     res.prettyPrint();
	}

	@When("^verifying I should get an valid HTTP code for updating$")
	public void verifying_I_should_get_an_valid_HTTP_code_for_updating() throws Throwable {
		log.info("Verifying Updates");
		if (res.statusCode() == 200 || res.statusCode() == 204) {
			System.out.println("For updating a  Users info a valid HTTP code " + res.statusCode() + " occured");
		} else {
			System.out.println("For updating a  Users info a invalid HTTP code " + res.statusCode() + " occured");
		}

	}


	@Then("^I verify all the VAL$")
	public void i_verify_all_the_VAL(DataTable data) throws Throwable {
		Map<String, Map<String, String>> infor = Rest_Utility.mangeInputData(data);
		Rest_Utility.printVerify(infor, res);
		 


	}
	
	
	
	@Then("^I want to delete an user through \"([^\"]*)\" call$")
	public void i_want_to_delete_an_user_through_call(String arg1) throws Throwable {
		res = API_Calls.executeRquest(arg1, base_uri, specific_endpoint);
		res.prettyPrint();
	
	}


	@Then("^verify that I deleted the users info through HTTP Status code$")
	public void verify_that_I_deleted_the_users_info_through_HTTP_Status_code() throws Throwable {
		log.info("Verifying delete");
		if (res.statusCode() == 200 || res.statusCode() == 204) {
			System.out.println("For deleting a  Users info a valid HTTP code " + res.statusCode() + " occured");
		} else {
			System.out.println("For deleting a  Users info a invalid HTTP code " + res.statusCode() + " occured");
		}
	}

}
