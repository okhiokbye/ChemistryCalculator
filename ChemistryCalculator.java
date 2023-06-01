import java.util.Scanner;
import static java.lang.System.*;

public class ChemistryCalculator {
    public static void main(String[] args){
        /*  TODO: 
        
            - STORE RESULTS OF THE CALCULATOR's FUNCTIONs
            IN A GLOBAL VARIABLE SO CAN CONVERT VERY EASY

            activity series: determine if metal will replace another
            
            all gas laws: use menu to get modes
            energy absorption calcuation(given stuff)
   
            
           
        */
        // below is some example code
        /*Scanner kb = new Scanner(System.in);
        char response;
        String leter = "why skip";
        while(1 ==1)
        {
            System.out.println("pls enter word");
            String let = "e";
            let = kb.nextLine();

            System.out.println(let);
            System.out.println("wanna enter more words Y/N");
            response = kb.next().charAt(0);
            kb.nextLine(); // prevents the annoying line skip due to /n character still in input streambrine
         }
    */
        // variables
        int menu1 = 0;
        // chemWorker init
        ChemWorker calc = new ChemWorker();
        // scanner init
        Scanner kb = new Scanner(System.in);
        // main menu
        do{

        
        out.println("Chemistry Calculator: Select function:");
        out.println("1-Molar Mass Calculator");
        out.println("2-Handy Unit Conversions");
        out.println("0-Exit Calculator");

        //input for menu
        
        menu1 = kb.nextInt();
        kb.nextLine(); // to flush /n character
        switch(menu1){
            case 1: 
                calc.MolarMass(menu1);
                break;
            case 2: 
                calc.Conversion(menu1);
            case 0:
                break;
            default:
                out.println("number please");
                break;
        }
        System.out.print("\033[H\033[2J");  
        System.out.flush();  

    }
    while(menu1 != 0);
         
    }    
}