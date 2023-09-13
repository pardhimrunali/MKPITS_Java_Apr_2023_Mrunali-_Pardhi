
public class Main {
    public static void main(String[] args) {
        //method reference using static method
       PrintStatement printStatement=MethodRefrenceExample::printSentence;
       printStatement.print();

       //method reference using non static
        MethodRefrenceExample oddNumbers=new MethodRefrenceExample();
        PrintStatement printStatementFirst=oddNumbers::PrintOddNumber;
        printStatementFirst.print();

        //method reference of constructor()
        StudentData data=Student::new;
        Student printData=data.getData();
        

    }
}