
// finding longest palindromic substring

class LongestPalindromicSubstring{
    public static void main(String[] args) {
         String s="babad";
         String res="";
        for(int i=0;i<s.length();i++){
            for(int j=i;j<s.length();j++){
            String ss= s.substring(i,j+1);
                if(isPalin(ss) &&res.length()<ss.length()){
                    res=ss;
                }
            }
        }
        System.out.println(res);
    }

    public static boolean isPalin(String s){
        int i=0,j=s.length()-1;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }
}