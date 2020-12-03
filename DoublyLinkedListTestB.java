public class DoublyLinkedListTestB {
    public static void main(String[] args) {
        DoublyLinkedList l = new DoublyLinkedList();

        l.insert("orange", 0);
        l.print();
        System.out.println("Should be: front to back: orange -- and back to front: orange");
        System.out.println();

        l.insert("apple", 1);
        l.print();
        System.out.println("Should be: front to back: orange apple -- and back to front: apple orange");
        System.out.println();

        l.insert("pear", 1);
        l.print();
        System.out.println("Should be: front to back: orange pear apple -- and back to front: apple pear orange");
        System.out.println();

        l.insert("kiwifruit", 3);
        l.print();
        System.out.println("Should be: front to back: orange pear apple kiwifruit -- and back to front: kiwifruit apple pear orange");
        System.out.println();

        l.insert("banana", 2);
        l.print();
        System.out.println("Should be: front to back: orange pear banana apple kiwifruit -- and back to front: kiwifruit apple banana pear orange");
        System.out.println();
    }
}
