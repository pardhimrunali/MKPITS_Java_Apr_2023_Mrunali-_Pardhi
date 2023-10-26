create database bankManegement
use bankManegement
create table account(user_id varchar(10) primary key,user_password varchar(10),
user_name varchar(20),address varchar(30),city varchar(20),email_id varchar(30),balance double)

drop table account
select * from account