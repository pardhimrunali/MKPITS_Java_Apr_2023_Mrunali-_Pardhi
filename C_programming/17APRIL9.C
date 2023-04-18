#include<stdio.h>
#include<conio.h>
void main()
{
  int nd,w,y,d;
  printf("\n Eneter the total number of days ");
  scanf("%d",&nd);
  y=nd/365;
  w=(nd%365)/7;
  d=nd-((y*365)+(w*7));
  printf("\n year is %d",y);
  printf("\n week is %d",w);
  printf("\n day is %d",d);

  getch();
}