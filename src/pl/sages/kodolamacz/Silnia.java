package pl.sages.kodolamacz;

public class Silnia {


    // 0! == 1
    // 1! == 1
    // 2! == 2
    // 3! == 6
    // ...
    // n! = n * (n-1)!
    public static long silnia(long n){
        long result = 1;
        for(long i=1; i <= n; i++){
            result *= i;
        }
        return result;
    }

    public static long silniaRekurencyjna(long n){
        if(n == 0){
            return 1;
        }
        return n * silniaRekurencyjna(n - 1);
    }

    public static long fibbonacci(long n){
        if(n == 0 || n == 1){
            return n;
        }else{
            return fibbonacci(n-1) + fibbonacci(n - 2);
        }
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println("Fib("+i+")="+fibbonacci(i));
        }

        for (int i = 0; i < 10; i++) {
            System.out.println("silnia z "+i+" wynosi " + silniaRekurencyjna(i));
        }
    }

}
