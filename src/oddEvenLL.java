public class oddEvenLL {
    public ListNode oddEvenList(ListNode head) {
        if(head==null) return null;
        ListNode op = head;
        ListNode ep = head.next;
        ListNode following = ep;

        while(ep!=null && ep.next!=null){
            op.next = ep.next;
            op = op.next;
            ep.next = op.next;
            ep = ep.next;
        }

        op.next = following;
        return head;

    }
}
