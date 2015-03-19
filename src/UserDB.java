import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class UserDB {
    
    private Map<Integer, List<Integer>> friendMap;
    private Map<Integer, String> usernameMap;

    public UserDB() {
        usernameMap = new HashMap<Integer, String>();
        friendMap = new HashMap<Integer, List<Integer>>();
    }
    public List<Integer>getUser(String name){
        throw new RuntimeException("not implemented");
    }
    
//    public List<Integer>getUser(MACAddress macAddress){
//        throw new RuntimeException("not implemented");
//    }
    
    public void createUser(int ID, String name, String username){
        new User(ID,name,username);
        usernameMap.put(ID, username);
    }

    public void deleteUser(int userID){
        usernameMap.remove(userID);
    }
    public void addFriend(int user, int friend){
        List<Integer> friends = friendMap.get(user);
        friends.add(friend);
        friendMap.put(user, friends);
    }
    public void deleteFriend(int user, int friend){
        List<Integer> friends = new ArrayList<Integer>();
        for (Integer currentFriend:friendMap.get(user)){
            if (currentFriend != friend){
                friends.add(currentFriend);
            }
        }
        friendMap.put(user, friends);
    }
    public List<Integer> getFriends(int userID){
        return friendMap.get(userID);
    }
}
