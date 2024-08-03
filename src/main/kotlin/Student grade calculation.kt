import java.util.Scanner

class Student(
    val reader: Scanner = Scanner(System.`in`),
    var name: String? = reader.next(),
    var grades: MutableList<Int> = mutableListOf(),
){
    fun averageGrade() {
        val reader = Scanner(System.`in`)
        println("Enter the length of the list")
        val n = reader.nextInt()
        for (i in 0 until n){
            println("Enter the $n values of the list")
            grades.add(reader.nextInt())
        }
        val averageGrade = grades.sum() / n
        println("$name your average grade is $averageGrade")
    }
}

fun main() {
    println("Enter the name of the student")
    val student = Student()
    student.averageGrade()

}