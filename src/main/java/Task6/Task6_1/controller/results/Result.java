package Task6.Task6_1.controller.results;

import Task6.Task6_1.controller.methodsWithModel.MethodsWithBase;
import Task6.Task6_1.model.baseCreation.BooksBase;
import Task6.Task6_1.view.print.PrintResult;

import java.util.Scanner;

public class Result {

    public static void getResult() {
        BooksBase base = new BooksBase();
        PrintResult.print(base.getOurBase());
        System.out.println("__________________________________________________");
        System.out.println("Press 1 - to take list of all books of one author");
        System.out.println("Press 2 - to take list of all books of one publisher");
        System.out.println("Press 3 - to take list of all books of  published later that year");
        System.out.println("Press 4 - to take sorted by publishers list of all books ");
        System.out.println("Press 5 - to save Base on disk C:\\");
        System.out.println("Press 6 - to read Base from disk C:\\");
        System.out.println("Press 0 - to exit ");

        Scanner in = new Scanner(System.in);

        while (true) {
            System.out.println("__________________________________________________");
            System.out.println("Enter action:");
            int choice = in.nextInt();
            in.nextLine();
            switch (choice) {
                case 1:
                    System.out.println("Enter author:");
                    PrintResult.print(MethodsWithBase.getOneAuthorBooks(base.getOurBase(), in.nextLine()));
                    break;
                case 2:
                    System.out.println("Enter publisher:");
                    PrintResult.print(MethodsWithBase.getOnePublisherBooks(base.getOurBase(), in.nextLine()));
                    break;
                case 3:
                    System.out.println("Enter year:");
                    PrintResult.print(MethodsWithBase.getBooksPublishedNoLater(base.getOurBase(), in.nextInt()));
                    break;
                case 4:
                    PrintResult.print(MethodsWithBase.SortByPublishers(base.getOurBase()));
                    break;
                case 5:
                    MethodsWithBase.saveOnFile(base.getOurBase());
                    break;
                case 6:
                    PrintResult.print(MethodsWithBase.readFromFile(MethodsWithBase.saveOnFile(base.getOurBase())));
                    break;
                case 0:
                    System.exit(1);
            }
        }
    }
}