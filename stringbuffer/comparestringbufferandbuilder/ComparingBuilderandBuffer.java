package stringbuffer.comparestringbufferandbuilder;

public class ComparingBuilderandBuffer {
    public static void main(String[] args) {
        long starttime, endtime;

        //testing String Builder performance
        starttime = System.nanoTime();
        StringBuilder str1 = new StringBuilder("hey");

        for (int i=0;i<1000000; i++){
            str1.append("hello");
        }
        endtime = System.nanoTime();
        System.out.println("String Builder time:" +(endtime-starttime));

        //testing String Buffer Performance
        starttime = System.nanoTime();
        StringBuffer str2 =new StringBuffer("hey");
        for(int i=0;i<1000000;i++){
            str2.append("hello");
        }
        endtime=System.nanoTime();
        System.out.println("String Buffer time:"+(endtime-starttime));
    }
}