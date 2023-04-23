#include<stdio.h>
#include<conio.h>
void main()
{
   int num1,num2,num,sum=0;
   clrscr();
   printf("\n Enter the first number ");
   scanf("%d",&num1);
   printf("\n Enter the second number");
   scanf("%d",&num2);
   for(num=num1;num<=num2;num++)
   {
     if((num%17)!=0)
     {
       sum +=num;
     }
     }
     printf("\n sum is %d",sum);
     getch();
}

