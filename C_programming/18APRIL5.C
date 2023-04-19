#include<stdio.h>
#include<conio.h>
#include<math.h>
void main()
{
  float x1,x2,y1,y2,distance;
  printf("\n Enter the point 1");
  scanf("%f%f",&x1,&y1);
  printf("\n Enter the point 2");
  scanf("%f%f",&x2,&y2);
  distance=sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2));
  printf("\n Distance between two point is %f",distance);
  getch();
}