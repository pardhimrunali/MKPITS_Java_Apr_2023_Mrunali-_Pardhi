#include<stdio.h>
#include<conio.h>
void main()
{
   int n1,n2;
   clrscr();
   printf("\n Enter  Number");
   scanf("%d",&n1);
   printf("\n List of square of even value from  1 to a %d is \n",n1);
   for(n2=2; n2<=n1; n2++)
   {
     if(n2%2==0)
      {
	 printf("%d^2=%d\n",n2,n2*n2);
	 }
   }
   getch();
}
