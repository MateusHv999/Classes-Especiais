fun main(){

    UtilityHelper.setCurrentDay(DayOfWeek.MONDAY)
    UtilityHelper.isWeekend() //false
    UtilityHelper.setCurrentDay(DayOfWeek.SUNDAY)
    UtilityHelper.isWeekend() //true

}

enum class DayOfWeek(val weekDays : String){
    MONDAY("monday"),
    TUESDAY("tuesday"),
    WEDSNEDAY("wednesday"),
    THURSDAY("thursday"),
    FRIDAY("friday"),
    SATURDAY("saturday"),
    SUNDAY("sunday")

}

object UtilityHelper{
    private var currentDay : DayOfWeek = DayOfWeek.SUNDAY

    fun setCurrentDay(day: DayOfWeek) {
        currentDay = day
        println(currentDay)
    }

    fun isWeekend() {
        when(currentDay){
            DayOfWeek.SUNDAY -> println("true")
            DayOfWeek.SATURDAY -> println("true")
            else -> println("false")
        }
    }
}