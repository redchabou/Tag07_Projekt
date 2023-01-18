fun main() {
    // todo: Erstelle hier deinen Code.
    var liste1 : MutableList<Int> = mutableListOf(4, 8, 3)
    var liste2 : MutableList<Int> = mutableListOf(2, 4, 9)
    liste1.add(3)
    liste2.add(6)
    println(liste1.last()+liste2.last())
}