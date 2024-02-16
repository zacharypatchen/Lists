public class GenericsDLList<T> {
    private DLNode<T> head;
    private DLNode<T> tail;

    public GenericsDLList() {
        head = null;
        tail = null;
    }

    public void add(T data) {
        DLNode<T> newNode = new DLNode<>(data);

        if (head == null) {
            //if the list is empty, set the new node as both head and tail
            head = newNode;
        } else {
            //link the new node to the current tail
            tail.next = newNode;
            newNode.previous = tail;

            //update the tail to be the new node
        }
        tail = newNode;
    }

    public void remove(int pos) {
        //handle invalid position or out-of-bounds index
        if (pos < 0) {
            System.out.println("Invalid position. Unable to remove the element.\n");
            return;
        }

        //case 1: If removing the head
        if (pos == 0) {
            if (head != null) {
                head = head.next;
                if (head != null) {
                    head.previous = null;
                } else {
                    //if the list becomes empty after removal
                    tail = null;
                }
            }
            return;
        }

        DLNode<T> current = head;

        //traverse to the node at the specified position
        for (int i = 0; i < pos && current != null; i++) {
            current = current.next;
        }

        //case 2: If the node at the specified position is found
        if (current != null) {
            if (current.previous != null) {
                current.previous.next = current.next;
            }
            if (current.next != null) {
                current.next.previous = current.previous;
            } else {
                //if the last node is being removed, update the tail
                tail = current.previous;
            }
        } else {
            System.out.println("Invalid position. Unable to remove the element.\n");
        }
    }

    public String toString() {
        StringBuilder result = new StringBuilder();
        DLNode<T> current = head;

        while (current != null) {
            result.append(current.data).append("\n");
            current = current.next;
        }

        return result.toString();
    }
}