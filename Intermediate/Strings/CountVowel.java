
// counting vowels in a string

class CountVowel{
    public static void main(String[] args) {
        String s="KSRTC drivers are next level".toLowerCase();
        int count=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                count++;
            }
        }
    }
}