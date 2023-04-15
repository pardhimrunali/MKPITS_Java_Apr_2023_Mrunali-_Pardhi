#include<stdio.h>
#include<conio.h>
void main()
{
  float base,h,Area;
  printf("\n Enter the value of base");
  scanf("%f",&base);
  printf("\n Enter the value of height");
  scanf("%f",&h);
  Area=0.5*base*h;
  printf("\n Area of triangle is %f",Area);
  getch();
}