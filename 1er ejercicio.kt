//en este ejercicio queremos que dependiendo del numero de notificaciones te aparezca un mensaje u otro
fun main() {
    //en esta funcion tenemos dos variables
    val morningNotification = 51
    val eveningNotification = 135
    //imprimira la notificacion
    printNotificationSummary(morningNotification)
    printNotificationSummary(eveningNotification)
}

fun printNotificationSummary(numberOfMessages: Int) {
    //con la ayuda de un if declaramos numero de mensaje menos que 100
    //imprimira eso
    if (numberOfMessages < 100) {
        println("You have ${numberOfMessages} notifications.")
    } else {
        println("Your phone is blowing up! You have 99+ notifications.")
    }
}