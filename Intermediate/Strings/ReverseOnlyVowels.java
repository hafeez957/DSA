
// Reversing Only Vowels present in an String

class ReverseOnlyVowels {

    public static void main(String[] args) {
        String s = "IcecrEAm";
        char[] ch = s.toCharArray();
        int i = 0, j = ch.length - 1;
        while (i < j) {
            if (!(checkVowel(ch[i]))) {
                i++; 
            }else if (!(checkVowel(ch[j]))) {
                j--; 
            }else {
                char temp = ch[j];
                ch[j] = ch[i];
                ch[i] = temp;
                i++;
                j--;
            }
        }
        String str=new String(ch);
        System.out.println(str);
    }

    public static boolean checkVowel(char c){
        return c=='a'||c=='e'||c=='i'||c=='o'||c=='u'|| c=='A'||c=='E'||c=='I'||c=='O'||c=='U';
    }
}
