public class Starpattern5 {
    public static void main(String[] madhu){
        int n=6;
        for(int i=1;i<=n;i++){
        for(int j=1;j<i;j++){
            System.out.print(" ");
        }
        int stars=2*(n-i+1)-1;
        for(int k=1;k<=stars;k++){
              System.out.print("*");
        }
        System.out.println();
    }
}
}
