package Library

class Library {
    private val books = mutableListOf<Book>()

    /**
     * Adds a book to the library.
     *
     * @param book The book to be added to the library.
     */
    fun addBook(book: Book) {
        books.add(book)
        println("${book.title} added to the library.")
    }
    /**
     * Removes a book from the library.
     * @param title the title of the book to be removed
     * @return nothing
     */
    fun removeBook(title: String) {
        val book = books.find { it.title.equals(title, ignoreCase = true) }
        if (book != null) {
            books.remove(book)
            println("${book.title} removed from the library.")
        } else {
            println("Book not found in the library.")
        }
    }
    /**
     * Borrow a book from the library.
     *
     * @param title the title of the book to be borrowed
     * @return nothing
     */
    fun borrowBook(title: String) {
        val book = books.find { it.title.equals(title, ignoreCase = true) }
        if(book != null) {
            book.isBorrowed = true
            println("${book.title} has been borrowed from the library.")
        } else {
            println("Book: $title not found in the library.")
        }
    }
    /**
     * Returns a borrowed book to the library.
     *
     * @param title the title of the book to be returned
     * @return nothing
     */
    fun returnBook(title: String) {
        val book = books.find { it.title.equals(title, ignoreCase = true) }
        if(book!= null) {
            if(book.isBorrowed) {
                book.isBorrowed = false
                println("${book.title} has been returned to the library.")
            } else {
                println("${book.title} is already in the library.")
            }
        } else {
            println("Book: $title not found in the library.")
        }
    }
    /**
     * Displays all the books in the library.
     *
     * @return nothing
     */
    fun availableBooks() {
        val availableBooks = books.filter { !it.isBorrowed }
        if (availableBooks.isNotEmpty()){
            println("Available books: ")
            availableBooks.forEach { println("${it.title}") }
        } else {
            println("No available books in the library.")
        }
    }
    /**
     * Displays all books based on Author
     * @param The name of the author
     * @returns nothins*/
    fun booksByAuthor(author: String) {
        val booksByAuthor = books.filter { it.author.equals(author, ignoreCase = true)}
        if (booksByAuthor.isNotEmpty()) {
            println("Books by $author: ")
            booksByAuthor.forEach { println("- ${it.title} (${it.year})") }
        } else {
            println("No books found by $author.")
        }
    }

    /**
     * Display Books by year
     * @param year The books publish year
     * @return nothing*/
    fun booksByYear(year: Int) {
        val booksByYear = books.filter { it.year == year }
        if (booksByYear.isNotEmpty()) {
            println("Books published in $year: ")
            booksByYear.forEach { println("- ${it.title} by ${it.author}") }
        } else {
            println("No books found published in $year.")
        }
    }
}