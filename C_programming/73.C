#include<stdio.h>
#include<conio.h>
//no argument with returntype
int max();

void main()
{
		  int mx;
   mx=max();
   printf("maximum is %d",mx);

  getch();

}
int max()
{
     int a,b,m;
   printf("Enter two numbers");
    scanf("%d%d",&a,&b);
     if(a>b)
     {
      m=a;
     }
     else
     {
      m=b;

    }

     return m;
}