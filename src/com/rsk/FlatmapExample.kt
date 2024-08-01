import com.rsk.Meeting

fun main(args: Array<String>){
    val meetingsList = listOf(Meetings(1, "Board Meeting"), Meetings(2,"Commitee Meeting"))
    val people: List<Person>       = meetingsList.flatMap(Meetings::people)
    println(people)
    for (p in people)
     println(p.name)

}

class Meetings(val id: Int, val title: String){
 val people = listOf(Person("sam"), Person("alex"))
}

class Person(val name: String){

}