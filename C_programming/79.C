#include<stdio.h>
#include<conio.h>
//vowel or consonant function with argument & no returntype
void vowcon();
void main()
{
  char c;
  clrscr();
  vowcon(c);
  getch();

}
void vowcon(char ch)
{

   printf("Enter the chracter");
   scanf("%c",&ch);
   if((ch==65 || ch==69 || ch==73 || ch==79 || ch==85) || (ch=='a'|| ch=='e'|| ch=='i'|| ch=='o'|| ch=='u'))
    {

       printf("chracter is vowel");
    }
    else
    {
	printf("chracter is consonant");
    }
}




