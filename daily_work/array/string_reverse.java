package daily_work.array;

public class string_reverse {
    public static void main(String[] args) {
        
        char [] str = {'s','t','p','l','n'};
        System.out.println("before reverse");
        System.out.println(str);
        for(int  i = 0 , j=str.length-1 ; i<j;i++,j--){
            char temp = str[i];
            str[i] =str[j];
            str[j]= temp;

        }
        System.out.println("After reverse");
        System.out.println(str);


        

    }
}
