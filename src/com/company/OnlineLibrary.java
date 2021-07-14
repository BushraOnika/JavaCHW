package com.company;

/*
     you have to implement a library using java class library
     methods : addBook, issueBook,returnBook,showAvailableBooks
     properties : Array to store the available books
     array to store the issued books
      */
class Library{
    String[] availableBook;
    String[] issuedBook;
    int no_of_books=0;
    String[] books;
    Library()   {
        this.books = new String[100];
        this.no_of_books=0;
    }
    public void addBook(String book){
        this.books[no_of_books]=book;
        no_of_books++;
        System.out.println(no_of_books+"."+book+" has been added!");
    }
    public void showAvailableBook(){
        System.out.println("The available books are : ");
        for (String book:this.books){
            if (book==null){
                break;
            }
           else System.out.println("* "+book);
        }

    }
    void issuedBook(String book){
        for (String b:this.books){
            if(b ==book) System.out.println(b + " the book has been issued!");
        }
    }
     }// library class end

public class OnlineLibrary {
    public static void main(String[] args) {
        Library l=new Library();
        l.addBook("Doreamon");
        l.addBook("My love for you!");
        l.showAvailableBook();


    }
}
