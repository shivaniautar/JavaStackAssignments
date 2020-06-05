import java.util.Set;
import java.util.HashMap;

public class MapOfTheHashmatique {
    public static void getSongData() {
        HashMap<String, String> songMap = new HashMap<String, String>();
        songMap.put("Uprising", "They will not force us, They will stop degrading us");
        songMap.put("Knights of Cydonia", "No one's going to take me alive, Time has come to make things right");
        songMap.put("Starlight", "Our hopes and expectations, Black holes and revelations");
        songMap.put("Time is Running Out", "Our time is running out, And our time is running out, You can't push it underground");

        //Pulling out 1 of the songs by its track title:
        String songByPulledByTitle = songMap.get("Starlight");
        System.out.println(songByPulledByTitle);

        // get the keys by using the keySet method
        Set<String> keys = songMap.keySet();
        for(String key : keys) {
            System.out.println(key);
            System.out.println(songMap.get(key));
        }
    }
}
