public class SLNode<T> {
    T data;
    SLNode<T> next;

    public SLNode(T data) {
        this.data = data;
        this.next = null;
    }
}