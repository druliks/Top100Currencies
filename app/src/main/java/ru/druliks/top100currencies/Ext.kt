package ru.druliks.top100currencies

import java.text.SimpleDateFormat
import java.util.*

fun Float.formatThousands():String{

    val ab=StringBuilder()
    val formatter=Formatter(ab, Locale.US)
    formatter.format("%(,.0f",this)
    return ab.toString()
}

fun Number.dateToString(pattern:String):String{
    val calendar=Calendar.getInstance()
    calendar.timeInMillis=this.toLong()
    return SimpleDateFormat(pattern).format(calendar.time)
}