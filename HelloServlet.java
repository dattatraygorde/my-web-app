package com.example;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class HelloServlet extends HttpServlet {
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        response.setContentType("text/html;charset=UTF-8");
        
        String name = request.getParameter("name");
        if (name == null || name.isEmpty()) {
            name = "Guest";
        }
        
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String currentTime = now.format(formatter);
        
        try (PrintWriter out = response.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Hello Servlet</title>");
            out.println("<link rel='stylesheet' type='text/css' href='css/style.css'>");
            out.println("</head>");
            out.println("<body>");
            out.println("<div class='container'>");
            out.println("<h1>Hello, " + name + "!</h1>");
            out.println("<p>Current server time: " + currentTime + "</p>");
            out.println("<p>This servlet is running on Java 17 and Tomcat 9</p>");
            out.println("<a href='index.jsp'>Back to Home</a>");
            out.println("</div>");
            out.println("</body>");
            out.println("</html>");
        }
    }
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }
}