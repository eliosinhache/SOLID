/**
 * We define only Move Fun on Vehicle cause if we have Move Fly and Swim methods and then create a Plane. The plane can
 * fly and move but can't Swim (almost all)
 * */
interface Vehicle {
    fun move()
}

interface FlyingVehicle{
    fun fly()
}
interface WaterVehicle{
    fun swim()
}

class Car: Vehicle{
    override fun move() {
        println("Move")
    }
}

class Boat: Vehicle, WaterVehicle{
    override fun swim() {
        println("Swim")
    }

    override fun move() {
        println("Move")
    }

}

class Plane: Vehicle, FlyingVehicle{
    override fun fly() {
        println("Fly")
    }

    override fun move() {
        println("Move")
    }
}