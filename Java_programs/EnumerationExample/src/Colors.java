public class Colors {
    enum color{red,blue,pink,purple,green};
    public  static void main(String[] args)
    {
        for(color c:color.values())//values() method
            System.out.println(c);
        {

            //valuesOf() method
            System.out.println("Value of red is:"+color.valueOf("red"));
       //ordinal() method
            System.out.println("Index of green is:"+color.valueOf("green").ordinal());

        }
    }
}
