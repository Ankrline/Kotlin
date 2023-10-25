class User(val id: Int, val name: String)

/* 
 * No Kotlin, a declaração de um objeto (por meio da palavra-chave object) 
 * é uma maneira concisa e eficaz de implementar o padrão Singleton.
 */

object UserManager {
    private val users = mutableListOf<User>()
    private var userIdCounter = 1

    
    fun addUser(name: String) {
       //TODO: Inplementar a lógica de adicionar um novo Usuário na lista "users". 
      //Dica: Utilize o tamanho da lista "users" para gerar seus IDs.
        val newUser = User(userIdCounter, name)
        users.add(newUser)
        userIdCounter++
    }

    fun listUsers() {
        for (user in users) {
        //TODO: Inplementar a impressão/listagem dos "users", seguindo o padrão definido no enunciado.
            println("${user.id} - ${user.name}")
        }
    }
}

fun main() {
    val quantity = readLine()?.toIntOrNull() ?: 0

    for (i in 1..quantity) {
        val name = readLine() ?: ""
        UserManager.addUser(name)
    }

    UserManager.listUsers()
}
