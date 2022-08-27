/*
Write application which accept file name from user and read all data from that file
and display contents on screen.
Input : Demo.txt
Output : Display all data of file.
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
     while((iRet=read(fd,Arr,sizeof(Arr)))!=0)
     {
     	printf("%s",Arr);
     }
	return 0 ;
}