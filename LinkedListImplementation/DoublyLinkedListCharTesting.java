
public class DoublyLinkedListCharTesting {

    public static void main(String[] args) {
        testInteger();
    }

    public static void testInteger() {
        DoublyLinkedSimpleList<Integer> list = new DoublyLinkedSimpleList<Integer>();
        list.add(1);
        list.add(0);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);

        list.printToString();
        System.out.println(list.removeFirst());
        System.out.println(list.removeLast());
        list.printToString();
        System.out.println("last: " + list.getLast());
        System.out.println("first: " + list.getFirst());

        System.out.println("List size: " + list.size());
        System.out.println();
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));
        System.out.println(list.get(3));
        System.out.println(list.get(4));
        System.out.println(list.get(5));
        System.out.println(list.get(6));
        System.out.println(list.get(7));
    }

    public static void testCharacter() {
        DoublyLinkedSimpleList<Character> list = new DoublyLinkedSimpleList<Character>();
        list.add('1');
        list.add('0');
        list.add('1');
        list.add('2');
        list.add('3');
        list.add('4');
        list.add('5');
        list.add('6');
        list.add('7');
        list.add('8');

        list.printToString();
        System.out.println(list.removeFirst());
        System.out.println(list.removeLast());
        list.printToString();
        System.out.println("last: " + list.getLast());
        System.out.println("first: " + list.getFirst());

        System.out.println("List size: " + list.size());
        System.out.println();
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));
        System.out.println(list.get(3));
        System.out.println(list.get(4));
        System.out.println(list.get(5));
        System.out.println(list.get(6));
        System.out.println(list.get(7));
    }
}
