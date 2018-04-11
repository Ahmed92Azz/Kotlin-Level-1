
fun main(args : Array<String>)
{
	//ArrayList
	
	var names = Array<String>(3){"a"}
	
	var colors = ArrayList<String>()
	
	names[0] = "Ahmed"
	names[1] = "Omer"
	
	
	colors.add("Red")//0
	colors.add("Green") // 1
	colors.add("Blue")//2
	
	
	
	colors.set(2,"Yellow")
	
	
	for(count in colors)
		{
			println(count)
			
		}
	
}