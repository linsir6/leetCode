//
//  main22.cpp
//  LeetCode
//
//  Created by linSir on 2017/9/6.
//  Copyright © 2017年 58qifu. All rights reserved.
//

#include <stdio.h>
#include <string>
#include <vector>
#include <iostream>

class Solution {
public:
    std::vector<std::string> generateParenthesis(int n) {
        std::vector<std::string> allComb;
        std::string comb;
        findParenthesis(n, 0, 0, comb, allComb);
        return allComb;
    }
    
    void findParenthesis(int n, int nleft, int nright, std::string &comb, std::vector<std::string> &allComb) {
        if(nleft==n && nright==n) {
            allComb.push_back(comb);
            return;
        }
        
        if(nleft<n) {
            comb.push_back('(');
            findParenthesis(n, nleft+1, nright, comb, allComb);
            comb.pop_back();
        }
        
        if(nright<nleft) {
            comb.push_back(')');
            findParenthesis(n, nleft, nright+1, comb, allComb);
            comb.pop_back();
        }
    }
};


int main(){
    std::cout << "static constructor\n";
    return 0;
}










