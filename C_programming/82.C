#include<stdio.h>
#include<conio.h>
//square of no. function with argument and returntype

int square(int x);
void main()
{
    int s;
    int no;
    clrscr();
    s=square(no);
    printf("square of number is %d",s);
    getch();


}
int square(int x)
{
   int sq;
   printf("Enter the number");
   scanf("%d",&x);
   sq=x*x;
   return sq;
}








