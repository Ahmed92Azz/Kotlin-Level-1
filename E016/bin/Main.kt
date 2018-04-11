

fun main(arg : Array<String>)
{
	
	var ar1 = Array<Int>(4){0}
	val a = Array<IntArray>(4, {IntArray(3)})
	a[0][0] = 3
	println(a[0][0])
	
	ar1[0] = 2
	ar1[1] = 4
	ar1[2] = 6
	ar1[3] = 8
	
	for(i : Int in 0 until ar1.size) // i = 0 -- 4 
		{
			println(ar1[i])
		}
	
}