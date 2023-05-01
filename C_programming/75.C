#include<stdio.h>
#include<conio.h>
// celsius to ferenheit	function with  argument & no returntype
void cf();
void main()
{
  int c=39;
  cf(c);
  getch();

}
void cf(int x)
{
       float f;


       f=(x*9/5)+32;
       printf("Ferenheit temperature is %f",f);
}