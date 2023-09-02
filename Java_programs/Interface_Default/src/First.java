interface First {

    static void Area(){
        System.out.println("Good Morning");
    }
    default void display(){
        System.out.println("Hello");
    }
}
