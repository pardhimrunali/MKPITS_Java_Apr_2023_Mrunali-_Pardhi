

public class Main {
    public static void main(String[] args)
    {
        //Method overloading changing number of parameters  addition
        OverloadingExampleFirst addition=new OverloadingExampleFirst();
        int sum=addition.Addition(12,8);
        int sumsecond=addition.Addition(12,8,20);
        System.out.println(sum);
        System.out.println(sumsecond);



        //Method overloading changing data type of  arguments addition
       // System.out.println( OverloadingAdditionChangingDatatype.add(11,11));
        //System.out.println( OverloadingAdditionChangingDatatype.add(12.3,12.6));

        //Method overloading changing  number of parameters  subtraction
        OverloadingSubtraction subtraction=new OverloadingSubtraction() ;
        int sub=subtraction.Sub(20,1);
        int sub1=subtraction.Sub(200,1,99);
        System.out.println(sub);
        System.out.println(sub1);

        //Method overloading changing  number of parameters  Multiplication
        OverloadingMultiplication multiplication=new OverloadingMultiplication();
        int answer=multiplication.Multiply(20,10);
        int answer1=multiplication.Multiply(20,20,5);
        System.out.println(answer);
        System.out.println(answer1);

        //Method overloading changing data type of  arguments Division
        OverloadingDivision division=new OverloadingDivision();
        int divisionanswer=division.Division(10,2);
        double divisionanswer1=division.Division(40.05,0.5,9.8);
        System.out.println(divisionanswer);
        System.out.println(divisionanswer1);

        //Method overloading changing data type of  arguments area of square rectangle
        OverloadingArea area=new OverloadingArea();
        int rectanle=area.Shape(10,22);
        double square=area.Shape(20.6);
        System.out.println(rectanle);
        System.out.println(square);

        //Method overloading changing number of  arguments area and perimeter
        OverloadingAreaNumberofArguments areaperimeter=new OverloadingAreaNumberofArguments();
        int Squarenew= areaperimeter.ShapeFirst(10,2);
        int Perimeter=areaperimeter.ShapeFirst(20,52,24);
        System.out.println(Squarenew);
        System.out.println(Perimeter);

        // method overloading by changing datatype
        OverloadingAreaofLateral volume=new OverloadingAreaofLateral();
        double cone=volume.Shapefirst(3.14,20.2,50.02);
        int areaofcuboid=volume.Shapefirst(20,21,26);
        System.out.println(cone);
        System.out.println(areaofcuboid);



        //method overloading by number of parameter
        Area area1 =new Area();
        int areaofcube=area1.AreaOfShape(20);
        double areaofcylinder=area1.AreaOfShape(20.2,45.5,3.14);
        System.out.println(areaofcube);
        System.out.println(areaofcylinder);

        //
        Addition summation=new Addition();
        int sumthird=summation.Sum(20,3,7);
        float sumfour=summation.Sum(1.2f,1.2f);
        System.out.println(sumthird);
        System.out.println(sumfour);

    }
}