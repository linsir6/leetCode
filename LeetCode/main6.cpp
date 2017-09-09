//
//  main6.cpp
//  LeetCode
//
//  Created by linSir on 2017/9/8.
//  Copyright © 2017年 58qifu. All rights reserved.
//

#include <stdio.h>
#include <string>
#include <vector>
#include <iostream>

class Solution {
public:
    std::string convert(std::string s, int nRows) {
        if(nRows==1)return s;
        int l=s.size();
        int r=0,t=1;
        std::string *ss = new std::string[nRows];
        for(int i=0;i<l;i++){
            ss[r].push_back(s[i]);
            if(r==0)t=1;
            else if(r==nRows-1)t=-1;
            r+=t;
        }
        std::string sss="";
        for(int i=0;i<nRows;i++){
            sss.append(ss[i]);
        }
        delete[] ss;
        return sss;
    }
};

int main6(){
    
    std::cout<< "test" << std::endl;
    
    return 0;
}

