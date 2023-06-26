public class Lift {

    int weight=50 ;
    public void liftCapacity(){
        while(weight!=0){
            System.out.println("Person will enter inside the lift");
            weight--;
        }
        System.out.println("lift is overloaded");
    }

}
