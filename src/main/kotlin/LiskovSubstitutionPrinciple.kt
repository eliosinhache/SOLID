/**
 * We can use Open Class to define the principal actions and then in inherited classes there must implement it with
 * and personal actions.
 * */
open class Creature { // “open for extension“
    fun move(){
        println("Move")
    }
    fun swim(){
        println("Swim")
    }
}

class Human: Creature() {

}
class Bird: Creature(){
    fun fly(){
        println("fly")
    }
}

class Fish: Creature(){}