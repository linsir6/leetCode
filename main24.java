class Main24 {
    
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode temp = head.next;
        head.next = swapPairs(temp.next);
        temp.next = head;
        return temp;
    }
}
