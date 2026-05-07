import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
     int max=0;
    Scanner k=new Scanner(System.in);
    int n =k.nextInt();
    while(n>0){
        int d=n%10;
    if(d>max){
        max=d;
    }
            n=n/10;
    }
            System.out.println("Largest digit="+max);
    }
}
