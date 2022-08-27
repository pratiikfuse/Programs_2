/*
Accept file name from user and Create the file
*/
#include<stdio.h>
#include<stdlib.h>
#include<fcntl.h>
int main()
{
	int fd = 0 ;
	char Arr[30]="\0";
	printf("Enter file Name\n");
	scanf("%s",Arr);

	fd = creat(Arr,0777);

	if(fd!=-1)
	{
		printf("File Successfuly Created\n");
	}
	return 0 ;
}