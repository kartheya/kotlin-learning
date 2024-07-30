fun main(args: Array<String>) {
    for(i in 1 until 10)
        println(i)

    var numbers = listOf(1,2,3,4,5)
    for(i in numbers)
        print(" * ${i}")
    println("Numbers present at their respective indexes")
    for( (index, value) in numbers.withIndex() )
        println("Index: $index, Value: $value")






    var ages = HashMap<String, Int>()
    ages["Kevin"] = 55
    ages["Sam"]   = 24
    ages["Alex"]  = 24
    ages["Harry"] = 26

    for( (key,value) in ages)
        print("$key = $value, ")

}
