import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("How many cases are there?: ");
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            System.out.println("Case " + (i+1) + ":");
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int genelToplam=0;
            if((n>=1) && (n<=15)){
                for(int p = 0; p<n; p++){
                    genelToplam=0;
                    for(int j=0; j<=p;j++){
                        int us= (int) Math.pow(2,j);
                        genelToplam +=(us*b);
                    }
                    System.out.print((a+genelToplam)+" ");
                }
                System.out.println();
            }
            else{
                return;
            }

        }
        in.close();
    }
}