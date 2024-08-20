public class Main {
    public static void main(String[] args) {
        // 1 task
        // fiction books
        Book[] fictionBooks = {
                new Book("Long", "1", "Jack", 1997),
                new Book("Short", "2", "Smith", 1766),
                new Book("Deep", "3", "Sarah", 2001)
        };
        // fiction department
        LibraryDepartment fictionDepartment = new LibraryDepartment("Fiction", fictionBooks);

        System.out.println(fictionDepartment.getName() + " count " + fictionDepartment.getBooksCount());
        System.out.println(fictionDepartment.findBookByAuthor("Jack"));


        // legal books
        Book[] legalBooks = {
                new Book("Short", "2", "Smith", 1766),
                new Book("Deep", "3", "Sarah", 2001)
        };
        // legal department
        LibraryDepartment legalDepartment = new LibraryDepartment("Legal", legalBooks);

        System.out.println(legalDepartment.getName() + " count " + legalDepartment.getBooksCount());
        System.out.println(legalDepartment.findBookByAuthor("Smith"));


        // technical books
        Book[] technicalBooks = {
                new Book("Deep", "3", "Sarah", 2001)
        };
        // technical department
        LibraryDepartment technicalDepartment = new LibraryDepartment("Technical", technicalBooks);

        System.out.println(technicalDepartment.getName() + " count " + technicalDepartment.getBooksCount());
        System.out.println(technicalDepartment.findBookByAuthor("Sarah"));


        // 2 task
        Pepperoni pep = new Pepperoni("Pepperoni 2x", 500, 450, true);
        pep.cook();
        pep.delivery();
    }
}