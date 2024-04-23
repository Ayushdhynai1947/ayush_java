package searching;

public class searhing_string {
    public static void main(String[] args) {
        String[] s = {"ayush", "neha", "rakesh", "rahul"};

        boolean found= true;
        String m = "ayush";

        for(int  i = 0 ;i<s.length;i++){

            if(m.equalsIgnoreCase(s[i])){
                System.out.println("found ");

                found = false;
                break ;

            }

            if(found){
                System.out.println("not found");
            }

        }




        
        


    }
    
}
