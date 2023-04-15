#include<stdio.h>
#include<conio.h>
void main()
{
  int l,b,perimeter;
  printf("\n Enter the value of length and breadth");
  scanf("%d%d",&l,&b);
  perimeter=2*(l+b);
  printf("\n perimeter of rectangle is %d",perimeter);
  getch();
}