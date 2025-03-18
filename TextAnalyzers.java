/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package textanalyzers;

/**
 *
 * @author DEBA
 */
//Enter a text: Java is Fun!
//
//Menu:
//1. Count Characters
//2. Count Words
//3. Count Vowels and Consonants
//4. Reverse Text
//5. Convert to Uppercase
//6. Convert to Lowercase
//7. Exit
import java.util.Scanner;

public class TextAnalyzers {

    String users;
    char ch;

//    Constructor
    TextAnalyzers(String users) {
        this.users = users;
    }
// reverse

    public void reverseText() {
        for (int i = users.length() - 1; i >= 0; i--) {
            System.out.print(users.charAt(i));
        }
        System.out.println();

    }
//    count vowel

    public void countVowel() {
        int count = 0;

//        String users = "java";
        System.out.print("The Consonants in the word " + users + " is: ");
        for (int i = 0; i < users.length(); i++) {
//            sout(i) // 0,1,2,3,.... sout(user.charAt(i)) // j,a,v,a
            ch = users.charAt(i);      // java
            if (ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u' && ch != ' ') {
                count++;
                System.out.print(ch + ", ");
            }
        }
        System.out.println("Total consonants are: " + count);
        System.out.println("The Vowels in the word " + users + " is " + (users.length() - count));
//        System.out.println("The Consonants in the word " + users + " is " + count + ", " + ch);
//        System.out.println("The Vowels in the word " + users + " is " + (users.length() - count));
    }

//    words counts by using slpiting them .split
    public void countWords() {
        String[] userss = users.split(" ");
        for (String user : userss) {
            System.out.println(user);
        }
        System.out.println("Words count is: " + userss.length);
    }

//    character
    public void countCharacter() {
//        int count = 0;
//        for (int i = 0; i < users.length(); i++) {
//
//            count++;
//        }
        System.out.println("The character in " + users + " is: " + users.replaceAll(" ", "").length() + ", Character");
    }

//    entery point
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//      user input  
        System.out.println("Enter the text: ");
        String users = sc.nextLine().toLowerCase();

//        Menu
        while (true) {
            System.out.println("----Menu----");
            System.out.println("1. Count Characters");
            System.out.println("2. Count Words");
            System.out.println("3. Count Vowels and Consonants");
            System.out.println("4. Reverse Text");
            System.out.println("5. Convert to Uppercase");
            System.out.println("6. Convert to Lowercase");
            System.out.println("7. Exit");

            System.out.print("Enter your Choice: ");

            int input = sc.nextInt();

//   choice, remember with one constructor u can create multiple object and object name should be differ like unique
//instead of creating multiple object in switch statement you can directlt create here only
// 
            TextAnalyzers txt = new TextAnalyzers(users);

            switch (input) {
                case 1://                TextAnalyzers txt1 = new TextAnalyzers(users);
                    txt.countCharacter();
                    break;
                case 2: //                TextAnalyzers txt1 = new TextAnalyzers(users);
                    txt.countWords();
                    break;
                case 3://                TextAnalyzers txt1 = new TextAnalyzers(users);
                    txt.countVowel();
                    break;
                case 4://                TextAnalyzers txt1 = new TextAnalyzers(users);
                    txt.reverseText();
                    break;
                case 5:
                    System.out.println(users.toUpperCase());
                    break;
                case 6:
                    System.out.println(users.toLowerCase());
                    break;
                case 7:
                    System.out.println("Thank you!!!");
                    return;
                default:
                    System.out.println("Invalid Responds");

            }

        }
    }

}
