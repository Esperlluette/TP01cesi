package TP;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        library.addMedia(new Book(1, "Tomtom et Nana", "jaimeLire", 2000));
        library.addMedia(new Book(1, "toto", "nenette", 1999));

        library.sortByYear();
        
    }
}
