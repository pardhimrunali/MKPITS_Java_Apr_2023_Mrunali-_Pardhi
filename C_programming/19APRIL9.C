#include<stdio.h>
#include<conio.h>
void main()
{
   int i,numbers[5],total=0;
   clrscr();
   printf("\n Enter the first number");
   scanf("%d",&numbers[0]);
   printf("\n Enter the second number");
   scanf("%d",&numbers[1]);
   printf("\n Enter the third number");
   scanf("%d",&numbers[2]);
   printf("\n Enter the fourth number");
   scanf("%d",&numbers[3]);
   printf("\n Enter the fifth number");
   scanf("%d",&numbers[4]);
   for(i=0;i<5;i++)
   {
     if(numbers[i]%2 !=0)
     {
	total +=numbers[i];
     }
   }
   printf("\n sum of all odd valueis %d",total);
   printf("\n");
   getch();
}
