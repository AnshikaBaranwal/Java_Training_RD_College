public class PairOfString {
    static String output=" ";
    static void pairString(String str,int i){
        output =  output + str.charAt(i);
        if(i==str.length()-1){
            return;
       } 
      if(str.charAt(i)==str.charAt(i+1)){
        output=output + "*";
        
      }
       pairString(str,i+1);
     
    }
    
    
    public static void main(String[] args) {
        String s="geek";
        pairString(s,0);
        System.out.println(output);
        
    }
}
    

