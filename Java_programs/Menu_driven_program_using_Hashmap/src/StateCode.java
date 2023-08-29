import java.util.HashMap;
import java.util.Scanner;

public class StateCode {

    public void CityNmaeCode()
    {
        Scanner sc=new Scanner(System.in);
        HashMap<Integer,String> codeOfCity=new HashMap<>();
        while(true){

            System.out.println(" 1:Add Record \n 2:Display Record \n 3:Find Record \n 4:Delete \n 5:Update CityName \n 6.clear\n 7.Exit");
            System.out.println("Enter Choice:-");
            int choice = sc.nextInt();
            switch(choice){
                case 1:
                    System.out.println("Enter the code of city:- ");
                    Integer code= sc.nextInt();
                    System.out.println("Enter the city Name:-");
                    String city_name=sc.next();
                    codeOfCity.put(code,city_name);
                    break;

                case 2:
                    System.out.println(codeOfCity);
                    break;

                case 3:
                    System.out.println("Enter the code of city:-");
                    Integer codeOf_city=sc.nextInt();
                    System.out.println("City of given code is:-"+" "+codeOfCity.get(codeOf_city));
                    break;
                case 4:
                    System.out.println("Enter the code of city which you want to delete:-");
                    Integer city_delete=sc.nextInt();
                    System.out.println("deleted record is:-"+" "+codeOfCity.remove(city_delete));
                    System.out.println(codeOfCity);
                    break;


                case 5:

                    System.out.println("Enter the code of city which you want to replace:-");
                    Integer code_replace=sc.nextInt();
                    System.out.println("Enter the Changed Name of city:-");
                    String city_new= sc.next();
                    codeOfCity.replace(code_replace,city_new);
                    System.out.println(codeOfCity);
                    break;

                case 6:
                    codeOfCity.clear();
                    System.out.println("Data is cleared");
                    System.out.println(codeOfCity);

                case 7:
                    return;
















            }
        }

    }
}

