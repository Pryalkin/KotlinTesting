fun main(args: Array<String>){
//    example1();
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
    println("I am ${givenYear-yearOfBirth} years old")
}
