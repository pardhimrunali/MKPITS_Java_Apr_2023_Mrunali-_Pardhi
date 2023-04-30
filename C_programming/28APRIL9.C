
#include<stdio.h>
#include<conio.h>
// celsius to ferenheit	function with no argument & no returntype
void cf();
void main()
{
  clrscr();
  cf();
  getch();

}
void cf()
{
       float c,f;
       printf("Enter the celsius temperature");
       scanf("%f
       ",&c);
       f=(c*9/5)+32;
       printf("Ferenheit temperature is %f",f);
}