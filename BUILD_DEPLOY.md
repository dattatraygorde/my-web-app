# Build and Deployment Instructions

## Prerequisites
- Java 17 installed
- Apache Maven 3.9.11 installed
- Apache Tomcat 9 server installed

## Build the Application

1. Navigate to the project directory:
```bash
cd my-webapp
```

2. Clean and build the WAR file:
```bash
mvn clean package
```

3. The WAR file will be created in the `target` directory as `my-webapp.war`

## Deploy to Tomcat 9

### Method 1: Manual Deployment
1. Copy the WAR file to Tomcat's webapps directory:
```bash
cp target/my-webapp.war $CATALINA_HOME/webapps/
```

2. Start Tomcat:
```bash
$CATALINA_HOME/bin/startup.sh  # Linux/Mac
$CATALINA_HOME/bin/startup.bat  # Windows
```

3. Access the application:
```
http://localhost:8080/my-webapp/
```

### Method 2: Tomcat Manager
1. Access Tomcat Manager: `http://localhost:8080/manager`
2. Use the "WAR file to deploy" section
3. Select `target/my-webapp.war` and click Deploy

## Verify Installation
- Home page: `http://localhost:8080/my-webapp/`
- Servlet: `http://localhost:8080/my-webapp/hello?name=YourName`

## Maven Commands
- `mvn clean` - Clean build artifacts
- `mvn compile` - Compile the project
- `mvn package` - Build the WAR file
- `mvn clean package` - Clean and build