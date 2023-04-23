#include<stdio.h>
#include<conio.h>
void main()
{
   int num1,num2;
   clrscr();
   printf("\n Enter the first number");
   scanf("%d",&num1);
   printf("\n Enter the second number");
   scanf("%d",&num2);
   if(num1>0 && num2>0)
   {
     printf("\n Co_ordinates belongs to I quadrant",num1,num2);
   }
   else if (num1<0 && num2>0)
   {
     printf("\n Co_ordinates belongs to II quadrant",num1,num2);
   }
   else if(num1<0 && num2<0)
   {
     printf("\n Co_ordinates belongs to III quadrant",num1,num2);
   }
   else if(num1>0 && num2<0)
   {
      printf("\n Co_ordinates belongs to IV quadrant",num1,num2);
   }
   getch();
}