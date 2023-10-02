use student

/*table create*/
create table student_detail(roll_no char(3) primary key,name char(20),address varchar(15))
show tables

/*insert data into table */
insert into student_detail value('101','Ram','Nagpur')

/*show inserted data*/
select * from student_detail

/*insert data into table*/
insert into student_detail value('102','Ramesh','Arjuni')
insert into student_detail value('103','Shyam','Gondiya')
insert into student_detail value('104','Sundar','Nanded')
insert into student_detail value('105','Pradnya','Pune')
insert into student_detail value('106','Radha','Pune')
insert into student_detail value('107','Teju','Nagpur')
insert into student_detail value('108','Mrunali','Vardha')
insert into student_detail value('109','Raja','Mumbai')
insert into student_detail value('110','Priya','Latur')

/*create  table and foreign key*/
create table mark(roll_no char(3),math int,english int,constraint f_k foreign key(roll_no) references 
student_detail(roll_no) )

/*insert  data into table*/
insert into mark value ('101',25,50)
insert into mark value ('102',85,59)
insert into mark value ('104',89,36)
insert into mark value ('105',87,79)
insert into mark value ('106',45,49)
insert into mark value ('107',55,57)
insert into mark value ('108',95,78)
insert into mark value ('109',79,82)
insert into mark value ('110',65,97)

/*insert data into specific field*/
insert into mark(roll_no,math) value ('103',60)


/*show table data*/
select * from mark





