/**
 * A responsibility to save User Data and other to DataBase Operations
 */
data class User(val id: Int, val name: String)

class UserDB(){
    fun getUser(id: Int): User {
        //search on DB
        return User(id, "Jose")
    }
}