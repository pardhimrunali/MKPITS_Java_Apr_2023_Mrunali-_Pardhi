#include<stdio.h>
#include<conio.h>
void main()
{
  float r,pi=3.14,area;
  printf("\n Enter the value of radius");
  scanf("%f",&r);
  area=pi*r*r;
  printf("\n Area of circle is %f",area);
  getch();
}