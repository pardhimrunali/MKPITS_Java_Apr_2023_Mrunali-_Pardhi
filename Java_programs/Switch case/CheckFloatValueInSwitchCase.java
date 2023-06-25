public class CheckFloatValueInSwitchCase {
    void OperationOfArithematic( float operand,float  operator1,float operator2){

        switch(operand)
        {
            case "3.0f":
                float result=operator1+operator2;
                System.out.println("Addition of number is "+result);
                break;

            case "3.00f":
                float subtraction=operator1-operator2;
                System.out.println("Subtraction of number is "+subtraction);
                break;

            case "3.000f":
                System.out.println("hiii iam mrunali");
                break;

            case "3.0000f":
                System.out.println("hiii iam Teju");
                break;

            case "3.0000f":
                System.out.println("hiii iam Liz");
                break;




        }

    }
}
