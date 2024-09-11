import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String Str = new String("Emma");

        String CorrectName = "Emma";
        String Guess; 
        int GuessCounter = 0;
        String clue1 = "Naisen nimi";
        String clue2 = "Neljä kirjainta";
        String clue3 = "Kaksi kirjaimista ovat samoja";
        String clue4 = "Samat kirjaimet ovat 'm'";
        String clue5 = "Ensimmäinen kirjain on 'E'";
        String clue6 = "Viimeinen kirjain on 'a'";

        System.out.println("Tervetuloa arvauspeliin!");
        System.out.println("Yritä arvata oikea nimi!");
        System.out.println("    Onnea matkaan!");
        System.out.println("Vihje: " + clue1);

        


        while (true){
            System.out.println("Jos haluat lopettaa kirjoita 'loppu'");
            Guess = scanner.nextLine();
        if (Guess.equalsIgnoreCase("loppu")){
            System.out.println("Kiitos pelistä :)");
            break;      
        }
        GuessCounter++;

        if(Guess.equalsIgnoreCase(CorrectName)){
            System.out.println("Arvasit oikein! Oikea nimi on: " + CorrectName);
                break;          
        }
        else{
            System.out.println("Arvauksesi " + Guess + " on väärin, yritä uudestaan.");
            }
            if(GuessCounter == 1){
                System.out.println("Vihje: " + clue2);
            }
            else if(GuessCounter == 2){
                System.out.println("Vihje: " + clue3);
            }
            else if(GuessCounter == 3){
                System.out.println("Vihje: " + clue4);
            }
            else if(GuessCounter == 4){
                System.out.println("Vihje: " + clue5);
            }
            else if(GuessCounter == 5){
                System.out.println("Vihje: " + clue6);
            }
            
    
            
     }
        
        System.out.println("Arvasit " + GuessCounter + " kertaa.");
        scanner.close();

     }

 }