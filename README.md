OCEJWCD
====================
Code examples/snippets for "Java EE 6 Web Component Developer Certified Expert Exam" (1Z0-899)
 

Books
-------
* OCEJWCD Study Companion: Oracle Certified Expert Java EE Web Component Developer Exam 1Z0-899 3rd Edition, http://www.amazon.co.uk/dp/0955160340
* Head First Servlets and JSP: Passing the Sun Certified Web Component Developer Exam, http://www.amazon.com/Head-First-Servlets-JSP-Certified/dp/0596516681/ref=pd_cp_b_0 


Teh. Stack
----------
* Gradle as build tool ant dependency management
* Java EE 6
* Jetty as embedded web server


Project Structure
------------------
    /root
    |
    +- Chapter 1
    |  (webserv1)
    |  |
    |  +- Chapter 1.1
    |  |  (webserv1.1)
    |  |
    |  +- Chapter 1.2
    |     (webserv1.2)
    |     | 
    |     + Chapter 1.2.1
    |  
    +- Chapter 2      
    |
    . . . . . 
    
Run examples with 
-----------------
    gradle cp:cp_1:cp_12:JettyRun
    
Set up project in Jetbrains IDEA
--------------------------------
    gradle idea
    
no copyrights use on your own risk
