package daily_work.array;

public class reverse_array {

    public static void main(String[] args) {
        
        int [] num = {23,56,34,786,45};

        int i = 0 ;
        int j = num.length-1;
        while ((i<=j)) {
           int  temp = num[i];
           num[i] = num[j];
           num[j] = temp;
           i++;
           j--;
           
        }
        for( int k = 0;k<num.length;k++){
            System.out.print(num[k]+ " ");
            
        }
        


        }
    }
    
