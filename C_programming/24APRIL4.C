#include<stdio.h>
#include<conio.h>
void main()
{
   int r,c;
   clrscr();
   for(r='A';r<'E';r++)
   {
     for(c=1;c<6;c++)
     {
	   printf("%c",r);
     }
     printf("\n");
   }
   getch();
}