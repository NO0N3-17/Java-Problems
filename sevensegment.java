import java.util.*;
import java.util.concurrent.ThreadPoolExecutor.DiscardOldestPolicy;

public class sevensegment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String numberString = sc.nextLine().trim();
        String currentState = "0000000";
        int total = 0;
        for(char number: numberString.toCharArray()){
            if(number>='0' && number<='9'){
                total+=compareValue(currentState, val(number));
                currentState=val(number);
            }else{
                System.out.println("not valid");
                break;
            }
        }
        if(total!=0){
            System.out.println(total);
        }
    }
    static String val(char number){
        switch(number){
            case '0':
                return "1111110";    
            case '1':
                return "0110000";
            case '2':
                return "1101101";
            case '3':
                return "1111001";
            case '4':
                return "0110011";
            case '5':
                return "1011011";
            case '6':
                return "1011111";
            case '7':
                return "1110000";
            case '8':
                return "1111111";
            case '9':
                return "1111011";
        }
        return "0000000";
    }
    static int compareValue(String currentState,String prevState){
        int differnceState = 0;
        for(int i=0;i<currentState.length();i++){
            if(currentState.charAt(i)!=prevState.charAt(i)){
                differnceState+=1;
            }
        }
        return differnceState;
    }
}
