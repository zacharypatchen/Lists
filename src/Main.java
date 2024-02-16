public class Main {
    public static void main(String[] args) {
        //test SLList
        SLList slList = new SLList();
        slList.addBook(new Book("Book 1", "Author 1", 15.99));
        slList.addBook(new Book("Book 2", "Author 2", 20.49));
        System.out.println("SLList:\n" + slList);
        System.out.println("\nLet's delete the first element...");
        slList.removeBook(0);
        System.out.println("SLList:\n" + slList);
        System.out.println("\nLet's delete an out of bounds element...");
        slList.removeBook(5);
        System.out.println("Moving on...\n");

        //test DLList
        DLList dlList = new DLList();
        dlList.addBook(new Book("Book 3", "Author 3", 10.99));
        dlList.addBook(new Book("Book 4", "Author 4", 25.99));
        System.out.println("DLList:\n" + dlList);
        System.out.println("\nLet's delete the first element...");
        dlList.removeBook(0);
        System.out.println("DLList:\n" + dlList);
        System.out.println("\nLet's delete an out of bounds element...");
        dlList.removeBook(5);
        System.out.println("Moving on...\n");

        //test AList
        AList aList = new AList();
        aList.addBook(new Book("Book 5", "Author 5", 18.99));
        aList.addBook(new Book("Book 6", "Author 6", 22.99));
        System.out.println("AList:\n" + aList);
        System.out.println("\nLet's delete the first element...");
        aList.removeBook(0);
        System.out.println("AList:\n" + aList);
        System.out.println("\nLet's delete an out of bounds element...");
        aList.removeBook(5);
        System.out.println("Moving on...\n");

        //test GenericsAList
        GenericsAList<Book> genericsAList = new GenericsAList<>();
        genericsAList.add(new Book("Book 7", "Author 7", 14.99));
        genericsAList.add(new Book("Book 8", "Author 8", 30.99));
        System.out.println("GenericsAList:\n" + genericsAList);
        System.out.println("\nLet's delete the first element...");
        genericsAList.remove(0);
        System.out.println("GenericsAList:\n" + genericsAList);
        System.out.println("\nLet's delete an out of bounds element...");
        genericsAList.remove(5);
        System.out.println("Moving on...\n");

        //test GenericsSLList
        GenericsSLList<Book> genericsSLList = new GenericsSLList<>();
        genericsSLList.add(new Book("Book 9", "Author 9", 12.99));
        genericsSLList.add(new Book("Book 10", "Author 10", 28.99));
        System.out.println("GenericsSLList:\n" + genericsSLList);
        System.out.println("\nLet's delete the first element...");
        genericsSLList.remove(0);
        System.out.println("GenericsSLList:\n" + genericsSLList);
        System.out.println("\nLet's delete an out of bounds element...");
        genericsSLList.remove(5);
        System.out.println("Moving on...\n");

        //test GenericsDLList
        GenericsDLList<Book> genericsDLList = new GenericsDLList<>();
        genericsDLList.add(new Book("Book 11", "Author 11", 19.99));
        genericsDLList.add(new Book("Book 12", "Author 12", 24.99));
        System.out.println("GenericsDLList:\n" + genericsDLList);
        System.out.println("\nLet's delete the first element...");
        genericsDLList.remove(0);
        System.out.println("GenericsDLList:\n" + genericsDLList);
        System.out.println("\nLet's delete an out of bounds element...");
        genericsDLList.remove(5);
        System.out.println("Done!");
    }
}
