/*
Write application which accept file name from user and display size of file.
Input : Demo.txt
Output : File size is 56 bytes
*/
#include<stdio.h>
#include<fcntl.h>
#include<stdlib.h>
int main()
{
	int fd = 0 ;int iRet = 0;
	char Name[30]="\0";
	char Arr[1024]="\0";
	printf("Enter name of file you want to read the data\n");
	scanf("%s",Name);
	fd=open(Name,O_RDONLY);

     printf("Data is :\n");
     int iSum = 0;
     while((iRet=read(fd,Arr,sizeof(Arr)))!=0)
     {
     	printf("%s",Arr);
     	iSum = iSum + iRet;
     }
     printf("Size of file is : %d bytes\n",iSum);
	return 0 ;
}