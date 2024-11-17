package ru.job4j.pojo;

public class Library {

    public static void main(String[] args) {
        Book detective = new Book("Detective", 345);
        Book poem = new Book("Poem", 58);
        Book story = new Book("Story", 124);
        Book java = new Book("Clean code", 543);

        Book[] books = new Book[4];
        books[0] = detective;
        books[1] = poem;
        books[2] = story;
        books[3] = java;

        for (int i = 0; i < books.length; i++) {
            Book book = books[i];
            System.out.println(book.getName() + " - " + book.getCount());
        }
        System.out.println("Replace 0 and 3 books");
       books[0] = java;
       books[3] = detective;

       for (int i = 0; i < books.length; i++) {
           Book book = books[i];
           System.out.println(book.getName() + " + " + book.getCount());
       }
        System.out.println("Only books with name Clean code");

       for (int i = 0; i < books.length; i++) {
           Book book = books[i];
           if (book.getName().equals("Clean code")) {
               System.out.println(book.getName() + " - " + book.getCount());
           }
       }
    }
}
