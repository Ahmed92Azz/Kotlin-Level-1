
fun main(args : Array<String>)
{
	
	var myList = Array<Int>(4){0}
	
	myList[0] = 4
	myList[1] = 8
	myList[2] = 16
	myList[3] = 32
	
	
	var total : Int = 0 //total = 60
	
	for(i : Int in 0 until myList.size)  // i = 4
		{
			total = total + myList[i]
			
		}
	println("Total =  $total"  )
	
}
