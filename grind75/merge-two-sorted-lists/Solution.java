
class Solution {

    class ListNode {

        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }
    }

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode(1);
        ListNode merge = dummy;

        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                merge.next = list1;
                list1 = list1.next;
            } else {
                merge.next = list2;
                list2 = list2.next;
            }
            merge = merge.next;
        }
        if (merge.next == list1) {
            merge.next = list2;
        } else {
            merge.next = list1;
        }
        return dummy.next;
    }
}
