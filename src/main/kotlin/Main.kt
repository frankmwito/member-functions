import java.util.Scanner

class Employee(
    var name: String,
    var baseSalary: Int
) {
    fun calculateBonus() {
        val reader = Scanner(System.`in`)
        println("Enter number of years")
        val years = reader.nextInt()
        val bonus = 0.05 * (baseSalary * years)
        val totalSalary = baseSalary + bonus
        println("$name's total salary is $totalSalary")
    }
}

fun main() {
    val employee = Employee("Frank", 120000)
    employee.calculateBonus()
}
