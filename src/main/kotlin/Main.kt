import kotlinx.browser.document
import model.KotlinVideo
import react.create
import react.dom.client.createRoot

val unwatchedVideos = listOf(
    KotlinVideo(1, "Building and breaking things", "John Doe", "https://youtu.be/PsaFVLr8t4E"),
    KotlinVideo(2, "The development process", "Jane Smith", "https://youtu.be/PsaFVLr8t4E"),
    KotlinVideo(3, "The Web 7.0", "Matt Miller", "https://youtu.be/PsaFVLr8t4E")
)

val watchedVideos = listOf(
    KotlinVideo(4, "Mouseless development", "Tom Jerry", "https://youtu.be/PsaFVLr8t4E")
)
fun main() {
    val container = document.getElementById("root" ) ?: error("Couldn't find root container!")
    createRoot(container).render(App.create())
}
