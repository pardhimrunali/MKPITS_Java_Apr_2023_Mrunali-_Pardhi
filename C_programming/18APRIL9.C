#include<stdio.h>
#include<conio.h>
void main()
{
   int p,q,r,s;
   printf("\n Enter the value of first integer");
   scanf("%d",&p);
   printf("\n Enter the value of second integer");
   scanf("%d",&q);
   printf("\n Enter the value of third integer");
   scanf("%d",&r);
   printf("\n Enter the value of fourth integer");
   scanf("%d",&s);
   if ((q>r)&&(s>p)&&((r+s)>(p+q))&&(r>0)&&(s>0)&&(p%2==0))
   {
     printf("\n Correct value\n");
   }
   else
   {
    printf("\n Wrong value\n");
   }
   getch();
}