package MorseCodeTranslator;



import java.util.Scanner;

public class Method {

    public String[] getMorseArray() {
        return new String[]{".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--",
                "-.", "---", ".--.", "--.-", ".-.", "...", "-", "...-", ".--", "-..-", "-.--", "--..",
                "-----", ".----", "..---", "....-", ".....", "-....", "----.", ".-.-.-", "--..--", "..--..",
                " ----.", ".-.-.-", "--..--", "..--.."};
    }

    public char[] getEnglishArray() {
        return new char[]{'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K',
                'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T',
                'U', 'V', 'W', 'X', 'Y', 'Z', '0', '1', '2', '3', '4', '5',
                '6', '7', '8', '9', '.', ',', '?'};
    }

    public void getInfo(String input) {

        String[] Morse = getMorseArray();
        char[] English = getEnglishArray();

        boolean keepgoing = true;
        Scanner scan = new Scanner(System.in);
        while (keepgoing) {

            System.out.println(" ");
            System.out.println("1- Convert English to Morsecode ");
            System.out.println("2- Convert Morse to English ");
            System.out.println("Or write (0) to exit the program");

            int choice = scan.nextInt();
            input = scan.nextLine();



            if (choice < 0 ||choice > 2  ){
                throw new IllegalArgumentException("You can only choose 0 | 1 | or 2");
            }



            if (choice == 1) {
                System.out.println("Write an English word or number");
                input  = scan.nextLine();
                System.out.println(input);
                input = input.toUpperCase();
                if (input.contains("Ä") || input.contains("Å") || input.contains("Ö")) {
                    throw new IllegalArgumentException("No Swedish characters allowed");
                }
                char[] chars = input.toCharArray();

                for (int i = 0; i < chars.length; i++){

                    if (chars[i] == ' '){
                        System.out.println(" ");

                    }
                    else {
                        for (int a = 0; a < English.length; a++)
                        {
                            if (chars[i] == English[a]){
                                System.out.print(Morse[a] + " ");
                            }

                        }
                    }
                }


            } else if (choice == 2) {
                System.out.println("Write Morse code");
                input = scan.nextLine();
                String[] IfSpace = input.split(" ");
                for (int i = 0; i < IfSpace.length; i++){

                    if (IfSpace[i].equals("/")){
                        System.out.println(" ");
                    }

                    else {
                        for (int a = 0; a < Morse.length; a++)
                        {
                            if (IfSpace[i].equals(Morse[a]))
                            {
                                System.out.print(English[a]);

                            }

                        }
                    }
                }

            }
            else if (choice == 0){
                keepgoing = false;
                break;
            }
        }
        }




    public String convertEnglishToMorse(char englishChar) {
        char[] English = getEnglishArray();
        String[] Morse = getMorseArray();

        for (int i = 0; i < English.length; i++) {
            if (English[i] == englishChar) {
                return Morse[i];
            }
        }

        return "";


    } public char convertMorseToEnglish(String morseCode) {
        String[] Morse = getMorseArray();
        char[] English = getEnglishArray();

        for (int i = 0; i < Morse.length; i++) {
            if (Morse[i].equals(morseCode)) {
                return English[i];
            }
        }

        return ' ';
    }


}



