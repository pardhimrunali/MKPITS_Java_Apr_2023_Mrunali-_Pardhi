public class Main {
    public static void main(String[] args) {
        Hotspot device = new Hotspot();
        device.HotspotConnection();

        WeightCalculation item=new WeightCalculation();
        item.weightOfItem();

        PhotoShare share=new PhotoShare();
        share.photoSelect();

        LaptopPassword passwordOfLaptop=new LaptopPassword();
        passwordOfLaptop.Password();


    }
}