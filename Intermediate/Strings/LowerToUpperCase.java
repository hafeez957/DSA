
// converting lowercase characters into uppercase characters without using inbuilt methods

class LowerToUpperCase{
    public static void main(String[] args) {
        String s="AbcdE123#@!";
        String str="";
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch>='a'&& ch<='z'){
                str+=(char)(ch-32);
            }else{
                str+=ch;
            }
        }
        System.out.println(str);
    }
}