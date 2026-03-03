/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package all.question;

import java.util.Scanner;

/**
 *
 * @author hp
 */
public class AllQuestion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                Scanner input =new Scanner(System.in);
      char ch =  input.next().charAt(0);
        switch(ch){
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println(ch+"character is a vowel");
            break;
            case 'A':
            case 'E':
                case'I':
                case 'O':
                case 'U':
                    System.out.println(ch+"character is a vowel");
                    break;
                default:
                    System.out.println(ch+"character is not a vowel");
        }
            
        // TODO code application logic here
    }
    
}
