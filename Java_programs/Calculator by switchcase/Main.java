public class Main {
    public static void main(String[] args) {
    CalculatedService calculatedService=new CalculatedService();
    calculatedService.performOperation("+",10.2,20.2);
    calculatedService.performOperation("-",52.4,23.6);
    calculatedService.performOperation("*",20.3,36.8);
    calculatedService.performOperation("/",10.3,3.5);


    }
}