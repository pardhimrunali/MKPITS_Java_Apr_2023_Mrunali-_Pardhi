#include<stdio.h>
#include<conio.h>
void  main()
{
   int num,i;
   clrscr();
   printf("\n Enter the number");
   scanf("%d",&num);
   for(i=1; i<=num; i++)
   {
      printf("%d%d%d",i,i*i,i*i*i);
   }
   getch();

}
