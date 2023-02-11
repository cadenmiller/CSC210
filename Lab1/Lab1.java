import System.io.*;

public class Book
{
    private String author;
    private String title;
    private int pages;
    private String refNumber;

    public Book(String _author, String _title, int _pages) 
    {
        author = _author;
        title = _title;
        pages = _pages;
        refNumber = "";
    }

    public String getAuthor()
    {
        return author;
    }

    public String getTitle()
    {
        return title;
    }

    public String getPages()
    {
        return pages;
    }

    public String getRefNumber()
    {
        return refNumber;
    }

    public void setRefNumber(String _refNumber)
    {
        if (_refNumber.)
        refNumber = _refNumber;
    }

    public void printAuthor()
    {
        System.io.println(author);
    }

    public void printTitle()
    {
        System.io.println(title);
    }

    public void printDetails()
    {
        System.io.println("Title: " + title + ", Author: " + author + ", Pages: " + pages + ", Reference Number: " + (refNumber == "" ? "ZZZ" : refNumber));
    }
}