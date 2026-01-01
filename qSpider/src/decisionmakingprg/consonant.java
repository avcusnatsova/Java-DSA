package decisionmakingprg;

import java.util.Scanner;

public class consonant {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the character: ");
		char letter = sc.next().charAt(0); //method chaining
		//letter = Character.toLowerCase(letter);
		if (letter >= 65 && letter <= 90)
		{
			letter = (char)(letter + 32);
		}
		vowel(letter);
		sc.close();
	}
	public static void vowel(char letter) {
		switch (letter) {
		/*{
		case 'A':
		{
			System.out.println("It is a VOWEL");
		}
		case 'E':
		{
			System.out.println("It is a VOWEL");
		}
		case 'I':
		{
			System.out.println("It is a VOWEL");
		}
		case 'O':
		{
			System.out.println("It is a VOWEL");
		}
		case 'U':
		{
			System.out.println("It is a VOWEL");
		}
		case 'a':
		{
			System.out.println("It is a VOWEL");
		}
		case 'e':
		{
			System.out.println("It is a VOWEL");
		}
		case 'i':
		{
			System.out.println("It is a VOWEL");
		}
		case 'o':
		{
			System.out.println("It is a VOWEL");
		}
		case 'u':
		{
			System.out.println("It is a VOWEL");
		}*/
		
		case 'a', 'e', 'i', 'o', 'u':
		{
		System.out.println("It is a Vowel");
		break;
		}
		default:
		{
			System.out.println("It is a CONSONANT");
			break;
		}
	}
}
}

