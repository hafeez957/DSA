
// Reversing each words in a string

class ReverseEachWords{
    public static void main(String[] args) {
        String s="All remaining system will bow to the first order";
        String res="";
        String[] str=s.split(" +");
        for(int i=0;i<str.length;i++){
            res+=reverse(str[i]+" ");
        }
        System.out.println(res);
    }

    public static String reverse(String s){
        String rev="";
        for(int i=0;i<s.length();i++){
            rev=s.charAt(i)+rev;
        }
        return rev;
    }
}