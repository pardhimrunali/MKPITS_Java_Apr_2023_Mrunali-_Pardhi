#include<stdio.h>
#include<conio.h>
void main()
{
  int num1,num2;
  float result;
  clrscr();
  printf("\n Enter the first number");
  scanf("%d",&num1);
  printf("\n Enter the second number");
  scanf("%d",&num2);
  if(num2!=0)
  {
     result=num1/num2;
     printf("division value is %f",result);
  }
  else
  {
     printf("\n Division not possible");
  }
  getch();
}