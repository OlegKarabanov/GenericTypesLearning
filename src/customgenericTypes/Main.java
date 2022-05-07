package customgenericTypes;

public class Main {
    public static void main(String[] args){

        Account acc1 = new Account( 12345, 5000);
        System.out.println(acc1.getId());

        Account acc2 = new Account("sid124563", 5000);
        System.out.println(acc2.getId());


        int a = ((Integer) acc2 .getId()) +10;
        System.out.println(a);

    }
}
