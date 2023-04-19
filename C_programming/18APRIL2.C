#include<stdio.h>
#include<conio.h>
void main()
{
  int empid,twh,amtph;
  float sal;
  printf("\n enter employee Id");
  scanf("%d",&empid);
  printf("\n enter the total working hours  \n amount received per hour");
  scanf("%d%d",&twh,&amtph);
  sal=twh*amtph;
  printf("\n employee id is %d",empid);
  printf("\n salry is %f",sal);
  getch();
}