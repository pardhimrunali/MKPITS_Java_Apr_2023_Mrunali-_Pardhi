#include<stdio.h>
#include<conio.h>
void main()
{

  int num1,num2,num;
  clrscr();
  printf("\n Enter the first number");
  scanf("%d",&num1);
  printf("\n Enter the second number");
  scanf("%d",&num2);
  for(num=num1;num<num2;num++)
  {
    if((num%7)==2 || (num%7)==3)
    {
       printf("\n Numbers are %d",num);
    }
  }
  getch();
}
