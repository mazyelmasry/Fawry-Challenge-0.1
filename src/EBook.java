public class EBook extends Book implements MailService
{
    String fileType;

    public EBook(String ISBN, String title, int publishYear, double price, String fileType)
    {
        super(ISBN, title, publishYear, price);
        this.fileType = fileType;
    }

    public String getFileType()
    {
        return fileType;
    }


    @Override
    public void purchaseBook(String ISBN, int quantity, String email, String address)
    {
        System.out.println("Sending "  + getTitle() + "to: " + email);
        mailingInfo(email);
    }

    @Override
    public void mailingInfo(String email)
    {
        System.out.println("Email sent to " + email);
    }
}
