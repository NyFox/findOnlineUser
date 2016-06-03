import java.util.ArrayList;
import java.util.List;

public class CheckItem {

    Response obj1 = new Response();

    public void CheckOnlineFriends(){

        switch (obj1.online){
            case "1":
                List<String> itemList = new ArrayList<>();
                itemList.add(obj1.user_id);

                for (String item : itemList) {

                    System.out.println("Online: " + item + " " + obj1.first_name);

                }

                break;
            case "2":
                break;
        }

    }

}
