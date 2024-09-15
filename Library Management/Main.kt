package Library

fun main() {
    val library = Library()
    library.addBook(Book("To Kill a Mockingbird", "Harper Lee", 1960))
    library.addBook(Book("1984", "George Orwell", 1949))
    library.addBook(Book("Pride and Prejudice", "Jane Austen", 1813))
    library.addBook(Book("The Great Gatsby", "F. Scott Fitzgerald", 1925))

    // Testing library operations
    library.availableBooks()
    library.borrowBook("1984")
    library.availableBooks()
    library.returnBook("1984")
    library.booksByAuthor("Jane Austen")
    library.booksByYear(1925)
    library.removeBook("Pride and Prejudice")
    library.availableBooks()
}

