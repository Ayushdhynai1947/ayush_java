package daily_work.array;

public class adjecent_greater {

    public static void main(String[] args) {
        
        int[] x = {23, 45, 56, 67, 78, 345, 567, 345};
    
        // Check the first element
        if (x[0] > x[1]) {
            System.out.println(x[0]);
        }
    
        // Check middle elements
        for (int i = 1; i < x.length - 1; i++) {
            if (x[i] > x[i - 1] && x[i] > x[i + 1]) {
                System.out.println(x[i]);
            }
        }
    
        // Check the last element
        if (x[x.length - 1] > x[x.length - 2]) {
            System.out.println(x[x.length - 1]);
        }
    }
    
    

    // public static void main(String[] args) {
        
    //     int [] x = {45,23,56,67,78,345,567,345};

    //     if(x[0]>x[1])
    //         System.out.println(x[0]);
        

    //     int j  = x.length-1;

    //     for (int i =1 ;i<j;i++){


    //         if(x[i]>x[i+1]|| x[i]>x[i-1])
    //             System.out.println(x[i]);

            

    //     }



    //     if(x[j]>x[j-1]){
    //         System.out.println(x[j]);
    //     }
    // }
}
