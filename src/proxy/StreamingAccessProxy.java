package src.proxy;

// ServiceProxy
public class StreamingAccessProxy implements AbstractStreamingService {

    private AbstractStreamingService streamingService;
    private int freeViews = 0;

    public StreamingAccessProxy(AbstractStreamingService streamingService) {
        this.streamingService = streamingService;
    }

    @Override
    public boolean watchVideo(String videoTitle) {

        if (freeViews >= 3) {
            System.out.println("\nFree view limit reached. Please subscribe.");
            return false;
        }

        freeViews++;
        return streamingService.watchVideo(videoTitle);
    }
}
