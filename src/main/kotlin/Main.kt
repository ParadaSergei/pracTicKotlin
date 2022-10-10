fun main() {
    // #1 выводит тип Int ,#3 потому что приведенные значение и так имеют тип Int
    val age1:Int = 42
    val age2:Int = 21

    // #2 выводит тип Int
    val avg1 = (age1+age2)/2
    println(avg1)

    // #4
    val firstName:String = "Sergei"
    val lastName:String = "Parada"

    // #5
    val fullName:String = firstName+" "+lastName
    println(fullName)

    // #6
    val myDetails:String = "Hello , $fullName"
    println(myDetails)

    // #7
    //val Triples:Triple<Int,Int,Int> = Triple(3,12,2022)
    val Triples:Triple<Int,Int,Int> = Triple(10,12,2022) //#10

    // #8
    val month = Triples.first
    val day = Triples.second
    val year= Triples.third

    // #9
    println("$month."+"$year")

    // #10

    val DataTimess:Pair<Int,Int> = Pair(5,year)
    println(DataTimess)


}