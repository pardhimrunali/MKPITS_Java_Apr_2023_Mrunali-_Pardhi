#include<stdio.h>
#include<conio.h>
//find area of circle with argument and no returntype
void area();
void main()
{
    int a=4;
    area(a);
    getch();
}
void area(int x)
{
   float y,pi=3.142;
   y=pi*x*x;
   printf("Area of circle is %f",y);
}