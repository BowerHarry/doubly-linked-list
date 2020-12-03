public class DoublyLinkedListTestC {
    public static void main(String[] args) {
        DoublyLinkedList l = new DoublyLinkedList();

        l.addFirst("kiwifruit");
        l.addFirst("pear");
        l.addFirst("apple");
        l.addFirst("orange");

        l.remove(0);
        l.print();
        System.out.println("Should be: front to back: apple pear kiwifruit -- and back to front: kiwifruit pear apple");
        System.out.println();

        l.remove(1);
        l.print();
        System.out.println("Should be: front to back: apple kiwifruit -- and back to front: kiwifruit apple");
        System.out.println();

        l.remove(1);
        l.print();
        System.out.println("Should be: front to back: apple -- and back to front: apple");
        System.out.println();

        l.remove(0);
        l.addFirst("orange");
        l.print();
        System.out.println("Should be: front to back: orange -- and back to front: orange");
    }
}
