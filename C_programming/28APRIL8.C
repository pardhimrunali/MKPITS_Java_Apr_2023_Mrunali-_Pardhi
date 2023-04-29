#include<stdio.h>
#include<conio.h>



void main()
{
int h,str,sp;
clrscr();
for(h=1;h<=5;h++)

   {
     for(sp=4;sp>=h;sp--)
     {

	printf(" ");
     }

   for(str=1;str<=h;str++)


    {
       printf(" *");
    }

 printf("\n");}
	    getch();
}