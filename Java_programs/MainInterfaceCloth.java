interface Cloth{

public  void priceCalculation();

}
class WesternWear implements Cloth{
public void  priceCalculation(){
System.out.println("calculation methods");



}

}

class MainInterfaceCloth{
public static void main(String args[])
{
     WesternWear calculation=new  WesternWear();
	 calculation.priceCalculation();
}



}