#include<stdio.h>
#include<conio.h>
 //no argument with no returntype
   void area();
   void main()
   {

	 area();
	 getch();
  }
  void area()
  {
       float area,pi=3.14,r;
       printf("Enter the value of radius");
       scanf("%f",&r);
       area=pi*r*r;
       printf("Area of circle is %f",area);
  }



