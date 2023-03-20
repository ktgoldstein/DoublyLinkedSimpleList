
public class LNode<T> {
    protected T data;
    protected LNode<T> prev;
    protected LNode<T> next;

    public LNode() {
        this.data = null;
        this.prev = null;
        this.next = null;
    }

    public LNode(T data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }

    public LNode(T data, LNode<T> prev) {
        this.data = data;
        this.prev = prev;
        this.next = null;
    }

    public LNode(T data, LNode<T> prev, LNode<T> next) {
        this.data = data;
        this.prev = prev;
        this.next = next;
    }

}
