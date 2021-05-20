fun main() {
    fun sayHello(name: String){
        return when(name){
            "" -> println("")
            else -> println("Hello $name")
        }
    }

    fun sum(a: Int, b: Int): Int {
        return a + b
    }
    fun bagi(a: Int, b:Int): Int {
        val hasil: Int
        if(b==0){
            hasil = 0
        }else{
            hasil = a/b
        }
        return hasil
    }

    sayHello("Solalatul")
    println(sum(2,3))
    println(bagi(2,2))
}