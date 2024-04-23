package daily_work.array;

public class copy_array {
    public static void main(String[] args) {
        
        int [] n ={23,4,3,5,6,7,8,912,12};

        int[] y = new int[n.length];

        for(int i = 0 ;i<n.length;i++){

            y[i] =n[i];
        }
        System.out.println(y[4]);

    }
    
}
