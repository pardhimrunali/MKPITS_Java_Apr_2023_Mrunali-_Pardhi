create database student_trigger_example
use student_trigger_example
create table student(roll_no int primary key,name_of_student varchar(20))
insert into student values(101,'ram')
insert into student values(102,'radha')

select * from student

create table marks(roll_no int,physics int,math int)
insert into marks values(107,50,50)
select * from marks

create table total(roll_no int,total int)

DELIMITER //
CREATE TRIGGER add_total_marks
AFTER INSERT ON marks FOR EACH ROW
BEGIN

   insert into total values(new.roll_no,new.math+new.physics);

END;
//
DELIMITER ;



select * from marks
select * from total


/*update total*/


DELIMITER //
CREATE TRIGGER total_marks_student
AFTER update  ON marks FOR EACH ROW
BEGIN

   update  total 
   set total=new.math+new.physics
   where roll_no=new.roll_no;
  

END;
//
DELIMITER ;

update marks set physics=physics-10 

insert into marks value(105,5,50)

