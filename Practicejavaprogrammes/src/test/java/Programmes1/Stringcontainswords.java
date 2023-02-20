package Programmes1;

public class Stringcontainswords {

	
	
	


		public static void main(String[] args) {
			 String str = "eeeeol";
	//		System.out.println(stringContainsVowels("Hello")); // true
	//		System.out.println(stringContainsVowels("Novac")); // false
			System.out.println(Stringcontainswords(str)); // true
				
			

		}

		public static boolean Stringcontainswords(String input) {

			return input.toLowerCase().matches(".*[ol].*");
			
		}

	}

