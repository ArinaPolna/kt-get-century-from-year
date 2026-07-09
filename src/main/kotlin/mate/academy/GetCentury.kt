package mate.academy

const val CENTURY_DELIMITER = 100
const val ZERO = 0
const val ONE = 1

fun getCentury(year: Int) : Int {
    if (year % CENTURY_DELIMITER > ZERO) {
        return (year / CENTURY_DELIMITER) + ONE
    }
    return year / CENTURY_DELIMITER
}
