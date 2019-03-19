import java.util.LinkedList;
import java.util.List;

public class E19 {

    private static List<Locker> lockers = new LinkedList<>();

    public static void main(String[] args) {


        for (int i = 1; i <= 100; i++) {
            Locker addedLocker = new Locker();
            addedLocker.setNumber(i);
            lockers.add(addedLocker);
        }

        for(int j = 2; j<=100; j++){
            for(Locker i:lockers){
                if(i.getNumber()%j==0){
                    i.setOpen();
                }
            }
        }

        System.out.println("Open lockers: " + openLockers());
    }

    private static int openLockers() {
        int sum = 0;
        for(Locker l:lockers){
            if(l.isOpen()){
                sum+=1;
            }
        } return sum;
    }
}
