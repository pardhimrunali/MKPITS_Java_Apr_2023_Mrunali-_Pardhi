#include<stdio.h>
#include<conio.h>
//square of number function with argument & no returntype
void square();
void main()
{
   int num;
   clrscr();
   square(num);
   getch();

}
void square(int n)
{
   int sq;
   printf("Enter the number");
   scanf("%d",&n);
   sq=n*n;
   printf("Square of number is %d",sq);

}