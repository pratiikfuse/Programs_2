/*
Write application which accept file name from user and display size of file.
Input : Demo.txt
Output : File size is 56 bytes
*/
#include<stdio.h>
#include<unistd.h>
#include<fcntl.h>
#include<stdlib.h>
int main()
{
	int fd  = 0;
	int iSize = 0;
	char fName[30] = "\0";
	printf("Enter file name\n");
	scanf("%s",fName);

	fd = open(fName,O_RDONLY);

	iSize = lseek(fd,0,2);

	printf("Size of File is : %d bytes\n",iSize);
	close(fd);
	return 0;
}