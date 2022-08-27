/*
Write a program which accepts file name from user and count number of
small characters from that file.
Input : Demo.txt
Output : Number of small characters are 21
*/
#include<stdio.h>
#include<unistd.h>
#include<fcntl.h>
#include<stdlib.h>
int main()
{
  int fd  = 0; int iRet = 0;
  int iCnt = 0;
  int i = 0;
  char fName[30]="\0";
  char Buffer[1024];
  printf("Enter Name of File\n");
  scanf("%s",fName);

  fd = open(fName,O_RDWR);
  if(fd==-1)
  {
  	printf("unable to open file\n");
  	return -1;
  }
  else
  {
  	printf("File Opened Successfully\n\n");
  }

  while((iRet=read(fd,Buffer,sizeof(Buffer)))!=0)
  {
  	for(i=0;i<iRet;i++)
  	{
  		if((Buffer[i]>='a')&&(Buffer[i]<='z'))
  		{
  			iCnt++;
  		}
  	}
  }
  printf("Number of Small letters in %s file are : %d\n\n",fName,iCnt);
  close(fd);
	return 0;
}