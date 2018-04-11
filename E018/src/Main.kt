
fun main(args : Array<String>)
{
	
	var myList = Array<Int>(3){0}
	
	myList[0] = 5
	myList[1] = 33
	myList[2] = 12
	
	
	var max = myList[0]  // max = 6
	
	for(i : Int in 0 until myList.size) // i= 3
		{
			if(myList[i] > max)
				max = myList[i]
			
		}
	
	println(max)
	
}