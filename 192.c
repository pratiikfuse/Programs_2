/*
Write application which accept file name from user and open that file in read mode.
Input : Demo.txt
Output : File opened successfully.
*/
#include<stdio.h>
#include<stdlib.h>
#include<fcntl.h>
int main()
{
	char Arr[30]="\0";
	printf("Enter File Name\n");
	scanf("%s",Arr);
	int fd = 0;

	fd = open(Arr,O_RDONLY);

	if(fd!=-1)
	{
		printf("File Opened in read Mode Successfully\n");
		printf("File Descripotr number is : %d\n",fd);
	}
	return 0 ;
}