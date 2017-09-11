//
//  main11.cpp
//  LeetCode
//
//  Created by linSir on 2017/9/11.
//  Copyright © 2017年 58qifu. All rights reserved.
//

#include <stdio.h>
#include <string>
#include <vector>
#include <iostream>

class Solution {
public:
    
    int findMax(int a,int b){
        if(a >= b){
            return a;
        }else{
            return b;
        }
    }
    
    int findMin(int a,int b){
        if (a >= b) {
            return b;
        }else{
            return a;
        }
    }
    
    int maxArea(std::vector<int>& height) {
        if (height.size() == 0 || height.size() < 2) {
            return 0;
        }
        
        int left = 0;
        int right = (int)height.size() - 1;
        int result = 0;
        int temp = 0;
        
        while(left < right){
            temp = (right - left) * findMin(height[left] , height[right]);
            result = findMax(result, temp);
            if(height[left]<height[right]){
                left++;
            }else{
                right--;
            }
        }
        return result;
    }
};
