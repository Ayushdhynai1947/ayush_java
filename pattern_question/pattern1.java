package pattern_question;

public class pattern1 {
    public static void main(String[] args) {
        int n = 7;
        for( int r=1;r<=n;r++){
            for (int c = 1;c<=r;c++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    
}
