//
//  main28.cpp
//  LeetCode
//
//  Created by linSir on 2017/9/9.
//  Copyright © 2017年 58qifu. All rights reserved.
//

#include <stdio.h>
#include <string>
#include <vector>
#include <iostream>


class Solution {
public:
    int strStr(std::string haystack, std::string needle) {
        
        int len = needle.size();
        if (haystack.size() < len) return -1;
        for (int idx=0; idx <= haystack.size()- len; idx++){
            if (std::string (haystack.begin()+idx, haystack.begin()+idx+len) == needle) return idx;
        }
        return -1;
    }
};



int main28(){
    std::string text = "aaa";
    std::cout<< text[0];
    std::string("aaa","bbb");
    return 0;
}



