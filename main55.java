class Main55 {
    
    public boolean canJump(int[] nums) {
        int reach = nums[0];
        for(int i = 1; i < nums.length && reach >= i; i++)
            if(i + nums[i] > reach) reach = i + nums[i];  //贪心策略
        return reach >= (nums.length-1) ? true : false;
    }
}
<<<<<<< HEAD

//test2
//test5
=======
//testza
//test3a
>>>>>>> 0718cc375278fb5871cbf83281b19cde5aa38bda
//merage
//test merage
