package _15_proxy_pattern.some_cool_media_library;

import java.util.HashMap;

public class ThirdPartyYouTubeClass implements ThirdPartyYouTubeLib{

    @Override
    public HashMap<String, Video> popularVideos() {
        connectToServer("www.youtube.com");
        return getRandomVideos();
    }

    @Override
    public Video getVideo(String videoId) {
        connectToServer("www.youtube.com/" + videoId);
        return getSomeVideo(videoId);
    }

    // -----------------------------------------------------------------------
    // Fake methods to simulate network activity. They as slow as a real life.

    private int random(int min, int max){
        return min + (int) ( Math.random() * (max-min+1) );
    }

    private void experienceNetworkLatency(){
        int randomLatency = random(5, 10);
        for(int i=0; i<randomLatency; i++){
            try{
                Thread.sleep(100);
            }
            catch(InterruptedException e){
                System.out.println("Something went wrong");
            }
        }
    }

    private void connectToServer(String server){
        System.out.println("Connecting to " + server + "..." );
        experienceNetworkLatency();
        System.out.println("Connected! \n");
    }

    private HashMap<String, Video> getRandomVideos(){
        System.out.println("Downloading populars...");
        experienceNetworkLatency();
        HashMap<String, Video> hMap = new HashMap<>();
        hMap.put("catzzzzzzzzz", new Video("sadgahasgdas", "Catzzzz.avi"));
        hMap.put("mkafksangasj", new Video("mkafksangasj", "Dog play with ball.mp4"));
        hMap.put("dancesvideoo", new Video("asdfas3ffasd", "Dancing video.mpq"));
        hMap.put("dlsdk5jfslaf", new Video("dlsdk5jfslaf", "Barcelona vs RealM.mov"));
        hMap.put("3sdfgsd1j333", new Video("3sdfgsd1j333", "Programing lesson#1.avi"));

        System.out.print("Done!" + "\n");
        return hMap;
    }

    private Video getSomeVideo(String videoId){
        System.out.println("Downloading video");

        experienceNetworkLatency();
        Video video = new Video(videoId, "Some video title");

        System.out.println("Done! \n");
        return video;
    }
}
