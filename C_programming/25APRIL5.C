#include<stdio.h>
#include<conio.h>
//12345
//1234
//123
//12
//1
void main()
{
  int r,c;
  clrscr();
  for(r=5;r>=1;r--)
  {
    for(c=1;c<=r;c++)
    {
      printf("%d",c);
    }
    printf("\n");
  }
  getch();
}