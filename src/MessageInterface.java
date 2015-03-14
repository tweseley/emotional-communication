import java.time.Instant;

public class MessageInterface {
    private int senderID;
    private int receivingID;
    private String emotion;
    private Image image;
    private Instant timeStamp;
    
    
    public void message(int senderID, int receivingID, String emotion, Image image, Instant timeStamp){
        this.senderID = senderID;
        this.receivingID = receivingID;
        this.emotion = emotion;
        this.image = image;
        this.timeStamp = timeStamp;
    }
    public int getSenderID(){
        return this.senderID;
    }
    public int getReceivingID(){
        return this.receivingID;
    }
    public String getEmotion(){
        return this.emotion;
    }
    public Image getImage(){
        return this.Image;
    }
    public Instant getTimeStamp(){
        return this.timeStamp;
    }
}
