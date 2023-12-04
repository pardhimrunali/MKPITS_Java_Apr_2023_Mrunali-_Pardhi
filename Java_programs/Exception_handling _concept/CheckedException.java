public class CheckedException {
    public static void main(String[] args) {

        System.out.println("hii");
try {

    System.out.println("hii try block");
    int number_first = 10;
    int number_second=2;
    int number_third = 0;

//System.out.println(number_first/number_second);
    System.out.println("hii without exception");

    System.out.println(number_first/number_third);
    System.out.println("hii with exception");


}
//catch(Exception e)
//{
//    System.out.println(e.getMessage());
//
//}

finally {
    System.out.println("Finally executed");
}

        System.out.println("byeee Exception");
    }
}
