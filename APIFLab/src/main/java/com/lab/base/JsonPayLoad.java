package com.lab.base;



import java.util.Map;

import org.json.simple.JSONObject;

import com.lab.base.JsonPayLoad;





public class JsonPayLoad {

	public String email="mitul.li@yahoo.com";
	public  String patchBody() {
		String body="{\"email\":\""+email+"\",\"first_name\": \"Md\",\"last_name\": \"Obaidulla\",\"avatar\": \"https://osaconsultingtech.com/final_forum/forum/student_final/student_page.php\"}";
		return body;
	}
	public static void main(String[] args) {
		JsonPayLoad js=new JsonPayLoad();
		System.out.println(js.patchBody());
	//System.out.println(getPayLoad(33,"Poly","Chowdhury","poly123@gmail.com"));
	}
	
//	public static String getPayLoad(int age,String fn,String ln.String email) {
//		JSONObject jo=new JSONObject();
//		jo.put("Age", age);
//		jo.put("fName", "fn");
//		jo.put("lName", "ln");
//		jo.put("Email", "email");
//		return jo.toString();
//		
//	}	
	 
	  public static  JSONObject payload() {
		JSONObject jo=new JSONObject();
			return jo;
			
	  }
  }

