package src.proxy;

public class StreamingService implements AbstractStreamingService {

    @Override
    public boolean watchVideo(String videoTitle) {

        if (videoTitle == null || videoTitle.trim().isEmpty()) {
            System.out.println("\nInvalid video title.");
            return false;
        }

        System.out.println("\nStreaming video: " + videoTitle);
        return true;
    }
}
