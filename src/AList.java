public class AList {
    private int maxSize;
    private int size;
    private Book[] books;

    public AList() {
        maxSize = 10;
        size = 0;
        books = new Book[maxSize];
    }

    public void addBook(Book book) {
        if (size < maxSize) {
            books[size] = book;
            size++;
        } else {
            int newMaxSize = maxSize * 2;
            Book[] newArray = new Book[newMaxSize];
            //copy elements from the old array to the new array
            if (size >= 0) System.arraycopy(books, 0, newArray, 0, size);
            //replace the old array with the new array
            books = newArray;
            //put the new element into the array at the current size
            books[size] = book;
            size++;
            maxSize = newMaxSize;
        }
    }

    public void removeBook(int position) {
        if (position >= size) {
            System.out.println("Invalid position. Unable to remove the book.\n");
            return;
        }

        //case 1: position == size - 1
        if (position == size - 1) {
            // Decrease size by 1
            size--;
            return;
        }

        //case 2: position < size - 1
        for (int i = position; i < size - 1; i++) {
            // Shift back all elements at index y, where y > x and y < size - 1
            books[i] = books[i + 1];
        }
        size--;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("AList of Books:\n");
        for (int i = 0; i < size; i++) {
            result.append("Book ").append(i + 1).append(":\n").append(books[i]).append("\n");
        }
        return result.toString();
    }
}
