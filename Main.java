package TP;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        setupLibraryMedias(library);
        setupLibraryUsers(library);

        User user = library.getUserById(4);
        Media media = library.getMediaById(4);

        library.emprunterMedia(media, user);
        System.out.println("feur!");

    }

    static public void setupLibraryMedias(Library library) {
        library.addMedia(new Book(1, "Tomtom et Nana", "jaimeLire", 2000));
        library.addMedia(new Book(2, "toto", "nenette", 1999));
        library.addMedia(new Book(3, "toto", "nenette", 1666));
        library.addMedia(new Book(4, "toto", "nenette", 1777));
        library.addMedia(new Book(5, "toto", "nenette", 1888));
        library.addMedia(new Book(6, "toto", "nenette", 1555));
        library.addMedia(new Book(7, "toto", "nenette", 8444));
        library.addMedia(new Book(8, "toto", "nenette", 7444));
        library.addMedia(new Book(9, "toto", "nenette", 6444));
        library.addMedia(new Book(10, "toto", "nenette", 2444));
    }

    static public void setupLibraryUsers(Library library) {
        library.addUser(new User(1, "Tomtom et Nana"));
        library.addUser(new User(2, "toto"));
        library.addUser(new User(3, "toto"));
        library.addUser(new User(4, "toto"));
        library.addUser(new User(5, "toto"));
        library.addUser(new User(6, "toto"));
        library.addUser(new User(7, "toto"));
        library.addUser(new User(8, "toto"));
        library.addUser(new User(9, "toto"));
        library.addUser(new User(10, "toto"));
    }
}
