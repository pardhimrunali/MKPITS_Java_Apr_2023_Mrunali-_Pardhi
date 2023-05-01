#include<stdio.h>
#include<conio.h>
//area of circle no argument & returntype
int area();
void main()
{
   float ar;
   clrscr();
   ar=area();
   printf("area of circle is %f",ar);
   getch();



}
int area()
{
  float r,pi=3.142,a;
  printf("Enter the value of radius ");
  scanf("%f",&r);
  a=pi*r*r;
  return a;
}