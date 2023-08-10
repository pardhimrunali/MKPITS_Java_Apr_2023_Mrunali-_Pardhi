public class MonthsDays {
    enum Months{January(31), February(28), March(31), April(30), May(31), June(30), July(31),  August(31), September(30), October(31), November(30),  December(31);
    int value;
        Months(int value)
        {
            this.value=value;
        }}
    public static void main(String args[]){

            for(Months c:Months.values())
            {
                System.out.println(c+ " " +c.value);
            }
    }

}
