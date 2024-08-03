import java.util.Scanner

class BankAccount(
    val reader: Scanner = Scanner(System.`in`),
    var accountNumber: Int = reader.nextInt(),
    var balance: Int = 0
) {
    fun deposit() {
        println("Enter the amount of money to be deposited")
        val input = reader.nextInt()
        balance += input
        println("The balance is $balance")
    }

    fun withdraw() {
        println("Enter the amount of money to be withdrawn")
        val withdrawAmount = reader.nextInt()
        if (withdrawAmount <= balance) {
            balance -= withdrawAmount
            println("The balance is $balance")
        } else {
            println("Insufficient funds")
        }
    }
}

fun main() {
    val reader = Scanner(System.`in`)
    println("Enter the account number:")
    val accountNumber = reader.nextInt()
    println("Enter the initial balance:")
    val initialBalance = reader.nextInt()

    val bankAccount = BankAccount(reader, accountNumber, initialBalance)

    bankAccount.deposit()
    bankAccount.withdraw()
}
