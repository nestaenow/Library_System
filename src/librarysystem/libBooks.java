/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package librarysystem;

/**
 *
 * @author USER
 */
public class libBooks {
    private String ISBN;
    private String Book_Name;
    private String Author;
    private String Published_Date;
    private int Edition;
    private String Genre;
    private int Copies_Available;
    
    
    public libBooks(String ISBN, String Book_Name, String Author, String Published_Date, int Edition, String Genre, int Copies_Available){
        this.ISBN = ISBN;
        this.Book_Name = Book_Name;
        this.Author = Author;
        this.Published_Date = Published_Date;
        this.Edition = Edition;
        this.Genre = Genre;
        this.Copies_Available = Copies_Available;
    }

    
    public String getISBN(){
        return ISBN;
    }
    public String getBook_Name(){
        return Book_Name;
    }
    public String getAuthor(){
        return Author;
    }
    public String getPublished_Date(){
        return Published_Date;
    }
    public int getEdition(){
        return Edition;
    }
    public String getGenre(){
        return Genre;
    }
    public int getCopies_Available(){
        return Copies_Available;
    }
}
