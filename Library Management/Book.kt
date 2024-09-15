package Library

data class Book(
    val title: String,
    val author: String,
    val year: Int,
    var isBorrowed: Boolean = false
)