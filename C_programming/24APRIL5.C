#include<stdio.h>
#include<conio.h>
void main()
{
   int r,c;
   clrscr();
   for(r=65;r<68;r++)
   {
      for(c=1;c<6;c++)
      {
	 if(c==1)
	 {
	  printf("%c",r);
	 }
	 else
	 {
	    printf("%c",r+32);
	 }
      }
      printf("\n");
   }
   getch();
}