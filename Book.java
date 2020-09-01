package com.company;

public class Book {
    private int quantityOfPages;
    private String name;
    private String author;
    private String genre;
    private int price;

    public Book(){}
    public Book(int quantityOfPages, String name, String author, String genre, int price) {
        this.quantityOfPages = quantityOfPages;
        this.name = name;
        this.author = author;
        this.genre = genre;
        this.price = price;
    }

    public int getQuantityOfPages() {
        return quantityOfPages;
    }

    public void setQuantityOfPages(int quantityOfPages) {
        this.quantityOfPages = quantityOfPages;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "quantityOfPages=" + quantityOfPages +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", genre='" + genre + '\'' +
                ", price=" + price +
                '}';
    }
}
