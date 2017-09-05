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

class Solution {
public:
    std::string longestCommonPrefix(std::vector<std::string> &strs) {
        if (strs.empty())
            return "";
        for (int i = 0; i < strs[0].length(); i++) {
            for (int j = 1; j < strs.size(); j++)
                if (i >= strs[j].length() || strs[j][i] != strs[0][i])
                    return strs[0].substr(0, i);
        }
        return strs[0];
    }
};

int main(){
    Solution so ;
    std::vector<std::string> v = {"123","1234"};
    std::string text = so.longestCommonPrefix(v);
    std::cout << "static constructor\n";
    std::cout << text + "\n";
    return 0;
}

