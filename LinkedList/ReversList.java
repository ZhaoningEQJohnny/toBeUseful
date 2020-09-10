class ReversList {

    public ListNode reverseListWithLoop(ListNode head) {
        ListNode pre = null, cur = head, next = null;
        while(cur != null) {
            next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
        return pre;
    }
    
    public ListNode reverseListWithRecur(ListNode head) {
        if(head == null || head.next == null) {
            return head;
        }
        ListNode node = reverseListWithRecur(head.next);
        head.next.next = head;
        head.next = null;
        return node;
    }
}


