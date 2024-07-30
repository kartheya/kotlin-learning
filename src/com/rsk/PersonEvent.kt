package com.rsk

sealed class PersonEvent {

    class Awake : PersonEvent()
    class Asleep : PersonEvent()
    class Eating(val food: String) : PersonEvent()

    companion object {
        fun handlePersonEvent(event: PersonEvent) {
            when (event) {
                is PersonEvent.Awake -> println(" Awake Event Triggered ")
                is PersonEvent.Asleep -> println(" Asleep Class Triggered ")
                is PersonEvent.Eating -> println(" Person is Eating ${event.food} ")
            }
        }
    }
}

fun main(args: Array<String>){
    PersonEvent.handlePersonEvent(PersonEvent.Awake())
}
