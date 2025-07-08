import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Inventory
{
    Map<String, Book> books = new HashMap();

    public Map<String, Book> getBooks()
    {
        return books;
    }

    public void addBook(Book book, int quantity)
    {
        books.put(book.getISBN(),book);
    }

    public void removeOutdatedBooks(int expirationYear)
    {
        List<String> isbnsToRemove = new ArrayList<>();

        for (Book book : books.values())
        {
            int bookYear = book.getPublishYear();
            if (bookYear < expirationYear)
            {
                isbnsToRemove.add(book.getISBN());
            }
        }
        for (String isbn : isbnsToRemove)
        {
            books.remove(isbn);
        }
    }
}