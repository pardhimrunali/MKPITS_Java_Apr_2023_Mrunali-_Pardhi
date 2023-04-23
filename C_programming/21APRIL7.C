#include<stdio.h>
#include<conio.h>
void main()
{
  int num,i,y=1,x=0;
  clrscr();
  printf("\n Number");
  scanf("%d",&num);
  for(i=1;i<=num;i++)
  {
     while (x<3)
     {
	 printf("%d",y++);
	 x++;
     }
     x=0;
     printf("\n");
  }
  getch();
}