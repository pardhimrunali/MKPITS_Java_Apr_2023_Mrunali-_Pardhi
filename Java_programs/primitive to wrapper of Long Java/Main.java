public class Main {

    public static  void main(String args[]) {

        PrimitiveToWrapperLong PrimitiveToWrapper=new PrimitiveToWrapperLong();
        System.out.println("Long value is "+PrimitiveToWrapper.getWrapperFromPrimitive());
        System.out.println("String value is "+PrimitiveToWrapper.getWrapperBinaryFromPrimitive());
        System.out.println("Hexadecimal value is "+PrimitiveToWrapper.getWrapperHexFromPrimitive());
    }
}