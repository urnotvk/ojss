/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ojss.controllers;

import java.awt.Desktop;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URI;
import java.net.URL;
import java.net.URLConnection;
import static javax.servlet.SessionTrackingMode.URL;
import ojss.entities.JobSeeker;
import ojss.entities.Recruiter;
import ojss.entities.User;
import org.json.JSONException;
import org.json.simple.parser.ParseException;

/**
 *
 * @author Sonti Rametse
 */
public class OJSSController {
     
    private final String seekerHome = "http://localhost:8080/OJSS/seeker/home.html";
    private final String recruiterHome = "http://localhost:8080/OJSS/recruiter/home.html";
    URL url;
    private String pageURL;
    
    public String login(String username, String password) throws JSONException, IOException, FileNotFoundException, ParseException
    {
        User user = new User(username, password);
        user = user.getUserDetails(username, password);
        
        GoToAppropriateController(user);   
        
        return pageURL;
    }   
    
    public void GoToAppropriateController(User user) throws JSONException, IOException, FileNotFoundException, ParseException{
        String type = user.getUserTpye();
        
        if (type.equals("Job Seeker"))
        {
            pageURL = seekerHome;
        }
        else if (type.equals("Recruiter"))
        {
            pageURL = recruiterHome;           
        }
        else
        {
            System.out.println("no valid user type");
        }
    }
    
    public void createAccount(String username, String password, String userType) throws JSONException, IOException, FileNotFoundException, ParseException
    {
        User user = new User(username, password);
        
        int id = user.getLastID() + 1;
        
        User newUser = new User(id, username, password, userType);
        
        if(user.newUserSaved(newUser))
        {
            System.out.println("User created");
        }
        {
            System.out.println("Something went wrong new user not created");
        }
    }
}
