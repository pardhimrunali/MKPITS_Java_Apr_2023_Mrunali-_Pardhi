interface Message{
    void display();
}
public class Main {
    public static void main(String[] args) {

        Message displayMessage=new Message() {
            @Override
            public void display() {
                System.out.println(" Your Parcel is Delivered Successfully");
            }
        };
        displayMessage.display();


    }
}