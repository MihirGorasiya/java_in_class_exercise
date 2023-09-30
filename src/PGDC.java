public class PGDC {
    int number1;
    int number2;


    public int pgdc(int a, int b){
        if (a > b){
            a = a - b;
            return pgdc(b, a);
        }
        System.out.println("");
        return a;
    }

}