public class Main {
    public static void main(String[] args) {

        // egy soros komment

        /*
        * tobb
        * soros
        * komment
        */

        // Konzolra valo kiiratas

        // System.out.println("Hello World!");

        // 01.Valtozok es Operatorok

        // primitiv tipusu valtozok
        /*

        // egesz szam tipusu valtozok
        byte a; // 8 bit
        short b; // 16 bit
        int c; // 32 bit
        long d; // 64 bit

        // lebego pontos tipusu valtozo
        float e; // 32 bit
        double f; // 64 bit

        boolean g; // igaz vagy hamis -> 8 bit (?)
        char h; // UNICODE karakterek -> 16 bit
        */

        /*
        int i = 10;

        System.out.println(i);
        i = 15;
        System.out.println(i);
        i = 100;
        System.out.println(i);
         */
        /*

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

        System.out.println(151 % 4);
        System.out.println(152 % 4);
        System.out.println(153 % 4);
        System.out.println(154 % 4);
        System.out.println(155 % 4);
        System.out.println(156 % 4);
        System.out.println(157 % 4);
        System.out.println(158 % 4);
        System.out.println(159 % 4);
        */

        // referencia tipusu valtozok
        /*

        int number = (2 + 3) * 4;

        System.out.println(number);

        boolean b = number + 10 < 100;
        System.out.println(b);

        int i = 100;
        int j = i++ + ++i;
        // i = 102
        // 100 = 102
        System.out.println(i++);
        System.out.println(j);
        */

        /*
        * true && true => true
        * false && true => false
        * true && false => false
        * false && false => false
        */
        /*

        boolean b1 = false;
        boolean b2 = false;
        boolean result = b1 && b2;

        System.out.println(b1);
        System.out.println(b2);
        System.out.println(result);


        boolean finalResult = b1 & i++ < 1000;

        System.out.println(finalResult);
        System.out.println(i);
        */

        /*
        * VAGY OPERATOR
        *
        * true || true => true
        * false || true => true
        * true || false => true
        * false || faklse => false
        */
        /*

        boolean b1 = true;
        boolean b2 = true;
        boolean result = b1 || b2;

        System.out.println(b1);
        System.out.println(b2);
        System.out.println(true);
        */

        /*
        * KIZARO VAGY OPERATOR (XOR)
        * true ^ true => false
        * false ^ true => true
        * true ^ false => true
        * false ^ false => false
        */

        /*

        boolean b1 = true;
        boolean b2 = false;
        boolean b3 = false;
        boolean result = (b1 || b2) && b3;

        System.out.println(result);

        */

    }
}