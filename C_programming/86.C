#include<stdio.h>
#include<conio.h>
//area of triangle function with no argument & returntype

float areat();
void main()
{
  float at;
  clrscr();
  at=areat();
  printf("Area of triangle is %f",at);
  getch();


}
float areat()
{
  float b,h,area;
  printf("Enter the value of base & height");
  scanf("%f%f",&b,&h);
  area=0.5*b*h;
  return area;
}