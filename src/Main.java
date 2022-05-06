import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        Object o = new Scanner(System.in);
//
//
//        Scanner scanner = null;
//
//
//
//        if (o instanceof Scanner) scanner = (Scanner) o;
//        if (scanner != null){
//            scanner.nextInt();
//        }
//
//        Object o1 = new String();
//
//        Object o2 = new Integer(15);

        Object[] objects = {10, "Привет", 3.14}; //здесь происходит автоупаковка

        for(Object o : objects){
               if (o instanceof String){
                   String s = (String) o;
                   System.out.println(s);
               }
           }

        ArrayList <Integer> numbers = new ArrayList();       // сохраняет Object

            for(int i=0; i<10; i++){              // сохраняем в коллекцию 10,20,,,100
                numbers.add(i*10);                // заполняем значениями
            //numbers.add(i*10.4F);      // Так будет ошибка
            }
            int sum = 0;                            // суммируем все сложенные цифры
            for(Integer o : numbers){                //берем наш объект
                sum = sum + /*(Integer)*/o;             // суммируем
            }
        System.out.println(sum);


            // Основной тип <Тип параметр>


    }
}