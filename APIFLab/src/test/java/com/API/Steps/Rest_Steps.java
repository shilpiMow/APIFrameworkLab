package com.API.Steps;
import java.util.HashMap;
import java.util.Map;
import org.json.simple.JSONObject;
import com.API.excel.API_Excel;
import com.API.utilities.Json_Payload;
import com.API.utilities.API_Calls;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.response.Response;

public class Rest_Steps {
	public static Response res;
	public static JSONObject jsn;
	public static Map<String, String> storingExcel = new HashMap<String, String>();
	public static JSONObject updateInfo = new JSONObject();

	@Given("^I want to create a new user through \"([^\"]*)\" call from Excel file \"([^\"]*)\" for the BaseUri \"([^\"]*)\" and endpoint \"([^\"]*)\"$")
	public void i_want_to_create_a_new_user_through_call_from_Excel_file_for_the_BaseUri_and_endpoint(String arg1,
			String arg2, String arg3, String arg4, Map<String, String> data) throws Throwable {
		for (Map.Entry<String, String> entry : data.entrySet()) {
			storingExcel.put(API_Excel.readExcel(arg2, entry.getKey()),
					API_Excel.readExcel(arg2, entry.getValue()));

		}
		jsn = Json_Payload.payload(storingExcel);
		res = API_Calls.executeRquest(arg1, arg3, arg4);

	}

	@Then("^I verify that the user is created through HTTP Status code$")
	public void i_verify_that_the_user_is_created_through_HTTP_Status_code() throws Throwable {
		if (res.statusCode() == 201 || res.statusCode() == 200) {
			System.out.println("For creating a new User a valid HTTP code " + res.statusCode() + " occured");
		} else {
			System.out.println("For creating a new User a invalid HTTP code " + res.statusCode() + " occured");
		}

	}

	@Then("^I want to retrieve the users Info through \"([^\"]*)\" call from the BaseUri \"([^\"]*)\" and endpoint \"([^\"]*)\"$")
	public void i_want_to_retrieve_the_users_Info_through_call_from_the_BaseUri_and_endpoint(String arg1, String arg2,
			String arg3) throws Throwable {
		res = API_Calls.executeRquest(arg1, arg2, arg3);
		res.prettyPrint();
	}

	@Then("^Also verify that I got the users info through HTTP Status code$")
	public void also_verify_that_I_got_the_users_info_through_HTTP_Status_code() throws Throwable {
		if (res.statusCode() == 200) {
			System.out.println("For retriving a  Users info a valid HTTP code " + res.statusCode() + " occured");
		} else {
			System.out.println("For retriving a  Users info a invalid HTTP code " + res.statusCode() + " occured");
		}
	}

	@SuppressWarnings("unchecked")
	@Then("^I want to update the users Info through \"([^\"]*)\"  call from Excel file \"([^\"]*)\" for the BaseUri \"([^\"]*)\"  and endpoint \"([^\"]*)\"$")
	public void i_want_to_update_the_users_Info_through_call_from_Excel_file_for_the_BaseUri_and_endpoint(String arg1,
			String arg2, String arg3, String arg4, Map<String, String> data) throws Throwable {
		for (Map.Entry<String, String> entry : data.entrySet()) {
			updateInfo.put(API_Excel.readExcel(arg2, entry.getKey()), API_Excel.readExcel(arg2, entry.getValue()));

		}

		res = API_Calls.executeRquest(arg1, arg3, arg4);
		res.prettyPrint();

	}

	@When("^verifying I should get an valid HTTP code for updating$")
	public void verifying_I_should_get_an_valid_HTTP_code_for_updating() throws Throwable {
		if (res.statusCode() == 200 || res.statusCode() == 204) {
			System.out.println("For updating a  Users info a valid HTTP code " + res.statusCode() + " occured");
		} else {
			System.out.println("For updating a  Users info a invalid HTTP code " + res.statusCode() + " occured");
		}

	}

	@Then("^I want to delete an user through \"([^\"]*)\" call from the BaseUri \"([^\"]*)\" and endpoint \"([^\"]*)\"$")
	public void i_want_to_delete_an_user_through_call_from_the_BaseUri_and_endpoint(String arg1, String arg2,
			String arg3) throws Throwable {
		res = API_Calls.executeRquest(arg1, arg2, arg3);
		res.prettyPrint();

	}

	@Then("^verify that I deleted the users info through HTTP Status code$")
	public void verify_that_I_deleted_the_users_info_through_HTTP_Status_code() throws Throwable {
		if (res.statusCode() == 200 || res.statusCode() == 204) {
			System.out.println("For deleting a  Users info a valid HTTP code " + res.statusCode() + " occured");
		} else {
			System.out.println("For deleting a  Users info a invalid HTTP code " + res.statusCode() + " occured");
		}
	}

}
