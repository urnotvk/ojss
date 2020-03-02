/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import ojss.controllers.OJSSController;
import org.json.JSONException;
import org.json.simple.parser.ParseException;

/**
 *
 * @author Sonti Rametse
 */
@WebServlet(urlPatterns={"/LoginServlet"})
public class LoginServlet extends HttpServlet {
    URL url;
       @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, FileNotFoundException, ServletException{
        try {
        
            String strUserName = request.getParameter("username");
            String strPassword = request.getParameter("password");
            System.out.println(strUserName);
            System.out.println(strPassword);
            OJSSController jControl = new OJSSController();
            String openHTML = jControl.login(strUserName, strPassword);
            
            response.sendRedirect(openHTML);     
        } catch (JSONException ex) {
            Logger.getLogger(LoginServlet.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParseException ex) {
            Logger.getLogger(LoginServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
     
    }
}

