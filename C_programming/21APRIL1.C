#include<stdio.h>
#include<conio.h>
void main()
{
  int x,y;
  clrscr();
  printf("\n Enter the first number");
  scanf("%d",&x);
  printf("\n Enter the second number");
  scanf("%d",&y);
  if(x>y)
  {
    printf("\npair is in Descending order");
  }
  else
  {
    printf("\npair is in Ascending order");
  }
  getch();
}