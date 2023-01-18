fun main(){
    val filmTitle : List<String> = listOf("1", "2", "3", "4", "5")
    var i = filmTitle.indices

    for (i in 1..5) println(i)
    println(" ")
    for (i in 5..1) println(i)
    println(" ")

    for (i in 5 downTo 1) println(i)
    println(" ")

    for (i in 1..5 step 2) println(i)
    println(" ")

    for (i in 5..1 step 2) println(i)
}