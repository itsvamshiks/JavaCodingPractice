public class hasCycle {
    public boolean hasCycle(ListNode head) {
        if(head==null || head.next==null)
            return false;

        ListNode fp = head;
        ListNode sp = head.next;

        while(fp!=sp){
            if(sp==null || sp.next==null)
                return false;

            fp = fp.next;
            sp = sp.next.next;
        }
        return true;

    }
}
