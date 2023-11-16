package LabWeek7Exercises.LibraryCatalogSystem;


/*
Create a record named Book
with fields for the book title, author,
 publication year, and availability status (boolean).
 */

public record Book(String title, String author, int publicationYear, boolean availableStatus){}

