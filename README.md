# CoolServlet
Ajax, Post, Get, Delete,Put.

#Tomcat deploy instructions

1)You'll need to create a WAR file so that you will have web application to deploy. The instructions for creating a WAR file were contained in steps 1 and 2 in the topic . Complete only steps 1 and 2. If you have already completed that project, delete the WAR file (DemoWebsite.war) and the unpacked folder (DemoWebsite) from CATALINA_HOME/webapps.

2)Start the Tomcat server.

3)In the address area of your browser, type http://localhost:8080/manager/html and submit that address to the browser.
You will be challenged for credentials. Provide the user name and password you specified in tomcat-users.xml (make sure to provide the correct spelling and case):


![alt text](https://s3.amazonaws.com/webucator-how-tos/2783.png)

4)Click OK
The manager web page is now displayed. Scroll down until you see the Deploy section: 


![alt text](https://s3.amazonaws.com/webucator-how-tos/2781.png)

Note that I have already provided the Context Path (/DemoWebsite) and the WAR URL ((c:/DemoWebsite/DemoWebsite.war) in the text boxes. Fill in the text boxes as I've done. Then click Deploy.

5)The manager will indicate that the web site has been deployed: 

![alt text](https://s3.amazonaws.com/webucator-how-tos/2782.png)

6)In a separate tab in your browser, type http://localhost:8080/DemoWebsite/DateJSP.jsp and submit that address to the browser.
The web page will be displayed verifying successful deployment: 

![alt text](https://s3.amazonaws.com/webucator-how-tos/2780.png)



