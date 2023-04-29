#include<stdio.h>
#include<conio.h>
//gument with returntype

void max();





void main()
{



     int a,b;

    clrscr();
     max();


     getch();

 }



void max(int x,int y)

{



      int max;
      printf("Enter two numbers");
      scanf("%d%d",&x,&y);
      if(x>y)
      {


       printf("max is %d",x);



      }

     if(y>x)
       {


	   printf("max is %d",y);



       }



}