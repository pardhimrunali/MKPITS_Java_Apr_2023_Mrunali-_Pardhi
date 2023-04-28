#include<stdio.h>
#include<conio.h>
// no argument with no returntype

void add();
void main()
{
 clrscr();
 add();
 getch();



}
void add()
{

    int n1,n2,sum;
    clrscr();
    printf("Enter two numbers");
    scanf("%d%d",&n1,&n2);
    sum=n1+n2;
   printf("sum of number is %d",sum);
}