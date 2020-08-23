// Video 9 Arrays

/*fun main() {
    val names = arrayOf("Atul", "Ashu","Akshay")         //Array Declaration
   val demo = arrayOf("Ram", 1, 'a')                    //AN array in kotlin can have different datatype in one.
    names[0] = "Lord Valorous"                         // Changing element at [0] position
      val example = arrayOf(
       arrayOf(1,2,3),
       arrayOf(4,5,6))                                   // Making array inside an array
    println("First Element is ${names[0]} ")            //Printing the first element of array
    println("Number of elements = ${names.size}")      // To check the size of the array
    println(demo[2])                                  // Printing the values array
    println(example[1][1])
    println("Last element = {names.Last()}")

}

 */


// Video 10 For Loops

/*fun main() {
    val names = arrayOf("Atul", "Ashu","Akshay")
    for (whatever in names) {                               //For loop initialisation where whatever can be anything and the names should be the name of the array
    println(whatever) }                                    //We have to use the name that we give not the name of array, if we give the name of array it will print the position of array.
for (i in 1..10) {                                        //We can use for loop to iterate between numbers too
    println(i) }
    for (j in 1 until 10) {println(j)}                  // In this loop the 10 is not included
for (k in 10 downTo  1) {                              // To print down values we have to use down to, we can't do 10..1 because in that 2nd value should be greater then 1st value
    println(k)}

for (l in 1..10 step 2) {                             // Step means it will skip 1 number always
    println(l)}
for (m in 'a'..'z' step 2) println(m)                  //Printing characters
for (Index in names.indices ) {                         // This loop is used to print all the elements of a array with their index numbers
    println("Index $Index Element ${names[Index]} ")
}
} */


//Video 11 Comparison and Logical Operators

/*fun main() {
    println("2 > 1 is ${2 > 1}")
    println("2 < 1 is ${2 < 1}")
    println("1 >= 1 is ${1 >= 1}")

    println("!(2>1) is $!{(2>1)}")
    println("true && false = ${true && false}")            //Logical AND
    println("true || false = ${true || false}")           //Logical OR

AND runs before OR becuase it has preferences.

} */


// Video 12 WHILE, DO WHILE & LABELS

/*fun main() {
    var i = 0
   outer@ do {                          //outer@ is a label(we can change the name outer to anything.) Starting of do loop
        println(i)
        i++

        var j = 0
        while (j < 5) {                 //This is called scope, declaring an loop inside another loop
            println("--$j")
            j++
            break@outer                // @outer is the closing label in this there will be no distance
        }
    }while (i < 5)

} */

/*fun main() {
    var number = 100
    var counter = 0
    while (number > 1) {
        number /= 2
        counter++
        println(number)
    }
} */

//VIDEO 14 IF ELSE LOOP

/*fun main() {
    for (i in 1..10) {
        val prefix = if (i in 4..7) "-" else ">"
        println("$prefix $i")
    }
} */
/*fun main() {
    val time = 10
    if (time in 1..12) println("Good Morning")
    else if (time == 12 ) println("Time for lunch")
     else println("Good Day")
}*/


//Video14 When

/*fun main() {
    val sunday = true
    val time = 10
    val greeting = when {
         sunday -> "Sleep all day"
       time == 0 -> println("Why so early, go to sleep LazyAss")
       time in 1..11 -> println("Good Morning")
       time == 12 -> println("Time for Lunch")
        time in 12..24 -> println("Evening")
        else -> println("Good Day")
    }
    println(greeting)
} */

//Video 15 Function Parameters

/*fun main () {
    greet(name = "Atul", reps = 5)                            //The value that we passed here is known as argument Atul here is an argument
}
fun greet(name : String, reps:Int) {             //Parameters are assigned as val so they cannot be reassigned   //name: String inside the brackets are known as parameters and parameters must have an type declaration just like it has string
    for (i in 0 until reps) {
        println("Hello $name, Nice to meet you")
    }
} */


// we can do the same thing from while loop too

/*fun main () {
    greet(name = "Atul", reps = 5)
}
fun greet(name : String, reps:Int) {
var repsLeft = reps                             //we have to declare repsLeft = reps to make reps reassignable
    while (repsLeft > 0) {
        println("Hello $name, Nice to meet you")
      repsLeft--
        }
} */

fun main() {
    val max = getmax(12, 2)
}

fun getmax(num1: Int, num2: Int): Int {
    val max = if (num1 > num2) num1 else num2
    return max
}








































