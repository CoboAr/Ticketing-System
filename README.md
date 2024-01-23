# Ticketing System

This project is completed in different phases following the principles of Extreme Programming (XP) and Incremental Development (IDP).

## What is Ticketing System?

It is a command line program. There are 4 types of users: admin, buyer, seller, full standard     

The program is implemented based on 2 logics: 
1) front end
![image](https://github.com/CoboAr/Ticketing-System/assets/144629565/363a0ca3-4c63-412d-9524-08dd7dde342e)


The command that users can perform are: 1) Login 2) Create 3) Delete 4) Buy 5) Sell 6) Add Credit 7) Refund 8) Logout 

Admin can perform all commands.    
Buyer can perform Login, Buy, Add Credit, Logout.     
Seller can perform Login, Sell, Add Credit, Refund, Logout.     
Full Standard can perform Login, Buy, Sell, Add Credit, Refund, Logout.      


https://github.com/CoboAr/Ticketing-System/assets/144629565/e8ecccf8-5d0c-4053-afe0-02766d13f8fb


https://github.com/CoboAr/Ticketing-System/assets/144629565/d56e7485-bde3-48d3-8440-d2396b32f448


https://github.com/CoboAr/Ticketing-System/assets/144629565/ba4dcb5b-4c25-4a03-bac1-b4867245945c



https://github.com/CoboAr/Ticketing-System/assets/144629565/ae58c7f0-cc86-43e5-ac0c-25453c6cdce7

2) Back end

![image](https://github.com/CoboAr/Ticketing-System/assets/144629565/734cbd7d-84e1-4af8-9d39-2ed45bf7313c)
   
Each transaction is registered on the temporary Daily Transaction File.      
The format of the Daily Transaction File is:      
Code of transaction_user_user type_amount of credit        
Code of transaction: 
01 = Create Code    
02 = Delete Code     
03 = Buy Code   
04 = Sell Code    
05 = Refund Code    
06 = Add Credit Code    
00 = End of Session Code

<img width="1023" alt="Daily Transaction File" src="https://github.com/CoboAr/Ticketing-System/assets/144629565/2d2f889b-fe3f-444d-8945-87d75a986715">

At the end of each day, all the transactions from temporary daily transaction file + users.tex + tickets.txt are used to generate a new file named Merged Daily Transaction File.

<img width="1389" alt="Merged Daily Transaction File" src="https://github.com/CoboAr/Ticketing-System/assets/144629565/ef56e098-ca9a-4906-bc60-e567a44b45c6">


Whenever an error is generated it is saved on a file named error.txt.
<img width="1384" alt="error" src="https://github.com/CoboAr/Ticketing-System/assets/144629565/c09a94bf-a53d-4093-98f6-7b3bae1c0cd2">


## Phase 1
<ul>
<li>A design document, giving the overall structure of the solution, showing the classes and methods as a table, with a brief description of the intention of each one.</li>
<li>The first version of the source code to implement the design. This version ran some inputs but it's not completely tested.</li>
</ul>

## Phase 2
Test cases designed for black box testing.   Black box testing focuses on the functionality of the software without considering its internal structure.   
The test cases are organized in 2 directories: 1) input_tests; 2) expected_output_tests

To perform these sets of tests a python script (run_test.py) and a jar file of the java program (please.jar) is used.

Run this command on terminal to start testing:  python3 run_test.py please.jar input_tests expected_output_tests

