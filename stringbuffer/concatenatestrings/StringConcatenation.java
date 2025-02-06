package stringbuffer.concatenatestrings;

class StringConcatenation {
    public static String concatenateString(String [] str){
       StringBuffer result=new StringBuffer();
         for(int i=0;i<str.length;i++){
             result.append(str[i]);
         }
         return result.toString();
   }
}
