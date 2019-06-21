/*
* Under priorities, the increment i.e ++ and the decrement i.e --
* also carry a high priority after the brackets ().
* The following example clearly show it
* */
//INCREMENT
fun main (args:Array<String>){
    var x:Int = 10
    var y:Int = 20
    var z:Int?
        z=++x+y //++x means value(x)+1 so in this case it is (x+1)+y
    println(z)

    //Decrement

    println("Input your 1st value")
    var a:Int = readLine()!!.toInt()
    println("Input your 2nd value")
    var b:Int = readLine()!!.toInt()
    var c:Int?
    c=--a+b // --x decreases the value of x-1
    println("Value of z is: $c")

}




