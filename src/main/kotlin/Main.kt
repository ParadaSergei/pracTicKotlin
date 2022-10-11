import java.lang.Math.sqrt
import java.util.*
import kotlin.math.pow

fun main() {
    // #1         13..19 => допустим это подрастковый период
    val myAge:Int = 17
    val isTeenager:Boolean= myAge in 13..19
    println(isTeenager)

    /* #2
    question в этом задании =>являются ли оба человека подростками?  ответ НЕТ */
    val theirAge:Int = 30
    val bothTeenagers:Boolean = isTeenager == theirAge in 13..19
    println(bothTeenagers)

    // #3
    val reader:String = "Sergei"
    val author:String = "Richard Lucas"
    val authorIsReader:Boolean = reader==author
    println(authorIsReader)

    // #4  следует ли reader перед author по алфавиту?
    val readerBeforeAuthor:Boolean = reader < author
    println(readerBeforeAuthor)

    // #5
    val myAge2:Int = 17
    if (myAge2 in 13..19){
        println("teenager") //(У меня не скачен русский алфавит в IntelliJ IDEA !,  поэтому пишу на английском)
    }
    else {
        println("not a teenager")}

    // #6   ===>   Я так это понял
    val answer:String = if(myAge2 in 13..19) "teenager" else "not a teenager"
    println(answer)

    // #7   Убрать /* .... */ и
    var counter:Int= 0
    /*while(counter<10) {
    var x = counter
        counter+=1
       // println(x)
    }*/

    // #8
    // var counter:Int= 0 ==> есть в #7 задачи
    var roll:Int =0
    do {
        counter += 1
        roll == Random().nextInt(6)
        println("Posle $counter broskov, roll raven"/*\n"*/ + " $roll")
    }
    while (roll!=0)



    // #9
    val range= 1..10
    for(i in range)
    {
        println(i.toDouble().pow(2))
    }

    // #10    Вывести корень всех значений
    val rEnges:Int=0
    for(rEnges in 1..10)
    {
        var w = sqrt(rEnges.toDouble())
        // println(w)
    }

    // #11 
    var sum = 0
    for (row in 0 until 9 step 4){
        if (row %2 == 0 ) { }
        for (column in 0 until 5) {
            sum += (row * column)*4
        }
    }
    println(sum)
}
