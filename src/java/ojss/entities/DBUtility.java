/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ojss.entities;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;


/**
 *
 * @author Sonti Rametse
 */
public class DBUtility {
    
    JSONParser parser = new JSONParser();
    JobSeeker seeker;
    private final String userData ="E:\\FIT5136\\Final Assessment\\Final Assessment\\OJSS\\OJSS\\src\\java\\Users.json";
    private final String jobSeekerData = "E:\\FIT5136\\Final Assessment\\Final Assessment\\OJSS\\OJSS\\src\\java\\JobSeeker.json";
   
    public User getUserData(String username, String password) throws FileNotFoundException, IOException, ParseException, JSONException
    {
        User currentUser = new User(username, password);
            
        Object obj = parser.parse(new FileReader(userData));
        String results =  obj.toString();      
        JSONObject jObj = new JSONObject(results);
        JSONArray jArrayUsers = jObj.getJSONArray( "users" );
        
        for (int i = 0; i < jArrayUsers.length(); i++) {
               
               JSONObject jObjUser = jArrayUsers.getJSONObject( i );
               
               String objUsername = jObjUser.getString("username").toString();
               String objPassword = jObjUser.getString("password").toString();
               
               if (objUsername.equals(username))
               {
                    if (objPassword.equals(password))
                    {
                        currentUser.setUserID((Integer)jObjUser.get("id"));
                        currentUser.setUserType((String)jObjUser.get("type"));
                        return currentUser;
                    }
                    else
                    {
                        System.out.println("incorrect password");
                    }
               }
               else
               {
                   System.out.println("not a match on username");
               }                 
        }
        
        return currentUser;
    }
    
    
    public int getLastID() throws FileNotFoundException, JSONException, IOException, ParseException
    {
        Object obj = parser.parse(new FileReader("/data/Users.json"));
        JSONObject jObj = (JSONObject) obj;
        
        JSONArray jArrayUsers = (JSONArray) jObj.getJSONArray("users");
        
        int records = jArrayUsers.length();
        
        JSONObject jObjUser = jArrayUsers.getJSONObject( records - 1);
       
        int lastID = ((Integer)jObjUser.get("id"));
        
        return lastID;
    }
    
    public boolean insertNewUser(User user) throws FileNotFoundException, JSONException, IOException, ParseException
    {
        File file =  new File("/data/Users.json");
        Object obj = parser.parse(new FileReader(file));
        JSONObject jObj = (JSONObject) obj; 
       
        if (jObj == null)
        {
            return false;
        }
        else
        {       
            JSONObject newObj = new JSONObject();
            newObj.put("id", user.getUserID());
            newObj.put("username", user.getUserName());
            newObj.put("password", user.getPassword());
            newObj.put("type", user.getUserTpye());
            jObj.put("users", newObj);
            
            FileWriter fileTxt = new FileWriter("/data/Users.json"); 
            fileTxt.write("");
            fileTxt.write(jObj.toString());
            System.out.println("Successfully Copied JSON Object to File...");
            System.out.println("\nJSON Object: " + obj);
            return true;
        }  
    }
    
    public JobSeeker getJobSeekerDetails(User user) throws FileNotFoundException, IOException, ParseException, JSONException
    {
        Object obj = parser.parse(new FileReader(jobSeekerData));
        String results =  obj.toString();      
        JSONObject jObj = new JSONObject(results);
        JSONArray jArrayUsers = jObj.getJSONArray( "seekers" );
        
        for (int i = 0; i < jArrayUsers.length(); i++) {
               
               JSONObject jObjUser = jArrayUsers.getJSONObject( i );
               
               int objUserID = jObjUser.getInt("id");
               int userID = user.getUserID();
               
               if (objUserID == userID)
               {
                        seeker.setUserID((Integer)jObjUser.get("id"));
                        seeker.setUserName((String)jObjUser.get("username"));
                        seeker.setUserType((String)jObjUser.get("type"));
                        seeker.setPassword((String)jObjUser.get("password"));
                        seeker.setFirstName((String)jObjUser.get("firstName"));
                        seeker.setLastName((String)jObjUser.get("type"));
                        seeker.setEmail((String)jObjUser.get("lastName"));
                        seeker.setAddress((String)jObjUser.get("address"));
                        seeker.setPhone((Integer)jObjUser.get("phone"));
                        seeker.setAge((Integer)jObjUser.get("id"));
                        seeker.setGender((String)jObjUser.get("gender"));
                        seeker.setSkillets(null);
                        return seeker;
               }
               else
               {
                   System.out.println("no mathcing seeker");
               }                 
        }
        
        return seeker;
    }
    
}
