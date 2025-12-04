
// Counting Upper and lower , special and numeric characters in a String

class CountingCharactersAndMore{
    public static void main(String[] args) {
        String s="AbCUFdE123#@!";
        int Lower_count=0,Upper_count=0,special=0,numeric=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch<=47&& ch>=32 || ch<=64 && ch>=58 || ch>=91&&ch<=96 || ch>=123&&ch<=126){
                special++;
            }else if(ch<=90&&ch>=65){
                Upper_count++;
            }else if(ch>=97&&ch<=122){
                Lower_count++;
            }else{
                numeric++;
            }
        }
        System.out.println("special characters count is :"+special);
        System.out.println("numeric characters count is :"+numeric);
        System.out.println("uppercase characters count is :"+Upper_count);
        System.out.println("lowercase characters count is :"+Lower_count);
    }
}