public class Main {
    public static void main(String[] args) {

        int x = 8;
        System.out.println(mySqrt(x));
    }

    public static int mySqrt(int x) {

        if(x==2){
            return 1;
        }

        for(int i = 1; i <= (x/2); i++){
            int squared = i*i;
            if(squared > x){
                return i-1;
            }
            else if(squared == x){
                return i;
            }
        }

        return x;

    }
}