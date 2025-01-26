package GeminiChatBot.apps.geminichatbot

import android.graphics.Bitmap
import GeminiChatBot.apps.geminichatbot.data.Chat


data class ChatState (
    val chatList: MutableList<Chat> = mutableListOf(),
    val prompt: String = "",
    val bitmap: Bitmap? = null
)