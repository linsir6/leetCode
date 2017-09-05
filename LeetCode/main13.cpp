#include<stdio.h>
#include<string.h>
char a[30],b[30];
int lena,lenb;
int LCS(int,int);

int main13()
{
    strcpy(a,"abcd");
    strcpy(b,"abcd");
    lena=strlen(a);
    lenb=strlen(b);
    printf("%d\n",LCS(0,0));
    return 0;
}

int LCS(int i,int j)
{
    if(i>=lena || j>=lenb)
        return 0;
    if(a[i]==b[j])
        return 1+LCS(i+1,j+1);
    else
        return LCS(i+1,j)>LCS(i,j+1)? LCS(i+1,j):LCS(i,j+1);
}
