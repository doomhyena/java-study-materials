public class Main {
    public static void main(String[] args) {

        // egy soros komment

        /*
        * tobb
        * soros
        * komment
        */

        // Konzolra valo kiiratas

        System.out.println("Hello World!");

        // 01.Valtozok es Operatorok

        // primitiv tipusu valtozok

        byte a;
        short b;
        int c;
        long d;
        float e;
        double f;
        boolean g; // igaz vagy hamis
        char h; // karakterek
        /*
        int i = 10;

        System.out.println(i);
        i = 15;
        System.out.println(i);
        i = 100;
        System.out.println(i);
         */
        int apples = 7;
        int pears = 12;
        System.out.println(apples);
        System.out.println(pears);

        int fruits = apples + pears;

        System.out.println(fruits);

        int numberofboxes = 100;
        int numberofboxessold = 17;
        int numberofboxesreamining = numberofboxes - numberofboxessold;

        System.out.println(numberofboxesreamining);

        int i = 17;
        int j = 5;

        int k = i % j;
        System.out.println(k);

        boolean b1 = true;
        boolean b2 = false;
        boolean result = b1 && b2;

        System.out.println(result);

        // referencia tipusu valtozok

        
    }
}