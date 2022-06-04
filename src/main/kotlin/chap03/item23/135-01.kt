package chap03.item23

interface Tree
class Birch: Tree
class Spruce: Tree

class Forest<T: Tree> {

    fun addTree(tree: T) {
        //...
    }

}

fun main() {
    val forest = Forest<Birch>()
    forest.addTree(Birch())
//  forest.addTree(Spruce())  Type Mismatch
}