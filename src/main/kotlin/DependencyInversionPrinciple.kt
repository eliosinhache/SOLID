/**
 * Modules from high level mustn't depend on low level modules. Both must depend on abstractions
 * Here the abstraction was implemented by interface
 * */
class Shopping

class ShoppingBasket(
    private val paymentMethod: PaymentMethod, private val persistence: Persistence
){
    fun buy(shopping: Shopping){
        persistence.save(shopping)
        paymentMethod.pay(shopping)
    }
}

interface Persistence {
    fun save(shopping: Shopping)
}

interface PaymentMethod{
    fun pay(shopping: Shopping)
}

class SqlDataBase:Persistence{
    override fun save(shopping: Shopping) {
        println("Save on SQL DB")
    }
}

class Server: Persistence{
    override fun save(shopping: Shopping) {
        println("Save on Server")
    }
}

class CreditCard: PaymentMethod{
    override fun pay(shopping: Shopping) {
        println("Pay with CreditCard")
    }
}

class PayPal: PaymentMethod{
    override fun pay(shopping: Shopping) {
        println("Pay with Paypal")
    }
}