public class Main {
    public static void main(String[] args) {
        NoticeForEmployee notice=new NoticeForEmployee();
        notice.NoticeToEmployee();

        PhotoSelection photo=new PhotoSelection();
        photo.photoLimit();

        InvitationCard invitation=new InvitationCard();
        invitation.Invitation();

        Lift lift=new Lift();
        lift.liftCapacity();

        Fuel petrol=new Fuel();
        petrol.petrolCapacity();
    }
}