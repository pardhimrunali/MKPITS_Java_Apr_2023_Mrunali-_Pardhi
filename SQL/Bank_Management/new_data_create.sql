create database bankManegement
use bankManegement
create table account(user_id varchar(10) primary key,user_password varchar(10),
user_name varchar(20),address varchar(30),city varchar(20),email_id varchar(30),balance double)

select * from account
insert into account values('101','123','mru','101 pune','pune','mrunali25pardhi@gmail.com',1000)

create  table transactions(user_id varchar(10),transaction_date date,
user_amount double,transactiontype varchar(20),
constraint f_k foreign key(user_id) references account(user_id))

select * from transactions

create table image(id int,user_image BLOB(65000))
select * from image








use student
select * from student_detail