use student
show tables
create table student(
roll_no int ,
name char(10),
city char(15),
primary key(roll_no)
)

select * from student

ALTER TABLE student
ADD image BLOB(65000)




create table image(id int,user_image BLOB(65000))
select * from image


