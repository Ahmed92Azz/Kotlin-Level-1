

public class Student {
	
	var name : String = ""
	var age : Int = 0
	var totalScore : Int = 0
	var numOfQuizes : Int = 0
	
	
	fun introduce()
	{
		println("Hello my name is : ${this.name}")
		println("My age is : ${this.age}")
		
	}
	
	fun addQuize(score : Int)
	{
		this.totalScore += score
		this.numOfQuizes++
		
	}
	
	fun getToScore() : Int
	{
		return this.totalScore
	}
	
	
	fun getAverage() : Int
	{
		return this.totalScore / this.numOfQuizes
		
	}
	
	
}