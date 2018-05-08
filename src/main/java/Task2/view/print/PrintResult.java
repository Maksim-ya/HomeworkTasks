package Task2.view.print;


import Task2.model.entity.Book;

public class PrintResult {
    public static  void print(Book[] books){
        for (int i = 0; i < books.length; i++) {
            if (books[i]!=null)
            System.out.println(books[i]);
        }
    }
}
