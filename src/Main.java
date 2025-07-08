public class Main
{
    public static void main(String[] args)
    {
        Book b1 = new Paperbook("b1", "MATH", 2024, 20, 200);
        Book b2 = new EBook("b2", "Physics", 2021, 50, "pdf");
        Book b3 = new Paperbook("b3", "Biology", 2020, 100, 120);
        Book b4 = new EBook("b4", "English", 2004, 150, "pdf");

        Inventory inventory = new Inventory();

        inventory.addBook(b1, 4);
        inventory.addBook(b2, 6);
        inventory.addBook(b3, 12);
        inventory.addBook(b4, 1);

        System.out.println("\n--- Purchasing Book ---");
        b1.purchaseBook("b1", 2, "Mazy@mail.com", "Alex");

        System.out.println("\n--- Removing Books Published Before 2010 ---");
        inventory.removeOutdatedBooks(2010);

        System.out.println("\n--- Current Inventory ---");
        for (Book book : inventory.getBooks().values())
        {
            System.out.println("- " + book.getTitle() + " (" + book.getPublishYear() + ")");
        }
    }
}
