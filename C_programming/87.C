#include<stdio.h>
#include<conio.h>
//square of number function with no argument & returntype
int square();
void main()
{
   int sq;
   clrscr();
   sq=square();
   printf("square of number is %d",sq);
   getch();

}
int square()
{
  int n,sq;
  printf("Enter the number");
  scanf("%d",&n);
  sq=n*n;
  return sq;
}








