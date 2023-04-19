#include<stdio.h>
#include<conio.h>
void main()
{
  float iwt1,iwt2,np1,np2,average;
  printf("\n weight of item1");
  scanf("%f",&iwt1);
  printf("\n weight of item2");
  scanf("%f",&iwt2);
  printf("\n no. of item1 purchase");
  scanf("%f",&np1);
  printf("\n no. of item2 purchase");
  scanf("%f",&np2);
  average=((iwt1*np1)+(iwt2*np2))/(np1+np2);
  printf("\n average of items is %f",average);
  getch();
}