#include<stdio.h>
#include<conio.h>
// area of triangle function with argument & no returntype
void triangle();
void main()
{
  int b,h;
  clrscr();
  triangle(b,h);
  getch();

}
void triangle(int x,int y)
{
  float a;
  printf("Enter the value of base & height");
  scanf("%d%d",&x,&y);
  a=0.5*x*y;
  printf("Area of triangle is %f",a);
}