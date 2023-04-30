#include<stdio.h>
#include<conio.h>
//area of triangle no argument no returntype

void areat();
void main()
{
  clrscr();
  areat();
  getch();
}
void areat()
{
     float b=5,h=15,area;

     area=0.5*b*h;
     printf("area of triangle is %f ",area);

}