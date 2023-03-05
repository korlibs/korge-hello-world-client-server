import com.soywiz.korge.*
import com.soywiz.korge.scene.*
import com.soywiz.korge.view.*
import com.soywiz.korim.color.*
import com.soywiz.korlibs.samples.clientserver.*

//suspend fun main() = Korge(width = 512, height = 512, bgcolor = Colors["#2b2b2b"]) {
suspend fun main() = Korge(bgcolor = Colors["#2b2b2b"]) {
    sceneContainer().changeTo({ MyMainScene() })
}

class MyMainScene : Scene() {
    override suspend fun SContainer.sceneMain() {
        text("Text: $mySharedString")
    }
}