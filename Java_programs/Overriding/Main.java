public class Main {
    public static void main(String[] args) {


        //Addition
        SuperClassMathOp sum=new ChildClassMathOp();
        System.out.println(sum.add(25,6));

        SuperclassPerson person=new ChildClassPerson();
        person.teach();


        SuperClassCollege print=new ChildClassCollege();
        print.move();



        SuperClassSubtraction multiply=new ChildClassSubtraction();
        System.out.println(multiply.subtract(4.2f,2.2f));

        SuperClassArea cubevolume=new ChildClassArea();
        System.out.println(cubevolume.CubeVolume(5));

        SuperClassMath addmultiply=new ChildClassMath();
        System.out.println(addmultiply.math(20,5,3));

        SuperClassHuman Profession=new ChildClassHuman();
        Profession.job();

        SuperClassCurvedArea cubecurvedarea=new ChildClassCurvedArea();
        System.out.println(cubecurvedarea.curvearea(40));

        SuperClassPrice totalprice=new ChildClassPrice();
        System.out.println(totalprice.price(10080.5));

        SuperClassCubeOfNumber cubeofnum=new ChildClassCubeOfNumber();
        System.out.println(cubeofnum.cube(23));
        cubeofnum.cube(12);




    }
}