#include<stdio.h>
#include<conio.h>
// square of number function with no argument & no returntype
void square();
void main()
{
   clrscr();
   square();
   getch();

}
void square()
{
  int num,squ;
  printf("Enter the number");
  scanf("%d",&num);
  squ=num*num;
  printf("square of number is %d",squ);

}


