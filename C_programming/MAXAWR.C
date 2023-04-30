#include<stdio.h>
#include<conio.h>

		    //argument with returntype
int maximum();

void  main()
{




      int mx;

     int a,b;
    mx=maximum(a,b);
    printf("maximum is %d",mx);



   getch();

}





int maximum(int x,int y)
{

    int m;
    printf("Enter two numbers");
    scanf("%d%d",&x,&y);





    if(x>y)
    {



	m=x;
    }

    else
    {




	m=y;


    }

 return m;






    }