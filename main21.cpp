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


struct ListNode {
    int val;
    ListNode *next;
    ListNode(int x) : val(x), next(NULL) {}
};


class Solution {
public:
    ListNode* mergeTwoLists(ListNode* l1, ListNode* l2) {
        
        ListNode *result = new ListNode(0);
        ListNode *p1 = l1;
        ListNode *p2 = l2, *tail = result;
        
        while (p1 && p2) {
            if (p1->val <= p2->val) {
                tail->next = p1;
                p1 = p1->next;
            } else {
                tail->next = p2;
                p2 = p2->next;
            }
            tail = tail->next;
        }
        
        if (p1) {
            tail->next = p1;
            p1 = p1->next;
        }
        
        if (p2) {
            tail->next = p2;
            p2 = p2->next;
        }
        
        tail = result;
        result = tail->next;
        delete(tail);
        
        return result;
    }
};


int main21(){
    
    std::cout << "static constructor\n";
    return 0;
}





