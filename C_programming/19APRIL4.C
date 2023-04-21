#include<stdio.h>
#include<conio.h>
void main()
{
  int n1,n2;
  printf("\n Enter two numbers");
  scanf("%d%d",&n1,&n2);
  if (n1>n2)
  {
     int temp;
     temp=n1;
     n1=n2;
     n2=temp;
  }
  if((n2%n1)==0)
  {
   printf("\n Multiplied");
  }
  else
  {
     printf("\n NOt multiplied");
  }


  getch();
}