package com.API.utilities;


import com.API.Steps.Rest_Steps;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class API_Calls {
	/**
	 * This method will take the type of request call baseuri and endpoint and based
	 * on that it will call the appropriate request call method
	 * @param request,
	 * String baseuri,String endPoint
	 * @return Response
	 */
	public static RequestSpecification request;

	public static Response executeRquest(String request, String baseuri, String endPoint)  {
		String req = request.toLowerCase();
		Response res = null;
		if (req.equals("get")) {
			res = get(endPoint, baseuri);
		} else if (req.equals("post")) {
			res = post(endPoint, baseuri);
		} else if (req.equals("patch")) {
			res = patch(endPoint, baseuri);
		} else if (req.equals("delete")) {
			res = delete(endPoint, baseuri);
		}
		return res;
	}

	/**
	 * This method will take the endpoint and baseuri and from that it will return
	 * the response for get
	 * 
	 * @param endpoint,baseuri
	 * @return Response
	 */
	public static Response get(String endpoint, String baseU) {
		RestAssured.baseURI = baseU;
		RequestSpecification request = RestAssured.given();
		Response res = request.get(endpoint);
		return res;
	}

	/**
	 * This method will take the endpoint and baseuri and from that it will return
	 * the response for post
	 * 
	 * @param endpoint,baseuri
	 * @return Response
	 */
	public static Response post(String endpoint, String baseU) {
		RestAssured.baseURI = baseU;
		request = RestAssured.given();

		Response res = request.contentType(ContentType.JSON).body(Rest_Steps.info).post(endpoint);
		
		return res;
	}

	/**
	 * This method will take the endpoint and baseuri and from that it will return
	 * the response for delete
	 * 
	 * @param endpoint,baseuri
	 * @return Response
	 * @throws ParseException 
	 */
	public static Response patch(String endpoint, String baseU) {
		//Json_Payload.patchBody(Rest_Steps.info
		RestAssured.baseURI = baseU;
		RequestSpecification request = RestAssured.given();
		Response res = request.contentType(ContentType.JSON).body(Rest_Steps.info).patch(endpoint);
		return res;
	}

	/**
	 * This method will take the endpoint and baseuri and from that it will return
	 * the response for delete
	 * 
	 * @param endpoint,baseuri
	 * @return Response
	 */
	public static Response delete(String endpoint, String baseU) {
		RestAssured.baseURI = baseU;
		RequestSpecification request = RestAssured.given();
		Response res = request.contentType(ContentType.JSON).delete(endpoint);
		return res;
	}

}
