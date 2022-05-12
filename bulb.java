import java.util.*;
public class bulb {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int switching = sc.nextInt();
        String stateofbulb =  sc.next();
        char[] bulbstate = stateofbulb.toCharArray();
        for(int i=0;i<switching;i++){
            for(int j = 0;j<stateofbulb.length();j++){
                if(bulbstate[j]=='X'){
                    bulbstate[j]='O';
                    break;
                }else{
                    bulbstate[j]='X';
                }
            }
        }
        for(char c:bulbstate){
            System.out.print(c);
        }
    }
}
