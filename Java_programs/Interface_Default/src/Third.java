class  Third implements First,Second{


    @Override
    public void display() {
        First.super.display();
        Second.super.display();
    }



}

