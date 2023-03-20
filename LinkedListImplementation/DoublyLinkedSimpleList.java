
public class DoublyLinkedSimpleList<T> {

    private LNode<T> firstNode;
    private LNode<T> lastNode;
    private int size;

    public DoublyLinkedSimpleList() {
        this.firstNode = new LNode<T>();
        this.lastNode = new LNode<T>();
        this.size = 0;
    }

    public void add(T c) {
        if (this.size == 0) { //initializing the list for the first time essentially
            this.firstNode = new LNode<T>(c);
            //this.firstNode.prev = null right now, this will not change unless it is removed from the list!
            //actually technically this will never change bc just a new thing will become firstNode and then
            //that firstNode's prev will be made null lol
            this.lastNode = this.firstNode;
        } else if (this.size == 1) {
            this.lastNode = new LNode<T>(c, this.firstNode); //makes lastNode.prev point to firstNode
            this.firstNode.next = this.lastNode; //firstNode.next is no longer null!
            //in the future probably can just test whether pointers are null and
            //that will prob tell us how to go about adding to the list; no need to 
        } else {
            LNode<T> temp = this.lastNode;
            this.lastNode = new LNode<T>(c, temp); //a new node, 
            //with its previous pointer going to point to the previous lastNode.
            temp.next = this.lastNode;
        }
        this.size++;
    }

    public T removeFirst() {
        T first = this.firstNode.data;
        this.firstNode = this.firstNode.next;
        this.firstNode.prev = null; //unhooks previous firstNode.
        this.size--;
        return first;
    }

    public T removeLast() {
        T last = this.lastNode.data;
        this.lastNode = this.lastNode.prev;
        if (this.lastNode != null) { //if it is null, size is 0
            this.lastNode.next = null; //unhook the previous lastNode from the list.
        } else {
            this.firstNode = null; //if it is null, list size is 0 now; unhook first node from the list as well.
        }
        this.size--;
        return last;
    }

    public T get(int index) { //CLEAN get
        this.validateIndex(index);

        boolean forwardTraversal = true;
        int distance = index;
        LNode<T> ret = this.firstNode;
        int halfwayIndex = (this.size()) / 2;
        if (index >= halfwayIndex) {
            forwardTraversal = false;
            distance = this.size() - 1 - index;
        }

        if (forwardTraversal) {
            for (int i = 0; i < distance; i++) {
                ret = ret.next;
            }
        } else { //backwards traversal.
            ret = this.lastNode;
            for (int i = 0; i < distance; i++) {
                ret = ret.prev;
            }
        }
        return ret.data;
    }

    public T getFirst() {
        return this.firstNode.data;
    }

    public T getLast() {
        return this.lastNode.data;
    }

    public int size() {
        return this.size;
    }

    private void validateIndex(int index) {
        if (index >= this.size()) {
            System.out.println("ERROR: Index " + index + " out of bounds for "
                    + "DoublyLinkedListChar of size " + this.size());
            throw new IndexOutOfBoundsException();
        }
    }

    /**
     * Debug.
     */
    public void printToString() {
        String s = "";
        LNode<T> a = new LNode<T>();
        a = this.firstNode;
        for (int i = 0; i < this.size; i++) {
            s += a.data;
            a = a.next;
        }
        System.out.println(s);
    }

}
