fun main(args: Array<String>) {
    println("""
        ******  Single Responsibility Principle  ****** 
    """.trimIndent())
    val user = UserDB().getUser(32)
    println("User with id=${user.id} is: ${user.name}")
    println()


    println("""
        ******  Open Close Principle  ****** 
    """.trimIndent())
    val polygons = mutableListOf<Polygon>()
    polygons.add(Circle(2.0))
    polygons.add(Triangle(2.3, 3.0))
    for (polygon in polygons) {
        println("The area of $polygon is: ${polygon.area()}")
    }
    println()


    println("""
        ******  Liskov Substitution Principle  ****** 
    """.trimIndent())
    val creatures = mutableListOf<Creature>()
    val human = Human()
    val fish = Fish()
    val bird = Bird()
    creatures.add(human)
    creatures.add(fish)
    creatures.add(bird)
    for (creature in creatures) {
        println("$creature can:")
        creature.move()
        creature.swim()
        if (creature is Bird) {
            println("The bird also: ")
            creature.fly() //Only Bird has the fly function
        }
    }
    println()


    /** Interface Segregation Principle
    Is a concept that indicate we have to divider a big Interface to many smalls for prevent classes which
    implements the big interface don't have "not implemented functions" --Watch ISP file --**/


    println("""
        ******  Dependency Inversion Principle  ****** 
    """.trimIndent())
    val shopping = Shopping()
    val shoppingBasket01 = ShoppingBasket(CreditCard(), SqlDataBase())
    val shoppingBasket02 = ShoppingBasket(PayPal(), Server())
    println("First Buy: ")
    shoppingBasket01.buy(shopping)
    println("\nSecond Buy: ")
    shoppingBasket02.buy(shopping)

}