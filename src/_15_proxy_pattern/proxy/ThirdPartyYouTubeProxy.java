package _15_proxy_pattern.proxy;

import _15_proxy_pattern.some_cool_media_library.ThirdPartyYouTubeClass;
import _15_proxy_pattern.some_cool_media_library.ThirdPartyYouTubeLib;
import _15_proxy_pattern.some_cool_media_library.Video;

import java.util.HashMap;

public class ThirdPartyYouTubeProxy implements ThirdPartyYouTubeLib {

    private final ThirdPartyYouTubeLib youTubeService;
    private HashMap<String , Video> popularCache = new HashMap<>();
    private final HashMap<String, Video> cacheAll = new HashMap<>();

    public ThirdPartyYouTubeProxy(){
        youTubeService = new ThirdPartyYouTubeClass();
    }

    @Override
    public HashMap<String, Video> popularVideos() {
        if(popularCache.isEmpty()){
            popularCache = youTubeService.popularVideos();
        }
        else{
            System.out.println("Retrieved list from cache");
        }
        return popularCache;
    }

    @Override
    public Video getVideo(String videoId) {
        if(cacheAll.containsKey(videoId)){
            System.out.println("Retrieved video " + videoId + "from the cache");
        }
        else{
            cacheAll.put(videoId, youTubeService.getVideo(videoId));
        }
        return cacheAll.get(videoId);
    }

    public void reset(){
        cacheAll.clear();;
        popularCache.clear();
    }
}
