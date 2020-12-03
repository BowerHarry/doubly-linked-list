class ListNode2 {
    Object element;
    ListNode2 prev = null;
    ListNode2 next = null;

    ListNode2(Object e, ListNode2 p, ListNode2 n) {
        element = e;
        prev = p;
        next = n;
    }
}