import java.util.*;
class Main{
    public static void text(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        
        for(int i = 0; i < t; i++){
            int r = sc.nextInt();
            String s = sc.next();
            System.out.println();
            
            for(int j = 0; j < s.length(); j++){
                System.out.println();
               
                
                for(int z = 0; z < r; z++){
                    System.out.print(s.charAt(j));
                    System.out.println();
                } 
            }
        }
    }
}