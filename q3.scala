object Account extends App{

	val account1= new Bankaccount("harry",968574,100000.00)
	val account2= new Bankaccount("cloudia",635241,300000.00)

  account1.transfer(account2,5500.00)

  println(account1)
  println(account2)


}

class Bankaccount(id:String,n:Int,b:Double){

  var nic:String=id
  var accnumber:Int =n
  var balance:Double =b

	def withdraw(n:Double){
		this.balance=this.balance-n
	}

	def deposit(n:Double){
		this.balance=this.balance+n
	}

	def transfer(acc:Bankaccount,n:Double)={
    this.withdraw(n)
    acc.deposit(n)
  }

  override def toString = "["+nic+":"+accnumber+":"+balance+"]"

	}
