import com.soywiz.korge.Korge
import com.soywiz.korge.view.text
import com.soywiz.korim.color.Colors
import com.soywiz.korlibs.samples.clientserver.mySharedString

suspend fun main() = Korge(width = 512, height = 512, bgcolor = Colors["#2b2b2b"]) {
    text("Text: $mySharedString")
}
