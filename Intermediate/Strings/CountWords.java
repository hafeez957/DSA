
// counting words in a string without using inbuilt methods

class CountWords{
    public static void main(String[] args) {
        String s="Java is a pr  ogramm  ing language  ";
        int count=0;
        int i=0;
        if(s.charAt(i)!=' '){
            count++;
            i++;
        }
        for(;i<s.length();i++){
            if(s.charAt(i)!=' '&&s.charAt(i-1)==' '){
                count++;
            }
        }
        System.out.println(count);
    }
}