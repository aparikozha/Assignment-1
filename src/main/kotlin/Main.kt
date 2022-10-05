import java.util.*


fun main() {
    val arr  = mutableListOf(1,4,5,6)
    println(averageOfEvenElements(arr))
    println(palindrome("madam"))
    val time : Date =  Date()
    println( time.getTime(Time1))
}

fun averageOfEvenElements(arr: List<Int>) : Int{
    var sumOfEvenElements = 0
    var numberOfEvenElements = 0
    for (i in arr.indices){
        if (i % 2==0){
            sumOfEvenElements += arr[i]
            numberOfEvenElements += 1

        }
    }
    return sumOfEvenElements/numberOfEvenElements
}


fun palindrome(word: String) : Boolean{
    val maxIndex = word.length-1
    for (i in word.indices){
        if (word[i]!= word[maxIndex-i]){
            return false
        }
    }
    return true
}



object Time1{
    fun get() : Date{
        return Date()
    }
}


fun Date.getTime(time : Time1) : String{
    return Date().toString()

}
