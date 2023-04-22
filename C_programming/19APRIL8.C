#include<stdio.h>
#include<conio.h>
int main()
{
  float numbers[5],total=0,avg;
  int j,pctr=0;
  clrscr();
  printf("\n Enter the first number");
  scanf("%f",&numbers[0]);
  printf("\n Enter the second number");
  scanf("%f",&numbers[1]);
  printf("\n Enter the third number");
  scanf("%d",&numbers[2]);
  printf("\n Enter the fourth numbers");
  scanf("%f",&numbers[3]);
  printf("\n Enter the fifth number");
  scanf("%f",&numbers[4]);
  for (j=0 ;j<5 ;j++)
  {
    if(numbers[j]>0)
    {
       pctr++;
       total +=numbers[j];
    }
  }
  avg=total/pctr;
  printf("\n Number of positive  numbers is %d",pctr);
  printf("\n Average value of the positive numbers  %.2f",avg);
  printf("\n");
  getch();
}
