
fun main(args : Array<String>)
{
	
	var ahmed = Student()
	var ali   = Student()
	
	println("What is your name :")
	ahmed.name = readLine().toString()
	print("Quize 1 :")
	ahmed.addQuize(readLine()!!.toInt())
	print("Quize 2 :")
	ahmed.addQuize(readLine()!!.toInt())
	print("Quize 3 :")
	ahmed.addQuize(readLine()!!.toInt())
	print("Quize 4 :")
	ahmed.addQuize(readLine()!!.toInt())
	print("Quize 5 :")
	ahmed.addQuize(readLine()!!.toInt())
	
	var total = ahmed.getToScore()
	println("Total = $total")
	
	var average = ahmed.getAverage()
	println("Average = $average")
	
	println("What is your name :")
	ali.name = readLine().toString()
	print("Quize 1 :")
	ali.addQuize(readLine()!!.toInt())
	print("Quize 2 :")
	ali.addQuize(readLine()!!.toInt())
	print("Quize 3 :")
	ali.addQuize(readLine()!!.toInt())
	print("Quize 4 :")
	ali.addQuize(readLine()!!.toInt())
	print("Quize 5 :")
	ali.addQuize(readLine()!!.toInt())
	
	total = ali.getToScore()
	println("Total = $total")
	
	average = ali.getAverage()
	println("Average = $average")
	
	
}
