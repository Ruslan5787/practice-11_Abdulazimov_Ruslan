enum class DaysOfTheWeekType {
    понедельник {
        override fun getDayOfTheWeek() = "понедельник"
    },
    вторник {
        override fun getDayOfTheWeek() = "вторник"
    },
    среда {
        override fun getDayOfTheWeek() = "среда"
    },
    четверг {
        override fun getDayOfTheWeek() = "четверг"
    },
    пятница {
        override fun getDayOfTheWeek() = "пятница"
    },
    суббота {
        override fun getDayOfTheWeek() = "суббота"
    },
    воскресенье {
        override fun getDayOfTheWeek() = "воскресенье"
    };

    abstract fun getDayOfTheWeek(): String;
}