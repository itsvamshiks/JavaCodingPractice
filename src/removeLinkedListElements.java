public class removeLinkedListElements {
    public ListNode removeElements(ListNode head, int val) {
        ListNode dH = new ListNode(-1);
        dH.next = head;

        ListNode updList = dH;
        while(updList.next != null){
            if(updList.next.val == val) {
                updList.next = updList.next.next;
            }
            else {
                updList = updList.next;
            }
        }

        return dH.next;
    }
}
