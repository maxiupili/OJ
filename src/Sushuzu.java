import java.util.Scanner;

public class Sushuzu {
    public static void main(String args[]) {
        int n;

        Scanner scan = new Scanner(System.in);
        while(scan.hasNext()){
            n = scan.nextInt();
            int sum = 0;
            if(n < 5){
                System.out.println(sum);
                continue;
            } else {
                for (int i = 3; i <= n-2; i++) {
                    if (isSushu(i) && isSushu(i+2))
                        sum++;
                }
                System.out.println(sum);
            }

        }


    }

    public static boolean isSushu(int x) {
        if(x<2)
            return false;
        else{
            for (int i = 2;i * i <= x;i++){
                if (x % i == 0)
                    return false;
            }
            return true;
        }
    }


}
