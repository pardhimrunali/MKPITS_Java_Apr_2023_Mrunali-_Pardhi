#include<stdio.h>
#include<conio.h>
void main()
{
   float num[5];
   int i,pn=0,neg=0;
   clrscr();
   printf("\n Enter first  number");
   scanf("%f",&num[0]);
   printf("\n Enter the second number");
   scanf("%f",&num[1]);
   printf("\n Enter the third number");
   scanf("%f",&num[2]);
   printf("\n Enter the fourth number");
   scanf("%f",&num[3]);
   printf("\n Enter the fifth number");
   scanf("%f",&num[4]);
   for(i=0;i<5;i++)
    {
      if(num[i]>0)
   {
	    pn++;
   }
   else if(num[i]<0)
   {
     neg++;
   }
  }
  printf("\n Number of Positive numbers is %d",pn);
  printf("\n Number of Negative numbersis %d",neg);
   getch();
}