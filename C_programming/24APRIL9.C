#include<stdio.h>
#include<conio.h>
void main()
{
    int r,c;
    clrscr();

    for(r='E';r>='A';r--)
    {
       for(c=1;c<=5;c++)
       {
	 printf("%c",r);
       }
       printf("\n");

   }
   getch();
}