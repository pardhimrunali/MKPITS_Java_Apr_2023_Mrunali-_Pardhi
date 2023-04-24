#include<stdio.h>
#include<conio.h>
void main()
{
   int r,c;
   clrscr();
   for(r=1;r<4;r++)
   {
      for(c=1;c<4;c++)
      {
	 printf("*");
      }
      printf("\n");
   }
   getch();
}
