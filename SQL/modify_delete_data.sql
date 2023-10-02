use student
select * from mark
show tables
/*show specific data using where clause*/
select * from mark where roll_no=110

/*between clause*/
select * from mark where math between 50 and 100

/*not between clause*/
select * from mark where english not between 50 and 70

/*modify record*/
update mark set math=99 where roll_no=104

/*delete record*/
delete from mark where roll_no=110
/*it will delete record because in this table conatin only foreign key*/

delete from student_detail where roll_no=109
/* we cannot directly delete the data of table student_detail because it contains primary 
key for that firstly we need to delete data of that table where is the foreign key*/

delete from mark where roll_no=109
delete from student_detail where roll_no=109
select * from student_detail