//
//  main.cpp
//  LeetCode
//
//  Created by linSir on 2017/9/5.
//  Copyright © 2017年 58qifu. All rights reserved.
//

#include <stdio.h>
#include <string>
#include <vector>
#include <iostream>

#include <stdio.h>
int main(void)
{
    int i,j,k,n=0;
    char c[4][5]={{'A','B','A','C','\0'},{'B','A','B','C','\0'},{'C','A','C','B','\0'}};
    char t;
    for(i=0;i<3;i++)
    for(j=0;j<4;j++)
    {
        for(k=0;k<4;k++)
        {  printf("%d -- %s\t",k,c[i]);  /*(k+3)%4,c[(k+3)%4]);*/
            n++; }
        printf("\n");
        t=c[i][i];c[i][i]=c[i][(i+1)%4];c[i][(i+1)%4]=c[i][(i+2)%4];c[i][(i+2)%4]=c[i][(i+3)%4];c[i][(i+3)%4]=t;
    }
    printf("\n total = %d",n);
    getchar();
}
