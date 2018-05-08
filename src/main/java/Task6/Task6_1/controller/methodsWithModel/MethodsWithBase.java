package Task6.Task6_1.controller.methodsWithModel;


import Task6.Task6_1.controller.comparator.BookPublisherComparator;
import Task6.Task6_1.model.entity.Book;
import org.apache.log4j.Logger;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;


public class MethodsWithBase {
    static Logger logger = Logger.getLogger(MethodsWithBase.class);
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
        logger.debug("There are " + size+ " books of author "+author);
        if (size == 0) {
            System.out.println(message);
        }
        return result;
    }

    public static int saveOnFile(Book[] ourBase) {
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("D:\\books.ser"))) {
            for (int i = 0; i < ourBase.length; i++) {
                Book book = ourBase[i];
                outputStream.writeObject(book);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        logger.debug("File has been successfully saved on disk D://");
        return ourBase.length;
    }

    public static Book[] readFromFile(int number) {
        ArrayList<Book> baseFromFile =new ArrayList<Book>();
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("D:\\books.ser"))) {
            while(inputStream.readObject()!=null){
                Book book = (Book) inputStream.readObject();
                baseFromFile.add(book);
            }
//            for (int i = 0; i <number ; i++) {
//                Book book = (Book) inputStream.readObject();
//                baseFromFile.add(book);
//            }
        } catch (EOFException e) {
            logger.error("This is error EOFException"+e);
        } catch (IOException e) {
            logger.error("This is error i/o"+ e);
        } catch (ClassNotFoundException e) {
            logger.error("This is error"+ e);
        }
        Book[] booklist = new Book[baseFromFile.size()];
        for (int i = 0; i <baseFromFile.size() ; i++) {
            booklist[i]=baseFromFile.get(i);
        }
        return booklist;
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
        logger.debug("There are " + size+ " books of publisher "+publisher);
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
        logger.debug("There are " + size+ " books Published No Later "+year+" year");
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
