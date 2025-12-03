
// converting Uppercase characters into Lowercase characters without using inbuilt methods

class UpperToLowerCase{
    public static void main(String[] args) {
        String s="AbCUFdE123#@!";
        String str="";
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch>='A'&& ch<='Z'){
                str+=(char)(ch+32);
            }else{
                str+=ch;
            }
        }
        System.out.println(str);
    }
}