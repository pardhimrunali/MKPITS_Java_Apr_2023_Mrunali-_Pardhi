use student
select * from student_detail
/*
101	Ram	     Nagpur
102	Ramesh	Arjuni
103	Shyam	Gondiya
104	Sundar	Nanded
105	Pradnya	Pune
106	Radha	Pune
107	Teju	Nagpur
108	Mrunali	Vardha
110	Priya	Latur*/
        
select * from mark
        /*
    m   eng  
101	25	50
102	85	59
103	60	null
104	99	36
105	87	79
106	45	49
107	55	57
108	95	78*/


/*fetch name and mark of student they belong to*/
/*inner join*/
select s.name,m.english
from student_detail s inner join mark m
 on s.roll_no=m.roll_no 
 
 /*fetch  all name and mark of student they belong to*/
/*left join*/
select s.name,m.english
from student_detail s left join mark m
 on s.roll_no=m.roll_no 
 
 /*right join*/
 select s.name,m.english
from student_detail s right join mark m
 on s.roll_no=m.roll_no 

 
 