public class Pattern2{
    public static void main(String[] madhu){
        int count=1;
        
            for(char letter='a';letter<='p';letter++  ){
                System.out.print(letter+" ");
                if(count%4==0){
                      System.out.println();
                }
                 count++;
            }
        }
    }
