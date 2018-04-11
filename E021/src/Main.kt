
fun main(args : Array<String>)
{
	
	var a = arrayOf("Ahmed","Raad","Ali")
	var b = arrayOf("Omer","Jasim","Osama")
	
	
	
	var list = arrayOf(a,b)
	
	//println(list[0][1])
	//println(list[1][3])
	//println(list[2][1])
	
	for(i in list)
		{
			for(j in i)
				{
					print("$j ,")
				}
			println()
		}
	
}