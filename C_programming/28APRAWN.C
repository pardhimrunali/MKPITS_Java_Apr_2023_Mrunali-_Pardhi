#include<stdio.h>
#include<conio.h>
//argument with no returntype

void add();



void main()
{
   int a=5,b=100;
   clrscr();
   add(a,b);
   getch();



}




void add(int x,int y)
  {
      int sum;


      sum=x+y;
      printf("sum of two number is %d",sum);
  }