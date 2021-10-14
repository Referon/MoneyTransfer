fun main() {
    val commission = 0.75f
    val amount = 89000
    val calculatingPercentage = (amount * (commission / 100))
    val result = if (calculatingPercentage < 3500) {
        3500
    } else {
        calculatingPercentage.toLong()
    }
    println("Комиссия составит $result копеек")


}