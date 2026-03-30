 class Book {
    String title;
    String author;
    int price;

   
    Book(String t, String a, int p) {
        title = t;
        author = a;
        price = p;
    }

    void display() {
        System.out.println("Book Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
       
    }
}

public class LibraryManagement {
    public static void main(String[] args) {
        
        
        Book b1 = new Book("Java Basics", "James Gosling", 500);
        Book b2 = new Book("Python Guide", "Guido van Rossum", 450);
        Book b3 = new Book("C Programming", "Dennis Ritchie", 400);

       
        b1.display();
        b2.display();
        b3.display();
    }
}
}
