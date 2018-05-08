package Task6.Task6_1.model.baseCreation;

import Task6.Task6_1.model.entity.Book;

public class BooksBase {
    Book book1=new Book("The Hound of the Baskervilles","Artur Conan-Doyle","Memfis",1808,289,665.01);
    Book book2=new Book("Dracula","John Escott","Eksmo",2003,538,574.0);
    Book book3=new Book("The Picture of Dorian Gray'","Oscar Wilde","Memfis",1834,490,654.78);
    Book book4=new Book("Three Men In a Boat","Jerome K. Jerome","Memfis",1956,289,123.56);
    Book book5=new Book("1984","George Orwell","Eksmo",1948,189,654.22);
    Book book6=new Book(" A Space Odyssey","Antoni Clarke","Eksmo",2000,345,5345.71);
    Book book7=new Book(" The Fisherman ","Oscar Wilde","Memfis",2012,59,100.00);

    public Book[] getOurBase(){

    Book[] arrayOfBooks= {book1,book2,book3,book4,book5,book6,book7 };
    return arrayOfBooks;}
}
