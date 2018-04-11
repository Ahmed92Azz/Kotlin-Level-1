
// if , else and else if

class Human {
	
	var name : String = ""
	var age  : Int = 0
	var eyeColor : String = ""
	

	fun speak()
	{
		if(this.age > 7)
			{
				println("My Name is : " + this.name)
		        println("Age : " + this.age)
		        println("coloe: " + this.eyeColor)
		        println("---------------------------")
			}
		else
			println("There is no greater than 7")
		
	}
	
	
}