import java.io.InputStreamReader;
import java.net.URL;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Program {
   public static void main(String[]args)throws Exception{
       Gson jsonData = new GsonBuilder().create();
       String token = "&access_token=a450855d03d3b4016fbdf10c05c86f516d87da01fde4a9aa710641a9b7f361a396cbe374a7af84a8e918a";

       InputStreamReader inrReader = new InputStreamReader
               (new URL("https://api.vk.com/method/friends.get?fields=sex,bdate,online&order=random&offset=1&user_id=344557113")
                       .openStream());

       ResponseList findUser1 = jsonData.fromJson(inrReader, ResponseList.class);

       //System.out.println("Список онлайн друзей :");
       for (Response search: findUser1.getResponse()) {

           search.CheckOnlineStatusFriends(); // view online friends
           //search.CheckOfflineStatusFriends(); // view offline friends

       }

   }
}
