
public class User {
    private final int userID;
    private final String name;
    private final String username;
    
    private static String age;
    private static String gender;
    private static String state;
    private static String city;
    private static String school;
    
    public User(int userID, String name, String username) {
        this.userID = userID;
        this.name = name;
        this.username = username;
    }
    
    public enum Attribute{GENDER(gender), CITY(city), AGE(age), STATE(state), SCHOOL(school);
        private String addition;
        
        private Attribute(String addition) {
            this.addition = addition;
        }
    }
    
    public int getUserID(){
        return this.userID;
    }
    public String getName(){
        return this.name;
    }
    public String getUsername(){
        return this.username;
    }
    
    public void setUserAttribute(Attribute attribute){
        throw new RuntimeException("not implemented");
    }

}
