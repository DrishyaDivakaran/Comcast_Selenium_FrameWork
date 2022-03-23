package GenUtilityAPI;



public class JsonUtility {
	
	
	public Object getResponseData(Response response,String JsonPath)
	{
	
		return response.JsonPath().get(JsonPath);
	}
	

}
