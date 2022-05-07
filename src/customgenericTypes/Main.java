package customgenericTypes;

public class Main {
    public static void main(String[] args){

        Account <Integer> acc1 = new Account( 12345, 5000);
        System.out.println(acc1.getId());

        Account <String> acc2 = new Account("sid124563", 5000);
        System.out.println(acc2.getId());


        int a = ((Integer) acc1 .getId()) +10; //опасное преобразование типов
        System.out.println(a);

    }
}
