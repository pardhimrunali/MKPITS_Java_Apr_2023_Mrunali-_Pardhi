#include<stdio.h>
#include<conio.h>
void main()
{
   int num;
   printf("\nEnter the number");
   scanf("%d",&num);

   if(num<0 || num<80)
    {
      printf("\n Number is %d",num);
   }
   else
   {
     printf("\n Error");
   }
   getch();
}