// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Customer c=new Customer();
        try {
            c.display(12);

        } catch(InvalidAgeException e)
            {
            System.out.println(e.getMessage());
        }

        }
    }
