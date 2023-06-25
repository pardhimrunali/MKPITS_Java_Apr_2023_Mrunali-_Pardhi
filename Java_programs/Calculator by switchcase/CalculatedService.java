public class CalculatedService {
     void performOperation(String operand,double operator1,double operator2){
        switch(operand){
            case"+":
                AdditionOfTwoNumber additionOfValue= new AdditionOfTwoNumber();
                additionOfValue.getCalculatedValue(operator1,operator2);
                break;

            case"-":
                SubtractionOfTwoNumber subtractionOfValue= new SubtractionOfTwoNumber();
                subtractionOfValue.getCalculatedValue(operator1,operator2);
                break;

            case"*":
                MultiplicationOfTwoNumber multiplicationOfValue=new MultiplicationOfTwoNumber();
                multiplicationOfValue.getCalculatedValue(operator1,operator2);
                break;

            case"/":
                DivisionOfTwoNumber divisionOfValue=new DivisionOfTwoNumber();
                divisionOfValue.getCalculatedValue(operator1,operator2);


        }
    }
}
