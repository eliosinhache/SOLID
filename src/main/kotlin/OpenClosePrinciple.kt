/**
 * Triangle and Circle implement the interface Polygon. With this we can pass a Polygon to the Area class
 * and calculate the area with the calculateArea function
 */
interface Polygon{
    fun area(): Double
}

data class Triangle(val length: Double, val height: Double): Polygon {
    override fun area(): Double {
        return (length*height) / 2
    }

}

data class Circle(val radius: Double) : Polygon{
    override fun area(): Double {
        return Math.PI * (radius * radius)
    }
}

class Area {
    fun calculateArea(polygon: Polygon) : Double {
        return polygon.area()
    }
}