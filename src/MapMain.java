import java.util.HashMap;
import java.util.Map;

public class MapMain {
    public static void main(String[] args) {
        Map<String, String> userMap = new HashMap<>();
        userMap.put("Croatia", "Zagreb");
        userMap.put("Hungary", "Budapest");
        userMap.put("Austria", "Vienna");

        System.out.println(userMap.get("Croatia"));
        System.out.println(userMap.get("Hungary"));
        System.out.println(userMap.get("Austria"));

        String city = userMap.get("Czech Republic");
        if (city != null) {
            System.out.println(city);
        } else {
            System.out.println("都市が見つかりませんでした。");
        }
    }
}


