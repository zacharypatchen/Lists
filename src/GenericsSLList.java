public class GenericsSLList<T> {
    private SLNode<T> head;

    public GenericsSLList() {
        head = null;
    }

    public void add(T data) {
        SLNode<T> newNode = new SLNode<>(data);

        if (head == null) {
            //if the list is empty, set the new node as the head
            head = newNode;
        } else {
            SLNode<T> current = head;

            //traverse to the end of the list
            while (current.next != null) {
                current = current.next;
            }

            //set new node's next pointer to null
            newNode.next = null;

            //set last node's next pointer to the new node
            current.next = newNode;
        }
    }

    public void remove(int pos) {
        if (head == null || pos < 0) {
            System.out.println("Invalid position. Unable to remove the element.\n");
            return;
        }

        if (pos == 0) {
            //if removing the head, update the head to the next node
            SLNode<T> temp = head;
            head = head.next;
            temp.next = null; //de-allocate memory (free up the removed node)
            return;
        }

        SLNode<T> current = head;

        //traverse to the node before the position to be removed
        for (int i = 0; i < pos - 1 && current.next != null; i++) {
            current = current.next;
        }

        if (current.next != null) {
            //set next pointer of element x-1 to point to element x’s next
            SLNode<T> removedNode = current.next;
            current.next = removedNode.next;

            //de-allocate memory (free up the removed node)
            removedNode.next = null;
        } else {
            //handle invalid position or out-of-bounds index
            System.out.println("Invalid position. Unable to remove the element.\n");
        }
    }

    public String toString() {
        StringBuilder result = new StringBuilder();
        SLNode<T> current = head;

        while (current != null) {
            result.append(current.data).append("\n");
            current = current.next;
        }

        return result.toString();
    }
}
