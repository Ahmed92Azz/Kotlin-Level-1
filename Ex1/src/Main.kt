
fun main(args : Array<String>)
{
	println("Enter Op")
	val op = Cal()
	val oper : String = readLine().toString()
	var res : Int = 0
	
	when(oper){
		
		"+" -> res = op.sum(readLine()!!.toInt(),readLine()!!.toInt())
		"-" -> res = op.sub(readLine()!!.toInt(),readLine()!!.toInt())
		"*" -> res = op.mul(readLine()!!.toInt(),readLine()!!.toInt())
		"/" -> res = op.div(readLine()!!.toInt(),readLine()!!.toInt())
		
	}
		println(res)
}