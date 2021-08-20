object onetwo extends App{
	//def main(args:Array[String]){}

	val a= new Rational(1,2)
	println(a)
	println(a.neg)

	/*val a= new Rational(1,2).neg
	println(a)*/
	val b= new Rational(3,4)
	val c= new Rational(5,8)
	val d= new Rational(2,7)
	println(b.sub(c).sub(d))

	//**** val e= new Rational(2,-8)

}

class Rational(x:Int,y:Int){
	require(y>0,"please enter positive denominator")
	def numer=x
	def denom=y

	def neg=new Rational(-this.numer,this.denom)
	def add(r:Rational)=new Rational(this.numer*r.denom+r.numer*this.denom , this.denom*r.denom)
	def sub(r:Rational)=this add(r.neg)

	private def gcd(p:Int,q:Int):Int={
		if(q==0)
			p 
		else gcd(q,p%q)
	}
	private val g=gcd(x,y)

	override def toString = numer/g + "/" + denom/g
}