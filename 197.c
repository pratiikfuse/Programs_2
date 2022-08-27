/*
Write a program which accepts file name from user and count number of
capital characters from that file.
Input : Demo.txt
Output : Number of capital characters are 23
*/
#include<stdio.h>
#include<stdlib.h>
#include<unistd.h>
#include<fcntl.h>
int main()
{
	int fd = 0;int i,iCnt = 0;
	int iRet = 0;
	char fName[30]="\0";
	char Buffer[1024];
	printf("Enter File Name\n");
	scanf("%s",fName);

	fd=open(fName,O_RDWR);
	if(fd!=-1)
	{
      printf("File Opened Successfully\n");
	}

	while((iRet=read(fd,Buffer,sizeof(Buffer)))!=0)
	{
		for(i=0;i<iRet;i++)
		{
			if((Buffer[i]>='A')&&(Buffer[i]<='Z'))
			{
				iCnt++;
			}
		}
	}
	printf("Count of Capital letters in the %s file is : %d \n",fName,iCnt);
	clsose(fd);
	return 0;
}