fun main() {
    val list = mutableListOf(1, 2, 3, 4, 5)
    val filteredList = list.filter { it % 2 != 0 }
    println(filteredList)
    println(list) // Original list remains unchanged
}