
// Finding given character is duplicated or not

import java.util.Scanner;

class DuplicateCharacter{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string");
        String s=sc.nextLine();
        System.out.println("Enter character to find duplicated or not");
        char ch=sc.nextLine().charAt(0);
        int occurrence1=s.indexOf(ch);
        int occurrence2=s.lastIndexOf(ch);
        if(occurrence1!=occurrence2)
            System.out.println("Duplicate character");
        else
            System.out.println("not a Duplicate character");

    }
}