package daily_work.array;

public class greater_array {
    
    public static void main(String[] args) {
        
        int [] x= {23,454,734,7,23,68,234};
        int temp = x[0];

        for(int i =1;i<x.length;i++){
            if (x[i]>temp){
                temp = x[i];
                
            
            }
            
            
        }
        System.out.println(temp);
    }
}
