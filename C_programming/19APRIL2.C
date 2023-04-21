#include<stdio.h>
#include<conio.h>
void main()
{
   int n1,n2,n3,n4,n5,sum=0;
   printf("\n Enter Five numbers");
   scanf("%d%d%d%d%d",&n1,&n2,&n3,&n4,&n5);
   if(n1%2==1)
   {
     sum=sum+n1;
   }
   if(n2%2==1)
   {
     sum=sum+n2;
   }
   if(n3%2==1)
   {
     sum=sum+n3;
   }
   if(n4%2==1)
   {
    sum=sum+n4;
   }
   if(n5%2==1)
   {
   sum=sum+n5;
   }
   printf("\n sum of all odd numbers is %d",sum);
   getch();
}