import java.lang.System
import java.util.Scanner

class Rectangle(

    var length: Int,
    var width : Int
){
    fun areaOfTriangle() {
        val area = length * width
        println(" the area is :$area")
    }

    fun perimeterOfTriangle() {
        val perimeter = (length + width) * 2
        println("the perimeter is :$perimeter")
    }
}

fun main (){
    val reader = Scanner(System.`in`)
    println("Enter the length and width values")
    val area = Rectangle(reader.nextInt(), reader.nextInt())
    area.areaOfTriangle()
    println("Enter the length and width values")
    val perimeter = Rectangle(reader.nextInt(), reader.nextInt())
    perimeter.perimeterOfTriangle()
}