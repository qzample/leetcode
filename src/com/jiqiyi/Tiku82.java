package com.jiqiyi;

class Tiku82 {
    public static void main(String[] args) {
        
    }

    public ListNode deleteDuplicates(ListNode head) {
        ListNode dummyNode = new ListNode();
        ListNode pre=dummyNode,cur=head,next;
        while(cur!=null){
            next = cur.next;
            if(next==null || next.val!=cur.val){
                pre.next = cur;
                cur.next = null;
                pre = cur;
            }
            else{
                while(next!=null && next.val==cur.val){
                    next = next.next;
                }
            }
            cur = next;
        }
        return dummyNode.next;
    }
    
    /**
     * the second time to practice
     */
    public ListNode deleteDuplicates2(ListNode head) {
        ListNode dummyNode = new ListNode();
        dummyNode.next = head;
        ListNode pre=dummyNode,cur=head,next;
        while(cur.next!=null){
            next = cur.next;
            if(cur.val==next.val){
                while(cur!=null && cur.val==next.val){
                    cur = cur.next;
                }
                pre.next = cur;
            }
            else{
                pre = cur;
                cur = next;
            }
        }
        return dummyNode.next;
    }
}
