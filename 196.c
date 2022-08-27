#include<stdio.h>
#include<stdlib.h>
#include<fcntl.h>
#include<unistd.h>
int main()
{
	int fd  = 0;int iCnt = 0;int iSize = 0;
	char Name[30]="\0";
	
	printf("Enter File name \n");
	scanf("%s",Name);
	fd = open(Name,O_RDWR||O_APPEND);
	if(fd!=-1)
	{
	printf("File opened Successfuly\n");
    }
    printf("Enter size of data to write\n");
    scanf("%d",&iSize);
    char Data[iSize];
    printf("Enter what you want to write in file\n");
    scanf(" %[^'\n']s",Data);
    
    lseek(fd,0,2);
    
	write(fd,Data,iSize);

	printf("Data has Written Successfully\n");

	return 0 ;
}
