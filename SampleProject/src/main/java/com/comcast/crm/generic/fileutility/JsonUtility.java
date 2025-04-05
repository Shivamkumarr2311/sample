package com.comcast.crm.generic.fileutility;

import java.io.FileReader;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class JsonUtility {
	
	public String getDataFromJSONFile(String key) throws Throwable
	{
		
		FileReader fileR = new FileReader("/configAppData/applicationcommondata.json");
		
		JSONParser j= new JSONParser();
		Object obj = j.parse(fileR);
		
		JSONObject jobj= (JSONObject) obj;
		String data =(String) jobj.get(key);
		return data; 
	}

	
	
//ele 2 added by shivam  kumar  


	//some code added from manasa
        JSONParser jobj1=new JSONParser();
        String data1=(String)jobj1.toString();
        return data1;

	
	//element added by Ahmed  



}
