/*
    Mihir Gorasiya (C0895312)
    23 Sep 2023
*/


public class Main {
    public static void main(String[] args) {
//        Scanner s = new Scanner(System.in);
//        double realNumber;
//        System.out.println("Enter Real Number: ");
//        realNumber =  s.nextDouble();
//
//        if(realNumber >= 2 && realNumber <3){
//            System.out.println(realNumber + " x does belongs to I");
//        }
//        else if (realNumber > 0 && realNumber <= 1){
//            System.out.println(realNumber + " x does belongs to I");
//        }
//        else if (!((realNumber <= -10) || (realNumber >= -2))){
//            System.out.println(realNumber + " x does belongs to I");
//        }
//        else {
//            System.out.println(realNumber + " x does not belongs to I");
//        }

        PGDC p = new PGDC();
        System.out.println(p.pgdc(42,24));

    }
}
//class PGDC {
//    public int pgdc(int a, int b){
//        if (a > b){
//            a = a - b;
//            return pgdc(b, a);
//        }
//        return a;
//    }
//}
