public class Main
{
    public static void main(String[] args)
    {
        Book b1 = new Paperbook("A11", "MATH", 2020, 67, 20);
        Book b2 = new EBook("A12", "science", 2024, 54, "pdf");
        Book b3 = new Paperbook("A14", "OLD MATH", 2007, 67, 10);
        Book b4 = new EBook("A13", "OLD SCIENCE", 2004, 54, "pdf");

        Inventory inventory = new Inventory();

        inventory.addBook(b1, 20); // Even if the book already stores stock
        inventory.addBook(b2, 10);
        inventory.addBook(b3, 15);
        inventory.addBook(b4, 5);

        System.out.println("\n--- Purchasing Book ---");
        b1.purchaseBook("A11", 2, "mazen@gmail.com", "Smouha");

        System.out.println("\n--- Removing Books Published Before 2010 ---");
        inventory.removeOutdatedBooks(2010);

        System.out.println("\n--- Current Inventory ---");
        for (Book book : inventory.getBooks().values())
        {
            System.out.println("- " + book.getTitle() + " (" + book.getPublishYear() + ")");
        }
    }
}
