
public class Main {
    public static void main(String[] args) {
Runnable Odd=()-> {
for(int count=1;count<=100;count++){
    if(count%2==0){
        System.out.println("Even numbers are:-" +" "+count);
    }
}
};

Runnable even=()->
{
    for(int count=1;count<=100;count++){
        if(count%2!=0)
        {
            System.out.println("Odd numbers are:-"+" "+count);
        }
    }
};

Odd.run();
even.run();
    }
}