//    1
//   22
//  333
void main()
{
  int row,col,space;
  clrscr();
  for(row=1;row<=3;row++)
  {
   for(space=1;space<=10-row;space++)
   {
     printf(" ");
   }
   {
     for(col=1;col<=row;col++)
     {
	printf("%d",row);
     }
   printf("\n");
  }
}
  getch();
}

