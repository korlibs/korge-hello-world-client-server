import korlibs.korge.*
import korlibs.korge.scene.*
import korlibs.korge.view.*
import korlibs.image.color.*
import korlibs.korge.virtualcontroller.virtualController
import korlibs.samples.clientserver.*

//suspend fun main() = Korge(width = 512, height = 512, bgcolor = Colors["#2b2b2b"]) {
suspend fun main() = Korge(bgcolor = Colors["#2b2b2b"]) {
    sceneContainer().changeTo({ MyMainScene() })
}

class MyMainScene : Scene() {
    override suspend fun SContainer.sceneMain() {
        text("Text: $mySharedString")
        virtualController()
    }
}