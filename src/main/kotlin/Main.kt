import Color.*

fun main(args: Array<String>){
//    example1()
//    example2()
//    example3()
//    example4()
//    example5()
    example6()
}

fun example6() {
    println(getFavoriteColor(GREEN))
    getFavoriteColor2(setOf(GREEN, RED))
}

fun getFavoriteColor2(of: Set<Color>){
      when (of){
          setOf(WHITE, BLACK) -> println("Черно-белый")
          setOf(RED, GREEN) -> println("Красно-зеленый")
      }
}

fun getFavoriteColor(color: Color) = when(color){
    WHITE -> "Белый"
    GREEN -> "Зеленый"
    BLACK -> "Черный"
    RED -> "Красный"
    else -> "Без цвета"
}



fun example5() {
    println(Color.RED)
    println(Color.RED.name)
    println(Color.RED.opacity)
    println(Color.RED.colorHex)
}

fun example4() {
    val car = Car(11.2, 9)
    car.isNew = true

}

fun example3() {
    var name: String = "Pavel"
    var age: Int = 32
    println(myFirstFunction(name))
    println(myFirstFunction2(age))
    println(myFirstFunction3(name, age))
    println(myFirstFunction4(3, 7.6))
}

fun example2() {
    val userJava = UserJava("pppryalkin@gmail.com")
    println("Java example: ${userJava.email}")
    val userKotlin = UserKotlin("pppryalkin@gmail.com")
    println("Kotlin example: ${userKotlin.email}")
}

fun example1() {
    var name: String = "Pavel"
    var yearOfBirth: Int = 1990
    var givenYear: Int = 2022
    println("Hello! My name is $name")
    println("I am ${givenYear-yearOfBirth} years old!")
}

fun myFirstFunction(name: String): String{
    return "Hello, $name!"
}

fun myFirstFunction2(age: Int): String{
    return "I am $age years old!"
}

fun myFirstFunction3(name: String, age: Int){
    println("Hello! My name is $name")
    println("I am $age years old!")
}

fun myFirstFunction4(a: Int, b: Double) = a + b

