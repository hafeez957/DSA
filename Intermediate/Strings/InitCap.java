
// Converting Initial letter to capital

class InitCap {

    public static void main(String[] args) {
        String s = "  Java is a programming language  ";
        int i = 0;
        char ch = s.charAt(i);
        String res = "";
        if (ch != ' ') {
            if (ch >= 'a' && ch <= 'z') {
                res += (char) (ch - 32);
            } else {
                res += ch;
            }
            i++;
        }
        for (; i < s.length(); i++) {
            char ch1 = s.charAt(i);
            if (ch1 != ' ' && s.charAt(i - 1) == ' ') {
                if (ch1>= 'a' && ch1 <= 'z') {
                    res += (char) (ch1 - 32);
                } else {
                    res += ch1;
                }
            } else {
                res += ch1;
            }
        }
        System.out.println(res);
    }
}
