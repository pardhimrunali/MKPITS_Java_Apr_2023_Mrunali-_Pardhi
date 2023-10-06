use sys
create database Student_Details
drop database Student_details
create database Student_Management
create table student_details(Roll_no char(2) Primary key,name char(10),Address varchar(25))
use Student_Management
show tables 
select * from student_details
insert into student_details value('01','Mrunali','Amravati')
create table Mark_details(Roll_no char(2),Physics int,Math int,Chemistry int,constraint f_k foreign key(Roll_no) references Student_details(Roll_no))
insert into Mark_details value('01',25,36,78)
select * from Mark_details
 insert into student_details value('05','Avinash','Amravati')
 insert into Mark_details(Roll_no,physics) value('03',66)
 
 create database Bank_Management 
 create table Customer(Account_no varchar(15),customer_name char(20),Date_of_Birth int )
 drop table Customer
 
  show tables
  use Bank_Management
  show tables
  drop database Bank_Management
  create  database Bank_Management
  use Bank_Management
   create table Customer(Account_no varchar(15) Primary key,customer_name char(20),Date_of_Birth int)
   insert into Customer value('123456SBI123589','Mrunali Pardhi',30)
show tables
select * from Customer
use student_management
select * from mark_details
select roll_no from mark_details

/*between clause*/
select * from mark_details where roll_no=03
select * from mark_details where roll_no=01
select * from mark_details where physics BETWEEN 40 and 100
select * from mark_details where physics not between 25 and 50

SET SQL_SAFE_UPDATES = 0;

use student_management
select * from mark_details
//----modify record
update mark_details set physics=45 where roll_no=01

//---delete records 
delete from mark_details where roll_no=01
delete  from student_details where roll_no=03 
show tables

/*delete record*/
select * from mark_details 
delete from mark_details where roll_no=03
 delete from student_details where roll_no=03
 
 
 insert into student_details value('03','Shreya','Pune')
  insert into student_details value('06','Unmekha','Nagpur')
  insert into student_details value('07','Ashutosh','Mumbai')
  
  insert into student_details value('08','Ashu','Arjuni')
  
  select * from student_details

  insert into student_details value('16','Prerna','Bhandara')



use sys
show tables

