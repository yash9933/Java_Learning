package Subset;
public class string {
    public static void main(String[] args) {
        String name = "abc";
        subseq("",name);
    }

    static void subseq(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char x = up.charAt(0);
        subseq(p+x, up.substring(1));
        subseq(p, up.substring(1));
    }
}