public class DoublyLinkedListTestA {
    public static void main(String[] args) {
        DoublyLinkedList l = new DoublyLinkedList();

        l.addFirst("apple");
        l.addFirst("pear");
        l.addFirst("orange");
        l.print();
        System.out.println("Should be: front to back: orange pear apple -- and back to front: apple pear orange");
}
}
