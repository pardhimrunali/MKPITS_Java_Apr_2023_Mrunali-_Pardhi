#include<stdio.h>
#include<conio.h>
//celsius to farenheit function with no argument & returntype
float cf();
void main()
{
    float f;
    clrscr();
    f=cf();
    printf("celsius to farenheit temperature is %f",f);
    getch();

}
float cf()
{
    float c,celf;
    printf("Enter the value of celsius temperature");
    scanf("%f",&c);
    celf=((c*9/5)+32);
    return celf;
}