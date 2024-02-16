public class GenericsAList<T> {
    private int maxSize;
    private int size;
    private T[] elements;

    public GenericsAList() {
        maxSize = 10;
        size = 0;
        elements = (T[]) new Object[maxSize];
    }

    public void add(T element) {
        if (size < maxSize) {
            elements[size] = element;
            size++;
        } else {
            int newMaxSize = maxSize * 2;
            T[] newArray = (T[]) new Object[newMaxSize];
            //copy elements from the old array to the new array
            if (size >= 0) System.arraycopy(elements, 0, newArray, 0, size);
            //replace the old array with the new array
            elements = newArray;
            //put the new element into the array at the current size
            elements[size] = element;
            size++;
            maxSize = newMaxSize;
        }
    }

    public void remove(int position) {
        if (position >= size) {
            System.out.println("Invalid position. Unable to remove the element.\n");
            return;
        }

        // Case 1: position == size - 1
        if (position == size - 1) {
            // Decrease size by 1
            size--;
            return;
        }

        // Case 2: position < size - 1
        for (int i = position; i < size - 1; i++) {
            // Shift back all elements at index y, where y > x and y < size - 1
            elements[i] = elements[i + 1];
        }
        size--;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("GenericsAList of Elements:\n");
        for (int i = 0; i < size; i++) {
            result.append("Element ").append(i + 1).append(":\n").append(elements[i]).append("\n");
        }
        return result.toString();
    }
}
