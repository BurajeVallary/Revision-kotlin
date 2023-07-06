fun main() {
    love("val","mike","james")
    city()
    love()
    valley("love","john","jab")



//    var Hope=Book("Vallary Buraje","Everything is under control don't give up",200,"January")
//     println(Hope.author)
//    println(Hope.title)
}
//data class Book(val author:String,val title:String,val pages:Int,val published:String){}
fun love(name1:String,name2:String,name3:String){
    var create= arrayOf(name1,name2,name3)
    println(create.contentToString())



}

fun city(){
    var cities = arrayOf("harare","kampala","kigali","dodoma")
    println(cities.map { it.capitalize() })
    cities.forEach { city-> println(city.capitalize()) }
}
fun love(){
    var number= arrayOf(32, 17,4,213,78,43,90,31,3,73,11,158,62)
    println(number.get(1)+number.get(4))
    println(number.indexOf(158))
    println(number.sortedArray().contentToString())
    println(number.sortedArrayDescending().contentToString())

}

fun valley(faith1:String,faith2:String,faith3:String):Array<String>{
    return arrayOf(faith1,faith2,faith3)
}