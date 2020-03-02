package ojss.entities;


import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import org.json.JSONException;
import org.json.simple.parser.ParseException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hunter
 */
public class User {
    private String username;
    private String password;
    private String userType;
    private int userID;
    private int lastID;
    private User user;
    private ArrayList<User> users;
    DBUtility db;
    
    public User(int id, String name, String pw, String ut)
    {
        userID = id;
        username = name;
        password = pw;
        userType = ut;
    }
    
    public User(String name, String pw)
    {
        username = name;
        password = pw;
    }
    
    public void setUserName(String name)
    {
        username = name;
    }
    public void setUserID(int id)
    {
        userID = id;
    }
    
    public void setPassword(String passw)
    {
        password = passw;
    }
    
    public void setUserType(String ut)
    {
        userType = ut;
    }
    public String getUserName()
    {
        return username;
    }
    public int getUserID()
    {
        return userID;
    }
    
    public String getPassword()
    {
        return password;
    }
    
    public String getUserTpye()
    {
        return userType;
    }
    public ArrayList<User> UserDetails()
    {
        return users;
    }
    
    public User getUserDetails(String username, String password) throws JSONException, IOException, FileNotFoundException, ParseException
    {
        db = new DBUtility();
        user = db.getUserData(username, password);
        return user;
    }
    
    public int getLastID() throws JSONException, IOException, FileNotFoundException, ParseException
    {
        db = new DBUtility();
        lastID = db.getLastID();
        return lastID;
    }
    
    public boolean newUserSaved(User user) throws JSONException, IOException, FileNotFoundException, ParseException
    {
        db = new DBUtility();
        Boolean result = db.insertNewUser(user);
        return result;
    }
}
