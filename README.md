<img src="./src/Employeee/icons/view.jpg" alt="Logo of the project" align="right">

# EMPLOYEE MANAGEMENT SYSTEM 
> Installation & Step by Step Process

An employee management system is a software, that helps your employees to give their best efforts every day to achieve the goals of your organization. It guides and manages employees efforts in the right direction. It also securely stores and manages personal and other work-related details for your employees.

# Installing / Getting started
## Developing

### Built With
1. Eclipse IDE
2. jdk-18.0.2.1
3. mysql-connector.jar
4. xampp-windows-x64-8.0.9-0-VS16
5. mysql


### Prerequisites
What is needed to set up the dev environment. For instance, global dependencies or any other tools. include download links.
1. https://www.eclipse.org/downloads/
2. https://www.eclipse.org/downloads/
3. https://www.apachefriends.org/download.html


### Setting up Dev

Here's a brief intro about what a developer must do in order to start developing
the project further:

```shell
gh repo clone Vidhinpatel08/Employee-Management-System
cd Employee-Management-System/

```

Step 1: Deployee Database
- goto Xampp Control panel , open Apache and mysql server
- goto Crome and serach : http://localhost/phpmyadmin/
- create  new data base name **project3** 
- goto **import** navigater
- choose your Database file **"project3"** and upload there and click to **Go**

Step 2: Install JDK & Eclipse step by step 
- no need Additional features

Step 3 : open Project Folder in Eclipse




### Building

Now, you need to change some line as per your connecton :
###### open .classpath file and change

```
	<classpathentry kind="lib" path="D:/College/Employee_Project/Employee-Management-System/mysql-connecter/mysql-connector.jar"/>
		<!-- path="D:/College/Employee_Project/Employee-Management-System/mysql-connecter/mysql-connector.jar"  --> 
		<!-- set the path of where your mysql connecter location. like my current location
		D:\College\Employee_Project\Employee-Management-System\mysql-connecter -->
	<classpathentry kind="output" path="bin"/>

```
###### open conn.java file and change

```
	<classpathentry kind="lib" path="D:/College/Employee_Project/Employee-Management-System/mysql-connecter/mysql-connector.jar"/>
		<!-- path="D:/College/Employee_Project/Employee-Management-System/mysql-connecter/mysql-connector.jar"  --> 
		<!-- set the path of where your mysql connecter location. like my current location
		D:\College\Employee_Project\Employee-Management-System\mysql-connecter -->
	<classpathentry kind="output" path="bin"/>

```

you can change you code as per your Requirement.

### Deploying / Publishing

- Goto Front_Page.java and simple run file simple like normal java file.


## Style guide / Testing
Run Step by Step As per your Requirements. 
We have provided Output images for you Understanding
See in Output_images Folder.

How to work Our Application .

1. Welcome page
2. Login page
    - login with Username & Id
    - Signup & Forgot password 
3. Home page 
    - Employee 
    - Salary
    - Attendance
    - About US
  4. Employee 
      - Add Employee
      - Update Employee
      - View Employee
      - Remove Employee
  5. Attendance
      - Fill Attendance
      - View Attendance
  6. salary
      - Add Salary
      - Update Salary
      - Generate Payment slips 

<br>



## Database

- Goto Xampp Control panel , open Apache and mysql server
- Goto Crome and serach : http://localhost/phpmyadmin/
- Create  new data base name **project3** 
- Goto **import** navigater
- Choose your Database file **"project3"** and upload there and click to **Go**

## Licensing

- Open LICENSE 
