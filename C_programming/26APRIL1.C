
//       1
//     1   2
//   1   2   3
#include<stdio.h>
#include<conio.h>
void main()
{
  int r,c,sp;
  clrscr();
  for(r=1;r<=3;r++)
  {
  for(sp=1;sp<=10-r;sp++)
  {
  printf(" ");
  }
   for(c=1;c<=r;c++)
   {
   printf(" %d",c);
   }
   printf("\n");
  }
  getch();
}