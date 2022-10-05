import java.lang.Math.sqrt
import kotlin.math.pow

fun main() {
    val exercises: Int = 17   //#1 , 2 Sergei
    var exercisesSolved = 0
    exercisesSolved+=1
    print("#1 , 2 Sergei ==| ")
    println(exercisesSolved)


    var skuns:Double = 17.0 //# 3 Sergei
    var ded:Double = 30.0
    var srednii = 8.0
    var asus :Double = ((skuns+ded)/srednii)
    print("# 3 Sergei ==| ")
    println(asus)


    val testNumber = 50       //#4 Sergei
    val evenOdd = testNumber%2
    print("#4 Sergei ==| ")
    println(evenOdd)

    var answer = 0// 5 Sergei
    answer++
    answer+=10
    answer*=10
    answer shr 3
    print("# 5 Sergei ==| ")
    println(answer)

    var age: Int = 16 // 6 Danil Sgibnev
    print("# 6 Danil Sgibnev ==| ")
    print(age)
    age = 30
    println(age)

    val a: Double = 38.0 // 7 Danil Sgibnev
    val b: Double = 15.0
    val answer1 = (a*100)+b
    val answer2 = (a*100) + (b*100)
    val answer3 = (a*100) - (b*55)
    print("# 7 Danil Sgibnev ==| ")
    println(answer1)
    println(answer2)
    println(answer3)

    var alis = ((5+3) - ((4 / 2) * 2)) // 8 Danil Sgibnev
    print("# 8 Danil Sgibnev ==| ")
    println(alis)


    val average = (a+b)/ srednii //#9 Danil Sgibnev
    print("# 9 Danil Sgibnev ==| ")
    println(average)


    /*Температуру в °C можно конвертировать в °F через умножение на 1.8 и
    последующее увеличение на 32*/
    var fahrenheit:Double = 27.0  //#10 Sergei
    var resul = (fahrenheit/1.8)-32
    val celcius =resul
    println("#10 Sergei ==| "+"Celsia ="+celcius)


    val degrees: Double = 12.0 //#12 Sergei
    var gradus:Double = 360.0
    var res = gradus/degrees
    var radians = res
    println("#12 Sergei ==| "+ radians)


    val x1:Double =5.0 //#13 Sergei
    val x2:Double =-7.0
    val y1:Double =2.0
    val y2:Double =-8.0
    var reultans = sqrt((x2-x1).pow(2)+(y2-y1).pow(2))
    var  distance:Double = reultans
    println("#13 Sergei ==| "+ distance)





















}

