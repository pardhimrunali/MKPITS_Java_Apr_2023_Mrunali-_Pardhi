public class PhotoShare {
    int photos=10;
    public void photoSelect(){
        do{
            System.out.println("Select  photo");
            photos--;
        }
        while(photos!=0);
        System.out.println("Photo Selection limit is over");

    }
}
