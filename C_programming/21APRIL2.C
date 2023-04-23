#include<stdio.h>
#include<conio.h>
void main()
{
   int passw=1234;
   clrscr();
   printf("\n Enter the password");
   scanf("%d",&passw);
   if(passw!=1234)
   {
       printf("\n Incorrect password");
   }
   else
   {
       printf("\n Correct password");
   }
  getch();
}
