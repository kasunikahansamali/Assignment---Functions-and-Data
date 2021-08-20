object Rational extends App{

	val x= new Rational(1,5)
	val y= new Rational(5,8)
	val z= new Rational(2,7)
	val value=x-y-z

	println(value)

}

class Rational(n:Int, d:Int){

	def numer=n/gcd(Math.abs(n),d)
	def denom=d/gcd(Math.abs(n),d)

	private def gcd(a:Int, b:Int) :Int= if(b==0) a else gcd(b,a%b)

	def -(r:Rational)=new Rational(this.numer*r.denom-this.denom*r.numer,this.denom*r.denom)

	override def toString=numer+"/"+denom

	}
