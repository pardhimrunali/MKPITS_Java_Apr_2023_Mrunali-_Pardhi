public class InvalidAmount  extends Exception{
    @Override
    public String getMessage() {
        return " Add amount more than 100" ;
    }
}
