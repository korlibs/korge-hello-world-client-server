import korlibs.samples.clientserver.mySharedString
import korlibs.korge.*
import korlibs.korge.scene.*
import korlibs.korge.view.*
import korlibs.image.color.*

//suspend fun main() = Korge(width = 512, height = 512, bgcolor = Colors["#2b2b2b"]) {
suspend fun main() = Korge(bgcolor = Colors["#2b2b2b"]).start {
    sceneContainer().changeTo({ MyMainScene() })
}

class MyMainScene : Scene() {
    override suspend fun SContainer.sceneMain() {
        text("Text: $mySharedString")
    }
}