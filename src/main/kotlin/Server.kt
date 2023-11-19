import java.io.BufferedReader
import java.io.InputStreamReader
import java.io.PrintStream
import java.net.ServerSocket
import java.util.*

fun main() {
    val server = ServerSocket(Constants.Server.SERVER_PORT)
    println(Constants.Server.SERVER_START_MESSAGE)

    while (true) {
        val client = server.accept()
        println("${Constants.Server.CLIENT_CONNECTED_MESSAGE} ${client.inetAddress.hostAddress}")

        val reader = BufferedReader(InputStreamReader(client.getInputStream()))
        val writer = PrintStream(client.getOutputStream())

        writer.println(Constants.Server.WELCOME_MESSAGE)

        var line: String?
        while (reader.readLine().also { line = it } != null) {
            println("${Constants.Server.MESSAGE_RECEIVED_MESSAGE} $line")
            val response = processMessage(line!!)
            writer.println("${Constants.Server.CHATBOT_PREFIX} $response")
        }

        client.close()
        writer.println(Constants.Server.CLIENT_DISCONNECTED_MESSAGE)
    }
}


fun processMessage(message: String): String {
    val greetings = Constants.GREETINGS
    val farewells = Constants.FAREWELLS
    val inquiries = Constants.INQUIRIES
    val entryquestions = Constants.Questions.ENTRY
    val movieQuestions = Constants.Questions.MOVIE
    val thanks = Constants.THANKS

    return when {
        message.lowercase(Locale.getDefault()) in greetings -> Constants.Messages.GREETING
        message.lowercase(Locale.getDefault()) in farewells -> Constants.Messages.FAREWELL
        message.lowercase(Locale.getDefault()) in inquiries -> Constants.Messages.INQUIRY
        message.lowercase(Locale.getDefault()) in movieQuestions -> Constants.Messages.MOVIE
        message.lowercase(Locale.getDefault()) in entryquestions -> Constants.Messages.ENTRY
        message.lowercase(Locale.getDefault()) in thanks -> Constants.Messages.THANKS
        else -> Constants.Messages.UNKNOWN
    }
}

