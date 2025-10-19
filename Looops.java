    import java.util.*;
    import java.lang.*;

    public class Looops {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int N = sc.nextInt();
            int binary = 0;
            int a = 0;
            int place = 1;
            while(N > 0){   

                binary = binary + (N % 2)*place;
                N = N/2;
                place = place * 10;
                
            }

            System.out.println(binary);

        

        }
    }