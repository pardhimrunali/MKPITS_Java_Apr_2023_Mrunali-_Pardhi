class ThreadFirst {
    Runnable run() {
        for (int count =0; count <= 100; count++) {
if(count%2==0){
    System.out.println(count);
            }
        }
        return null;
    }

    ;
}
