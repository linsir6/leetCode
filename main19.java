class Main19 {
   
    public static ListNode removeNthFromEnd(ListNode head, int n) {
        
        if (n < 1) return head;
        int i = 0;
        ListNode before = head;
        while (i < n + 1 && before != null) {
            before = before.next;
            i++;
        }
        if(i == n+1){
            ListNode after = head;
            while(before!=null){
                before = before.next;
                after = after.next;
            }
            ListNode temp = after.next;
            after.next = temp.next;
        }else if (i == n){
            ListNode tmep = head;
            head = head.next;
        }
        return head;
    }
}
