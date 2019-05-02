public class addTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode newHead = new ListNode(0);
        ListNode cur1 = l1,cur2 = l2,curr = newHead;
        int carry = 0;
        while(cur1!=null || cur2!=null){
            int x = (cur1!=null) ? cur1.val:0;
            int y = (cur2!=null) ? cur2.val:0;
            int sum = carry+x+y;
            carry = sum/10;

            curr.next = new ListNode(sum%10);
            curr = curr.next;
            if(cur1!=null) cur1 = cur1.next;
            if(cur2!=null) cur2 = cur2.next;
        }
        if(carry>0){
            curr.next = new ListNode(carry);
        }
        return newHead.next;
    }
}
