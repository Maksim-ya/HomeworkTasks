package Task6.Task6_1.view.print;


import Task6.Task6_1.model.entity.Book;

public class PrintResult {
    public static  void print(Book[] books){
        for (int i = 0; i < books.length; i++) {
            if (books[i]!=null)
            System.out.println(books[i]);
        }
    }
}
