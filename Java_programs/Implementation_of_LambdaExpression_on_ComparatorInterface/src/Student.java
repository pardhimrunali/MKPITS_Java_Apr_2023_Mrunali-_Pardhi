public class Student {
   public long erp_id;
  public  String name;

    public Student(long erp_id, String name) {
        this.erp_id = erp_id;
        this.name = name;
    }

    public long getErp_id() {
        return erp_id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {

        return erp_id + name;
    }
}



