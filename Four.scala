object Four extends App{
	//4.  A Bank defines as List of Accounts
	var bank:List[Account]=List()

	def createAccount(n:String,a:Int,b:Double): Unit ={
		val newacc=new Account(n,a,b)
		bank = bank ::: newacc :: Nil
		//println(bank)
	}

	createAccount("125489652v",003,12.50)
	createAccount("124489652v",004,16.80)
	createAccount("124489652v",005,-5.00)
	createAccount("125489652v",006,25.30)
	createAccount("124489652v",007,50.60)
	createAccount("124489652v",008,-50.60)
	println("All bank account details.")
	println(bank)

	//4.1 List of Accounts with negative balances
	val overdrift=(b:List[Account])=>b.filter(account=>account.balance<0.0)
	println(overdrift(bank))

	//4.2 Calculate the sum of all account balances
	val totalbalance=(b:List[Account])=>b.foldLeft(0.0)((x,y)=>x + y.balance)
	println(totalbalance(bank))

	//4.3 Calculate the final balances of all accounts after apply the interest function
	val interest=(b:List[Account])=>b.map( account=> 
		if(account.balance >0.0)(account.balance+account.balance*0.5)
		else (account.balance+account.balance*0.1) 
	)
	println(interest(bank))
}

class Account(n:String,a:Int,b:Double){
	val nic:String = n
	var acnumber:Int=a
	var balance:Double=b

	override def toString="[" + nic + ":" + acnumber + ":" + balance + "]"

}