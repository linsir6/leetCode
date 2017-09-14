class Main23 {
    
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists == null || lists.length == 0) return null;
        return sort(lists, 0, lists.length - 1);
    }
    
    public static ListNode sort(ListNode[] lists, int left, int right) {
        if (left >= right) return lists[left];
        int center = left + (right - left) / 2;
        ListNode node = sort(lists, left, center);
        ListNode node2 = sort(lists, center + 1, right);
        return merage(node, node2);
    }
    
    private static ListNode merage(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(0);
        ListNode first = head;
        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                first.next = l1;
                l1 = l1.next;
            } else {
                first.next = l2;
                l2 = l2.next;
            }
            first = first.next;
        }
        if (l1 == null) first.next = l2;
        if (l2 == null) first.next = l1;
        return head.next;
    }
}
