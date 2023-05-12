#include<stdio.h>
#include<conio.h>
void main()
{
   int r,c;
   clrscr();
   for(r=1;r<5;r++)
   {
      for(c='A';c<='E';c++)
      {
	 printf("%c",c);
      }
	   printf("\n");
   }
   getch();
}
