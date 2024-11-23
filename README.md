Created an application in Java. 

This applicaiton is to manage Employee details according to their respective Designations in a data file. 
Using Data Structues and collection classes for maintaining the DS to respond quickly.
This application has more then CRUD features. 
I have used Gradle build tool for compilation.

Make sure to make such dir for easy to use
c:\JavaApp\hr

To test it out, do git pull and run testcases. by providing the appropriate classpath and make sure you have the latest jdk version 23.1.1
to set the path, open cmd and in hr/bl/testcases folder specify the path of jdk and "path=c:\Windows;c:\Windows\System32;c:\jdk23\bin;" and enter 
then the compiled code will execute, 

before running the testcases, compile all the file by below cmd in testcases folder present in c:\javaapp\hr\bl\testcases
javac -classpath c:\JavaProject\hr\common\dist\hr-common.jar;c:\JavaProject\hr\dl\dist\hr-dl-1.0.jar;c:\JavaProject\hr\bl\build\libs\bl.jar;. *.java

To run the EmployeeManagerGetEmployeeTestCase, execute the below cmd
java -classpath c:\JavaProject\hr\common\dist\hr-common.jar;c:\JavaProject\hr\dl\dist\hr-dl-1.0.jar;c:\JavaProject\hr\bl\build\libs\bl.jar;. EmployeeManagerGetEmployeesTestCase

I have provided the testcases,B y executing such testacases you will able to perform various operaction.
