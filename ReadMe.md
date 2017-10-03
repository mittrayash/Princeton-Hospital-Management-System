# Princeton Hospital Management Systems Software

The Princeton Hospital Management System is a comprehensive project based on technologies - Java, Jasper iReports and SQL.  
The project has been built specifically for Princeton Community Hospital. The official website can be visited at www.pchonline.org

The major features of the software are as follows: 
  - Client Side and Official Side modes
  - Clients can generate unpaid invoices and make easy payment on reaching the hospital.
  - Easy Registration and Login
  - Map of Hospital
  - Information and Links regarding the nearest Hotels
  - FAQs Section
  - Link to the Website Portal
  - Financial Assistance Section
  - Contact Details of the Hospital
  - Easy Account Interface and Editing
  - Forgot Password
  - Doctor Panel
  - Add New Patients
  - View and Edit/Remove Existing Patients
  - Manage appointments
  - Pharmacist Portal
  - Add/Delete drug database
  - Track drugs' quantity
  - Update Drug details
  - Search dynamically in a list of drugs list
  - Administrator Portal
  - Add/Remove Doctor
  - Add/Remove Pharmacist

## Getting Started

To get started, simply download the project files and load the SQL databases using MySQL or xampp. Testing has been performed using both.  
For editing and launching, using Netbeans would be the best. Furthermore, I can provide an installation wizard if anyone wishes so, please bring the same to my attention.


### Prerequisites

- XAMPP (recommended choice) or MySQL
- Java (version 8 or higher)

End with an example of getting some data out of the system or using it for a little demo

## Running the tests

For testing purposes, you can use Netbeans environment.  
After loading the project files in the environment, make sure to load the SQL file to your database and check the connection file.
The database should store any tables in a database named 'princeton'. Although the SQL file is automated to take care of such minor issues, it will be best to look at the connection file for any further issues.  

Tests can be carried our in various phases given the software provides access for 4 types of users:
- Administrators
- Doctors
- Pharmacists
- Patients
  
For any of the login portals, a sample entry has been created in the SQL file with the following details: 
- USERNAME: user
- PASSWORD: pass  
Apart from that, for any forgot password pages' testing, use the answer to the recovery question provided in the database tables.


## Deployment

Deploying the software is a subject matter of implementation. The project exe file can be provided here, and the same needs to be brought to my attention if anyone's interested in it.  
However a few bugs are present in this part of the project.  
The major one that catches my attention is that I am unable to change the Jasper iReport image soliciting path from my desktop to the project's version of the same file.  
Every file is included in the project itself, all I need to work on is changing the path of querying the image for the invoice report header. I have lacked support from the iReport Cummunity which is essentially why I have been unable to address the issue as of now. I plan on fixing it as soon as possible.  
Till then, manually change the path of the folder containing images as per your PC.

## Built With

* Java
* SQL
* Jasper iReport

## Contributing

This project has been coded and implemented by Yash Mittra only, at this moment. 

## Version

  1.0
  
## Authors

* **Yash Mittra**

## Screenshots

!['Could not load image'](/Screenshots/Screenshot%20(8).png)  

!['Could not load image'](/Screenshots/Screenshot%20(9).png)  

!['Could not load image'](/Screenshots/Screenshot%20(10).png)  

!['Could not load image'](/Screenshots/Screenshot%20(11).png)  

!['Could not load image'](/Screenshots/Screenshot%20(12).png)  

!['Could not load image'](/Screenshots/Screenshot%20(13).png)  

!['Could not load image'](/Screenshots/Screenshot%20(14).png)  

!['Could not load image'](/Screenshots/Screenshot%20(15).png)  

!['Could not load image'](/Screenshots/Screenshot%20(16).png)  

!['Could not load image'](/Screenshots/Screenshot%20(17).png)  

!['Could not load image'](/Screenshots/Screenshot%20(18).png)  

!['Could not load image'](/Screenshots/Screenshot%20(19).png)  

!['Could not load image'](/Screenshots/Screenshot%20(20).png)  

!['Could not load image'](/Screenshots/Screenshot%20(21).png)  

!['Could not load image'](/Screenshots/Screenshot%20(22).png)  

!['Could not load image'](/Screenshots/Screenshot%20(23).png)  

!['Could not load image'](/Screenshots/Screenshot%20(24).png)  

!['Could not load image'](/Screenshots/Screenshot%20(25).png)  

!['Could not load image'](/Screenshots/Screenshot%20(26).png)  

!['Could not load image'](/Screenshots/Screenshot%20(27).png)  

!['Could not load image'](/Screenshots/Screenshot%20(28).png)  

!['Could not load image'](/Screenshots/Screenshot%20(29).png)  

!['Could not load image'](/Screenshots/Screenshot%20(30).png)  

!['Could not load image'](/Screenshots/Screenshot%20(31).png)  

!['Could not load image'](/Screenshots/Screenshot%20(32).png)  

!['Could not load image'](/Screenshots/Screenshot%20(33).png)  

!['Could not load image'](/Screenshots/Screenshot%20(34).png)  

!['Could not load image'](/Screenshots/Screenshot%20(35).png)  

!['Could not load image'](/Screenshots/Screenshot%20(36).png)  

!['Could not load image'](/Screenshots/Screenshot%20(37).png)  


