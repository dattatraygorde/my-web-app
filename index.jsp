<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Welcome to My Web App</title>
    <link rel="stylesheet" type="text/css" href="css/style.css">
</head>
<body>
    <div class="container">
        <h1>Welcome to My Web Application</h1>
        <p>This is a simple web application built with:</p>
        <ul>
            <li>Java 17</li>
            <li>Apache Maven 3.9.11</li>
            <li>Tomcat 9 Server</li>
            <li>Servlet API 4.0</li>
        </ul>
        
        <div class="form-container">
            <h2>Try the Servlet</h2>
            <form action="hello" method="get">
                <label for="name">Enter your name:</label>
                <input type="text" id="name" name="name" placeholder="Your name">
                <button type="submit">Submit</button>
            </form>
        </div>
        
        <div class="info">
            <p><strong>Current Date and Time:</strong> <%= new java.util.Date() %></p>
            <p><strong>Server Info:</strong> <%= application.getServerInfo() %></p>
        </div>
    </div>
</body>
</html>