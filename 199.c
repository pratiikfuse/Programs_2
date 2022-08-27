/*
Write application which accept file name from user and read all data from that file
and display contents on screen.
Input : Demo.txt
Output : Display all data of file.
*/
#include<stdio.h>
#include<unistd.h>
#include<stdlib.h>
#include<fcntl.h>
int main()
{
	int fd  = 0;
	int iRet = 0;
  char fName[30]="\0";	
  char Buffer[1024];
  printf("Enter File name\n");
  scanf("%s",fName);

  fd = open(fName,O_RDWR);
  if(fd==-1)
  {
  	printf("Unable to open file\n");
  	return -1;
  }
  else
  {
  	printf("File Opened Successfully\n");
  }
  printf("Data from file is : \n");
  while((iRet=read(fd,Buffer,sizeof(Buffer)))!=0)
  {
  	write(1,Buffer,iRet);
  }
  printf("\n");
  close(fd);
	return 0;
}