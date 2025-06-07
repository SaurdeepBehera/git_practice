
fun main() {
    var small = "Small"
    var large = "Large"
    val temp = small
    small = large
    large = temp
    println("Small: $small, Large: $large")
}