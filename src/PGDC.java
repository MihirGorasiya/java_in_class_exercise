public class PGDC {
    public int pgdc(int a, int b){
        if (a > b){
            a = a - b;
            return pgdc(b, a);
        }
        return a;
    }

}