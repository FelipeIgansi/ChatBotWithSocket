import java.io.BufferedReader
import java.io.InputStreamReader
import java.io.PrintStream
import java.net.Socket

fun main() {
    val socket = Socket(Constants.Client.SERVER_HOST, Constants.Client.SERVER_PORT)
    println(Constants.Client.CONNECTED_TO_SERVER_MESSAGE)

    val reader = BufferedReader(InputStreamReader(socket.getInputStream()))
    val writer = PrintStream(socket.getOutputStream())

    var line: String?
    while (reader.readLine().also { line = it } != null) {
        println("$line \n")
        print(Constants.Client.CLIENT_PREFIX)
        val message = readln()
        writer.println(message)
    }

    socket.close()
    writer.println(Constants.Client.DISCONNECTED_FROM_SERVER_MESSAGE)
}

