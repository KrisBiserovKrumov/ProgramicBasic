package demoExam;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;


public class MeYoutube {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Map<String,Integer> videoViews = new HashMap<>();
        Map<String,Integer> videoLikes = new HashMap<>();
        String line = reader.readLine();

        while (!line.equals("stats time")){

            if (line.contains("-")){
                String[] token = line.split("-");
                String video = token[0];
                Integer views = Integer.parseInt(token[1]);
                if (!videoViews.containsKey(video)){
                    videoViews.put(video,views);
                    videoLikes.put(video,0);
                }else {
                    videoViews.put(video,videoViews.get(video) + views);
                }
            } else {
                String[] data = line.split(":");

                String video = data[1];
                if (data[0].equals("like")) {
                    if (videoLikes.containsKey(video)){
                        videoLikes.put(video,videoLikes.get(video) + 1);
                    }
                } else {
                    if (videoLikes.containsKey(video)){
                        videoLikes.put(video,videoLikes.get(video) - 1);
                    }
                }
            }
            line = reader.readLine();
        }
        String sortedBy = reader.readLine();

        if (sortedBy.equals("by likes")){
            videoLikes.entrySet().stream().sorted((a,b)->
                    b.getValue().compareTo(a.getValue())).forEach(entry->{
                System.out.println(String.format("%s - %d views - %d likes",
                        entry.getKey(),videoViews.get(entry.getKey()),entry.getValue()));
            });
        }else{
            videoViews.entrySet().stream().sorted((a,b)->
                   b.getValue().compareTo(a.getValue())).forEach(entry->{
                System.out.println(String.format("%s - %d views - %d likes",
                        entry.getKey(),entry.getValue(),videoLikes.get(entry.getKey())));
            });

        }

    }
}
