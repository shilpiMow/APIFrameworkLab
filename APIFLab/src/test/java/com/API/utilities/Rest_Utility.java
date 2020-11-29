package com.API.utilities;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.API.Steps.Rest_Steps;
import cucumber.api.DataTable;
import io.restassured.response.Response;
 
public class Rest_Utility {

	public static Map<String, Map<String, String>> mangeInputData(DataTable data) {
		Map<String, String> verify = new HashMap<String, String>();
		Map<String, String> header = new HashMap<String, String>();
		Map<String, String> parameter = new HashMap<String, String>();
		List<List<String>> info = data.raw();
		Map<String, Map<String, String>> all = new HashMap<String, Map<String, String>>();

		for (int i = 0; i < info.size(); i++) {
			if (info.get(i).get(0).equals("VAL")) {

				verify.put(info.get(i).get(1), info.get(i).get(2));

			} else if (info.get(i).get(0).equals("HEA")) {

				header.put(info.get(i).get(1), info.get(i).get(2));

			} else if (info.get(i).get(0).equals("PAR")) {

				parameter.put(info.get(i).get(1), info.get(i).get(2));

			}

		}
		all.put("VAL", verify);
		all.put("HEA", header);
		all.put("PAR", parameter);
		return all;
	}
	
	
	/**
	 * This method will verify all the HTTP methods it will take  Map and response
	 * and return the verification code 
	 * @param value and r
	 * @return a print statement with the verification code
	 */
	public static void printVerify(Map<String, Map<String, String>> value, Response r) {
		Map<String, String> keyy = value.get("VAL");
		
		for (Map.Entry<String, String> entry : keyy.entrySet()) {
          
			if (r.body().jsonPath().getString(entry.getKey()).equals(entry.getValue())) {
				System.out.println("The actual is " + Rest_Steps.res.jsonPath().getString(entry.getKey()) + " and expected " +entry.getValue() +" are matched");
			} else {
				System.out.println("The actual and expected did not match");
				System.out.println("The expected value is: " + entry.getValue());
				System.out.println("But the actual value is: " + Rest_Steps.res.jsonPath().getString(entry.getKey()));
			}
		}

	}

}

