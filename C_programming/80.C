#include<stdio.h>
#include<conio.h>
//area of circle function with argument & returntype
int area(int radius);
void main()
{

    int r=8;
    float ar;
    clrscr();
   ar= area(r);
   printf("area of circle is %f",ar);
   getch();

}
int area(int radius)
{

     float pi=3.142,a;
     a=pi*radius*radius;
     return a;
}

