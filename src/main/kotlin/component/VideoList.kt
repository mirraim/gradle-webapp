package component
import kotlinx.browser.window
import model.KotlinVideo
import model.Video
import react.*
import react.dom.*
import react.dom.html.ReactHTML.p


val VideoList = FC<VideoListProps> { props ->
    var selectedVideo: Video? by useState(null)
    for (video in props.videos) {
        p {
            key = video.id.toString()
            onClick = {
                selectedVideo = video
            }
            if (video == selectedVideo) {
                +"▶ "
            }
            +"${video.speaker}: ${video.title}"
        }
    }
}

external interface VideoListProps : Props {
    var videos: List<Video>
}