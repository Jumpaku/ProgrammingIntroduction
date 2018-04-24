package jumpaku.programming.variables

data class Product(val name: String, val price: Int)

fun main(args: Array<String>) {
    val pcName = "Personal computer"
    val pcPrice = 159800
    val pc = Product(pcName, pcPrice)
    val keyboard = Product("Keyboard", 3980)
    val mouse = Product("Mouse", 1280)
    val products = listOf(pc, keyboard, mouse)

    println(" products = $products")
}