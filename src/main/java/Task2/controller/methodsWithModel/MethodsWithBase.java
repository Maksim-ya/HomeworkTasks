package Task2.controller.methodsWithModel;


import Task2.controller.comparator.BookPublisherComparator;
import Task2.model.entity.Book;

import java.util.Arrays;


public class MethodsWithBase {
    final static String message = "There is no relevant data!!!";

    public static Book[] getOneAuthorBooks(Book[] ourBase, String author) {
        int size = 0;
        Book[] result = new Book[ourBase.length];
        for (int i = 0; i < ourBase.length; i++) {
            if (ourBase[i].getAuthor().equals(author)) {
                result[size] = ourBase[i];
                size++;
            }
        }
        if (size == 0) {
            System.out.println(message);
        }
        return result;
    }


    public static Book[] getOnePublisherBooks(Book[] ourBase, String publisher) {
        int size = 0;
        Book[] result = new Book[ourBase.length];

        for (int i = 0; i < ourBase.length; i++) {
            if (ourBase[i].getPublisher().equals(publisher)) {
                result[size] = ourBase[i];
                size++;
            }
        }
        if (size == 0) {
            System.out.println(message);

        }
        return result;
    }

    public static Book[] getBooksPublishedNoLater(Book[] ourBase, int year) {
        int size = 0;
        Book[] result = new Book[ourBase.length];

        for (int i = 0; i < ourBase.length; i++) {
            if (ourBase[i].getYearOfPublishing() > year) {
                result[size] = ourBase[i];
                size++;
            }
        }
        if (size == 0) {
            System.out.println(message);
        }
        return result;
    }

    public static Book[] SortByPublishers(Book[] ourBase) {
        Book[] result = new Book[ourBase.length];
        Arrays.sort(ourBase, new BookPublisherComparator());
        for (int i = 0; i < ourBase.length; i++) {
            result[i] = ourBase[i];
        }
        return result;
    }
}
