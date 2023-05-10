#include<stdio.h>
#include<conio.h>
//A
//AB
//ABC
//ABCD
void main()
{
    int r,c;
    clrscr();
    for(r='A';r<'E';r++)
    {
      for(c='A';c<=r;c++)
      {
	printf("%c",c);

     }
     printf("\n");
}
getch();
}




