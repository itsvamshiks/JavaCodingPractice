public class palindromeLinkedLists {
    public boolean isPalindrome(ListNode head) {
        ListNode f = head,s = head;
        while(f!=null && f.next!=null){
            f = f.next.next;
            s = s.next;
        }

        if(f!=null){
            s = s.next;
        }
        s = reverse(s);
        f = head;

        while(s!=null){
            if(f.val!=s.val)
                return false;

            f = f.next;
            s = s.next;
        }
        return true;

    }

    public ListNode reverse(ListNode current){
        ListNode prev = null;
        while(current!=null){
            ListNode next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }
}
