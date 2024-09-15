# Library Book Management System

## Problem Statement

Develop a Library Book Management System in Kotlin that efficiently manages a collection of books, allowing for various operations such as adding, removing, borrowing, and returning books, as well as querying the library's contents based on different criteria.

## System Requirements

1. **Book Management**: The system should be able to add new books to the library and remove existing ones.
2. **Borrowing System**: Users should be able to borrow available books and return them.
3. **Book Queries**: The system should support querying books based on availability, author, and publication year.
4. **User-Friendly Interface**: Implement a simple interface to interact with the library system.

## Technical Specifications

### Book Class

Create a `Book` class with the following properties:

- `title`: String (the title of the book)
- `author`: String (the author of the book)
- `year`: Int (the year the book was published)
- `isBorrowed`: Boolean (whether the book is currently borrowed or not)

### Library Class

Implement a `Library` class with the following methods:

1. `addBook(book: Book)`: Add a new book to the library.
2. `removeBook(title: String)`: Remove a book by title from the library.
3. `borrowBook(title: String)`: Mark a book as borrowed.
4. `returnBook(title: String)`: Mark a book as returned.
5. `listAvailableBooks()`: Display the titles of books that are not currently borrowed.
6. `listBooksByAuthor(author: String)`: Display all the books by a specific author.
7. `listBooksByYear(year: Int)`: Display all books published in a specific year.

## Implementation

The system is implemented in Kotlin and consists of three main files:

1. `Book.kt`: Contains the `Book` data class.
2. `Library.kt`: Contains the `Library` class with all the required methods.
3. `Main.kt`: Contains the `main()` function to demonstrate the usage of the Library system.
