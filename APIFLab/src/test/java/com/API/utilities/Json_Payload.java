package com.API.utilities;
import java.util.Map;

import org.json.JSONObject;


public class Json_Payload {
	
	
	public static String patchBody(String in) {
		return in;
	}

	/**
	 * This method will take HashMap as a parameter then return a Json payload.
	 * @param hashMap
	 * @return JSONObject
	 */
	public static JSONObject payload(Map<String, String> hashMap) {

		JSONObject jo = new JSONObject(hashMap);

		return jo;

	}
}
