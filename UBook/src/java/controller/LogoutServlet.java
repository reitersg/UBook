/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Thomas
 */
@WebServlet(name = "LogoutServlet", urlPatterns = {"/logout"})
public class LogoutServlet extends HttpServlet {

    public void service(HttpServletRequest request, HttpServletResponse response) throws IOException
    {
        
        response.setContentType("text/html");  
        PrintWriter out=response.getWriter();    

        HttpSession session = request.getSession(true);
        session.setAttribute("loggedIn", false);
        session.setAttribute("userid", null);
        session.invalidate();
        
        out.print("You are successfully logged out!"); 
        out.close();
    }
}
