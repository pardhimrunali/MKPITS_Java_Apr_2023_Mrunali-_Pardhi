#include<stdio.h>
#include<conio.h>
void main()
{
   int r,c;
   clrscr();
   for(r=1;r<6;r++)
   {
     for(c='E';c>='A';c--)
     {
       printf("%c",c);
     }
      printf("\n");
   }
   getch();
}