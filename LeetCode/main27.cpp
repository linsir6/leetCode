//
//  main27.cpp
//  LeetCode
//
//  Created by linSir on 2017/9/7.
//  Copyright © 2017年 58qifu. All rights reserved.
//

#include <stdio.h>
#include <string>
#include <vector>
#include <iostream>

class Solution {
public:
    int removeElement(std::vector<int>& nums, int val) {
        
        if (nums.size() == 0) {
            return 0;
        }
        
        int count = 0;
        int max = nums.size();
        for(int i=0;i<max;i++){
            if(nums[i] != val){
                nums[count++] = nums[i];
            }
        }
        return count;
    }
    
    void print(){
        std::cout<<"test";
    }
};

int main(){
    Solution s;
    std::vector<int> nums;
    
    nums.push_back(3);
    nums.push_back(3);
    
    for(int i=0;i<nums.size();i++){
        std::cout<< nums[i] << std::endl;
    }
    
    int result = s.removeElement(nums, 5);
    
    for(int i=0;i<nums.size();i++){
        std::cout<< nums[i] << std::endl;
    }

    
    
    std::cout<< result;
    
    
    
    
    return 0;
}





