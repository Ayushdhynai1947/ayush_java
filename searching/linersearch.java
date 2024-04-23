package searching;

public class linersearch {

    public static void main(String[] args) {
        
        int[] x = {23,3,4,523,45,654,4564,234,56,67};
        boolean found = false ;
        int m = 45;
        for (int i =0;i<x.length;i++){

            if (m==x[i]){
                System.out.println("value is found ");
                found = true;
                break;

            }


            if (found){
                System.out.println("not found");
            }


        }




    }
    
}
