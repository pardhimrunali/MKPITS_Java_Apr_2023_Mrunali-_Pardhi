#include<stdio.h>
#include<conio.h>
void main()
{
  int days,y,m,d;
  printf("\n Enter the number of days");
  scanf("%d",&days);
  y=(int)days/365;
  days=days-(365*y);
  m=(int)days/30;
  d=(int)days-(m*30);
  printf("%d year(s) \n %dMonth(s) \n %d Day(s)",y,m,d);
  getch();
}