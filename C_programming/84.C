#include<stdio.h>
#include<conio.h>
//celsius to farenheit argument & returntype

int celf(int cel);
void main()
{

  int c,cf;
  clrscr();
  cf=celf(c);
  printf("celsius to farenheit temperature is %d",cf);
  getch();
}
int celf(int cel)
{
  float fnh;
  printf("Enter the  celsius temperature");
  scanf("%d",&cel);
  fnh=((cel*9/5)+32);
  return fnh;
}