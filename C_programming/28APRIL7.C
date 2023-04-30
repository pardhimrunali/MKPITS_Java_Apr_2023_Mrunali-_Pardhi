	#include<stdio.h>
#include<conio.h>
// chaeck vowel or constant with no argument no returntype
void check();
void main()
{
  clrscr();
  check();
  getch();

}
void check()
{
  char c;
  printf("enter the character");
  scanf("%c",&c);
  if((c==65 || c==69 || c==73 || c==79 || c==85) || (c=='a' || c=='e' || c=='i'|| c=='o' || c=='u'))

  {

      printf("character is  vowel");
  }
  else
  {

    printf ("character is consonant");
  }



}