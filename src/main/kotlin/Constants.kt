class Constants {
    object Questions {
        val ENTRY = listOf(
            "quanto esta o ingresso",
            "quanto esta o ingresso?",
            "qual o valor do ingresso?",
            "qual o valor do ingresso",
        )
        val MOVIE = listOf(
            "qual filme esta em cartaz?",
            "qual filme esta em cartaz",
            "quais estao disponiveis?",
            "quais estao disponiveis",
            "qual esta disponivel",
            "qual esta disponivel?"
        )
    }

    object Messages {
        const val GREETING = "Olá! Como posso ajudar você hoje?"
        const val FAREWELL = "Tchau! Tenha um ótimo dia!"
        const val INQUIRY = "Tudo ótimo! Qual filme quer ver hoje?"
        const val MOVIE =
            "No dia de hoje (18/11), temos os filmes,  As Marvels, Jogos Vorazes – A Cantiga Dos Pássaros E Das Serpentes,  Five Nights at Freddy's - O Pesadelo Sem Fim"
        const val THANKS = "As ordens. Sempre que precisar estarei aqui! :)"
        const val ENTRY = "Os ingressos estão custando: Adulto 38 Reais e Meia 24 Reais"
        const val UNKNOWN = "Desculpe, eu não entendi. Você pode tentar novamente?"
    }

    object Server {
        const val SERVER_PORT = 9999
        const val SERVER_START_MESSAGE = "Servidor iniciado na porta 9999"
        const val CLIENT_CONNECTED_MESSAGE = "Cliente conectado:"
        const val WELCOME_MESSAGE = "Bem-vindo ao Chatbot!"
        const val MESSAGE_RECEIVED_MESSAGE = "Recebido do cliente:"
        const val CHATBOT_PREFIX = "ChatBot: "
        const val CLIENT_DISCONNECTED_MESSAGE = "Cliente desconectado"
    }

    object Client {
        const val SERVER_PORT = 9999
        const val SERVER_HOST = "localhost"
        const val CONNECTED_TO_SERVER_MESSAGE = "Conectado ao servidor"
        const val CLIENT_PREFIX = "Cliente:  "
        const val DISCONNECTED_FROM_SERVER_MESSAGE = "Desconectado do servidor"
    }

    companion object {
        val THANKS = listOf("obrigado", "obrigada")
        val GREETINGS = listOf("oi", "ola")
        val FAREWELLS = listOf("sair", "tchau")
        val INQUIRIES = listOf("tudo bem", "tudo bem?")
    }
}