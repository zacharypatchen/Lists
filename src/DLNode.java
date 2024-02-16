public class DLNode<T> {
    T data;
    DLNode<T> previous;
    DLNode<T> next;

    public DLNode(T data) {
        this.data = data;
        previous = null;
        next = null;
    }
}