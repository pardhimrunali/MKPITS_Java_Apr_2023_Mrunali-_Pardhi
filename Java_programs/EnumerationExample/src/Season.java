enum SeasonOfYear{Summer,Winter,Spring};//we can declare enum inside class as well before class
class Season {

    public static void main(String[] args){
for(SeasonOfYear s:SeasonOfYear.values())
        {
            System.out.println(s);
        }
    }
}
