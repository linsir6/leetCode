
public class Main83 {

	public ListNode deleteDuplicates(ListNode head) {
        ListNode h1 = head;
        while(h1 != null && h1.next != null){
            if (h1.val == h1.next.val) {
                h1.next = h1.next.next;
            }else {
                h1 = h1.next;
            }
        }
        return head;
    }
}