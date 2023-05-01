#include<stdio.h>
#include<conio.h>
//area of triangle function with argument & returntype

int areat(int x,int y);
void main()
{
   float at;
   int b,h;
   clrscr();
   at=areat(b,h);
   printf("area of triangle is %f",at);
   getch();

}
int areat(int x,int y)
{
	float a;
	printf("Enter the value of base and height");
	scanf("%d%d",&x,&y);
	a=0.5*x*y;
	return a;
}


