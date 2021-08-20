object Three extends App{
	//def main(args:Array[String]){}
	val a1=new Account("854789654v",001,10.00)
	val a2=new Account("458124857v",002,15.00)

	println(a1)
	println(a2)
	a1.transfer(a2,5)
	println(a1)
	println(a2)

}

class Account(n:String,a:Int,b:Double){
	val nic:String = n
	var acnumber:Int=a
	var balance:Double=b

	override def toString="[" + nic + ":" + acnumber + ":" + balance + "]"

	def transfer(a:Account,b:Double):Unit={
		this.balance=this.balance-b
		a.balance=a.balance+b
	}
		
}