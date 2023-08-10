public class Customer {

    public   void display(int age) throws InvalidAgeException{

        if(age<0 || age>100)
            throw new InvalidAgeException();
    }
}
