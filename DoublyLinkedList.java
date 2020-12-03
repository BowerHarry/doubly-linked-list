class DoublyLinkedList {
    private ListNode2 head = null;
    private int n = 0; // list size

    public Object get(int i) {
        if (i<0 || i>=n) {
            return null;
        }
        ListNode2 node = head;
        for (int j=0; j<i; j++) {
            node = node.next;
        }
        return node.element;
    }


    public void addFirst(Object o) {
        if (head==null) {
            head = new ListNode2 (o, null, null);
            n++;
            return;
        }
        ListNode2 node = new ListNode2(o, null, head);
        head.prev = node;
        head = node;
        n++;
    }

    public void insert(Object o, int i) {
        if (i<0 || i>n) {
            return;
        }
        if (i==0) {
            addFirst(o);
            return;
        }

        ListNode2 node = head;
        for (int j=0; j<i-1; j++){
            node = node.next;
        }
        ListNode2 newNode = new ListNode2(o, null, node.next);
        if (i<n){
            node.next.prev = newNode;
            newNode.next = node.next;
        }
        node.next = newNode;
        newNode.prev = node;
        n++;
    }

    public void remove(int i) {
        if (i<0 || i>=n){
            return;
        }
        if (i==0) {
            if (head.next != null){
                head = head.next;
                head.prev = null;
                n--;
                return;
            }
            else {
                head = null;
                n--;
                return;
            }
        }

        ListNode2 node = head;
        for (int j=0; j<i-1; j++){
            node = node.next;
        }
        if (node.next.next != null) {
            node.next = node.next.next;
            node.next.prev = node;
        }
        else {
            node.next = null;
        }
        n--;
    }

    /**
     * Prints out the elements in the list from the first to the last (front to back) and then from the last to the first
     * (back to front). This is useful to test whether the list nodes are connected correctly with next and prev references.
     */
    public void print() {
        // no elements to print for empty list
        if (head == null) {
            System.out.println("list empty.");
            return;
        }

        // follow next references to list elements from the front to the back of the list
        System.out.print("front to back: ");
        ListNode2 node = head;
        System.out.print(node.element + " ");
        while (node.next != null) {
            node = node.next;
            System.out.print(node.element + " ");
        }

        // follow prev references to list elements from the back to the front of the list
        System.out.print("-- and back to front: ");
        while (node != null) {
            System.out.print(node.element + " ");
            node = node.prev;
        }
        System.out.println();
    }
}
