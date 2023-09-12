public class Main {
    public static void main(String[] args) {
        ThreadFirst evenNumber = new ThreadFirst();
        evenNumber.run();


//annonymous class
        Runnable odd = new Runnable() {
            @Override
            public void run() {
                for (int count =1; count <= 100; count++) {
                    if (count % 2 == 0) {
                        System.out.println(count);
                    }
                }
            }

        };
        odd.run();


        //annonymous class print odd number
        Runnable even=new Runnable() {
            @Override
            public void run() {
                for(int count=1;count<=100;count++)
                {
                    if(count%2!=0)
                        System.out.println(count);
                }
            }
        };
        even.run();
    }
}