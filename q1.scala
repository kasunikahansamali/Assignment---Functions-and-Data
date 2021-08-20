object Rational extends App{

	val r1= new Rational(3,7)

	val x=r1.neg

	println(x)

}

class Rational(n:Int, d:Int){

	def numer=n
	def denom=d
    def neg=new Rational(-this.numer,this.denom)

	override def toString=numer+"/"+denom

	}
