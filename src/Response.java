import java.util.ArrayList;
import java.util.List;

public class Response
{
    private String uid;

    public String first_name;

    private String sex;

    private String hidden;

    private String last_name;

    public String user_id;

    public String online;

    public String getUid ()
    {
        return uid;
    }

    public void setUid (String uid)
    {
        this.uid = uid;
    }

    public String getFirst_name ()
    {
        return first_name;
    }

    public void setFirst_name (String first_name)
    {
        this.first_name = first_name;
    }

    public String getSex ()
    {
        return sex;
    }

    public void setSex (String sex)
    {
        this.sex = sex;
    }

    public String getHidden ()
    {
        return hidden;
    }

    public void setHidden (String hidden)
    {
        this.hidden = hidden;
    }

    public String getLast_name ()
    {
        return last_name;
    }

    public void setLast_name (String last_name)
    {
        this.last_name = last_name;
    }

    public String getUser_id ()
    {
        return user_id;
    }

    public void setUser_id (String user_id)
    {
        this.user_id = user_id;
    }

    public String getOnline ()
    {
        switch (user_id){
            case "56165121":
               int online = Integer.parseInt(this.online);
                if (online == 1){
                    System.out.println("Пользователь: " + first_name + " Онлайн: " + online);
                }
                break;
        }
        return online;
    }

    public void CheckOnlineStatusFriends(){
        if(online.equals("1")){
        switch (online) {
            case "1":
                List<String> itemList = new ArrayList<>();
                itemList.add(user_id);

                for (String item : itemList) {

                    System.out.println("Online: " + item + " " + first_name);

                }
                break;
            }
        }
    }

    public void CheckOfflineStatusFriends(){
        switch (online){
            case "0":
                List<String> offline = new ArrayList<>();
                offline.add(user_id);

                for (String item : offline) {

                    System.out.println("Offline: " + item + " " + first_name);

                }
                break;
        }
    }

    public void setOnline (String online)
    {
        this.online = online;
    }

    @Override
    public String toString()
    {
        return "Response[uid = "+uid+", first_name = "+first_name+", sex = "+sex+", hidden = "+hidden+", last_name = "+last_name+", user_id = "+user_id+", online = "+online+"]";
    }
}