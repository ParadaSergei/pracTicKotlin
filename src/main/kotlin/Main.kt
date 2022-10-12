// #1
fun printFullName(firstName:String,lastName:String)
{
 println("$firstName"+ " "+"$lastName")
}
fun calculateFullName1(firstName:String,lastName:String): String {   // #3
    return "$firstName $lastName"
}
fun calculateFullName2(Fl:String):Pair<String,Int> { // #4
    return Pair(Fl , Fl.length) }

fun prostoeChisla(num:Int) { // #5
    var i = 2
    var flag = false
    if(num%2!==0 && num>0)
    while (i <= num / 2) {
        if (num % i == 0) {
            flag = true
            break
        }
        ++i
    }
    if (flag==true)
        println("$num It's a prime number")
    else
        println("$num It's NOT a prime number")
}

fun funcFibonahci(n:Int):Int{ //#6
    var fibonacci1 = 1
    var fibonacci2 = 1
    if(n>2){
       for(i in 1..n-2){
           var fibonacci3=fibonacci1+fibonacci2
           fibonacci1=fibonacci2
           fibonacci2= fibonacci3
           println(fibonacci3)
       }
        return fibonacci2
    }
    return 0
}


fun main()
{
    printFullName("Sergei","Parada")   // #2
    println(calculateFullName2(calculateFullName1("Sergei","Parada")))
    prostoeChisla(64) //Введите число
    funcFibonahci(13)


}
