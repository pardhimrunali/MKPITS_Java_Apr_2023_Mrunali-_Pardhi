	include<stdio.h>
#include<conio.h>

    //no argument with no returntype
   void area();
   void main()
   {

	 clrscr();
	 area();

	 getch();


    }
    void area()
    {


       int pi=3.14,r,area;

       printf("Enter the value of radius");
       scanf("%d",&r);

       area=pi*r*r;

       printf("Area of circle is %d",area);


    }