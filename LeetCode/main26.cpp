//
//  main26.cpp
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
    int removeDuplicates(std::vector<int>& nums) {
        if ( nums.size()== 0) {
            return 0;
        }
        int count = 1;
        for (int i = 0; i < nums.size() - 1; i++) {
            if (!(nums[i] == nums[i + 1])) {
                nums[count] = nums[i + 1];
                count++;
            }
        }
        return count;
    }
};

