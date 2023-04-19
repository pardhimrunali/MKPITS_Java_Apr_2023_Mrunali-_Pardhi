#include<stdio.h>
#include<conio.h>
void main()
{
  int x;
  float y;
  printf("\n total distance in km");
  scanf("%d",&x);
  printf("\n total fuel spent in liters");
  scanf("%f",&y);
  printf("\n Average consumption  %.3f",x/y);
  getch();
}