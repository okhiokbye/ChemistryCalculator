import static java.lang.System.*;

import java.math.BigInteger;
import java.util.Scanner;

public class ChemWorker {
    public void MolarMass(int menu1){
        String input = "";
        Scanner kb = new Scanner(System.in);
        String[] names = {"H","He","Li","Be" ,"B" ,"C" ,"N" ,"O" ,"F" ,"Ne","Na","Mg","Al","Si" ,"P" ,"S","Cl","Ar" ,"K","Ca","Sc","Ti","V","Cr","Mn" ,"Fe","Co","Ni","Cu" ,"Zn","Ga","Ge","As","Se","Br","Kr","Rb","Sr" ,"Y","Zr","Nb","Mo","Tc","Ru","Rh","Pd","Ag","Cd","In" ,"Sn","Sb","Te" ,"I","Xe","Cs","Ba","La","Ce","Pr","Nd","Pm","Sm","Eu","Gd","Tb","Dy","Ho","Er","Tm","Yb","Lu","Hf","Ta" ,"W","Re","Os","Ir","Pt" ,"Au","Hg","Tl" ,"Pb","Bi","Po","At","Rn","Fr","Ra","Ac","Th","Pa" ,"U","Np","Pu","Am","Cm","Bk","Cf","Es","Fm","Md","No","Lr","Rf","Db","Sg","Bh","Hs","Mt","Ds","Rg","Cn","Nh","Fl","Mc","Lv","Ts","Og"};
        float[] mass = {1.00797f,4.00260f,6.941f,9.01218f,10.81f,12.011f,14.0067f,15.9994f,18.998403f,20.179f,22.98977f,24.305f,26.98154f,28.0855f,30.97376f,32.06f,35.453f,39.0983f,39.948f,40.08f,44.9559f,47.90f,50.9415f,51.996f,54.9380f,55.847f,58.70f,58.9332f,63.546f,65.38f,69.72f,72.59f,74.9216f,78.96f,79.904f,83.80f,85.4678f,87.62f,88.9059f,91.22f,92.9064f,95.94f,98f,101.07f,102.9055f,106.4f,107.868f,112.41f,114.82f,118.69f,121.75f,126.9045f,127.60f,131.30f,132.9054f,137.33f,138.9055f,140.12f,140.9077f,144.24f,145f,150.4f,151.96f,157.25f,158.9254f,162.50f,164.9304f,167.26f,168.9342f,173.04f,174.967f,178.49f,180.9479f,183.85f,186.207f,190.2f,192.22f,195.09f,196.9665f,200.59f,204.37f,207.2f,208.9804f,209f,210f,222f,223f,226.0254f,227.0278f,231.0359f,232.0381f,237.0482f,238.029f,242f,243f,247f,247f,250f,251f,252f,255f,256f,257f,258f,260f,261f,262f,262f,263f,269f,272f,277f};
        float count = 0.0f;
        String inputted = "";
        int num = 0;
        // TODO: 
        // code in subscripts
        out.println("type elemental symbol to add its molar mass to current count. ");
        out.println("type clear to clear current count");
        out.println("type back to back");
        out.println(mass.length);
        out.println(names.length);
        do{
            input = kb.nextLine();
            inputted += input;
            for(int i = 0; i<= names.length-1; i++ ){
                if(input.equals(names[i])){
                    out.println("how many atoms (1 for just one)");
                        num = kb.nextInt();
                    count += (mass[i])*num;
                    if(num>1)
                        inputted += num;
                    break;
                }
                else if(input.equals("clear")){
                    count = 0;
                    inputted = "";
                    input = "";
                    break;
                }
                else if(input.equals("back")){
                    return;
                }
            }
            System.out.print("\033[H\033[2J");  
            System.out.flush();  
        
            out.println(inputted);
            out.println("Molar Mass: " + count);
            
        }
        while(!input.equals("back")); //
    }
    /**
     * @param menu1
     */
    public void Conversion(int menu1){
        Scanner kb = new Scanner(System.in);
        BigInteger avnum = new BigInteger("602252000000000000000000");
        double prevAns = 0;
        boolean back = false;
        double input, molmass, answer;
        String inp = ""; // only for particles, spaghetti code :D
        do{

        
        out.println("Previous Conversion: " + prevAns);
        out.println("Conversions: ");
        out.println("");
        out.println("1: g -> mol");
        out.println("2: L -> mol");
        out.println("3: particles -> mol");
        out.println("4: mol -> g");
        out.println("5: mol -> L");
        out.println("6: mol -> particles");
        out.println("7: BACK");

        int a = kb.nextInt();

        switch(a){
            case 1: 
                out.println("enter grams:");
                input = kb.nextDouble();
                out.println("enter molar mass");
                molmass = kb.nextDouble();
                answer = input/molmass;
                prevAns = answer;
                out.println(answer);
                break;
            case 2: 
                out.println("enter liters");
                    input = kb.nextDouble();
                    answer = input/22.4;
                    prevAns = answer;
                out.println(answer);
                break;
            case 3:
                out.println("enter particles");
                    inp = kb.nextLine();
                    BigInteger in = new BigInteger(inp);
                    BigInteger ans = in.divide(avnum);
                    String tempAns = ans.toString();
                    prevAns = Double.parseDouble(tempAns);
                out.println(ans.toString());
                break;
            case 4: 
                out.println("enter mols");
                    input = kb.nextDouble();
                out.println("enter molar mass");
                    molmass = kb.nextDouble();
                    answer = input * molmass;
                    prevAns = answer;
                out.println(answer);
                break;
            case 5:
                out.println("enter liters");
                    input = kb.nextDouble();
                    answer = input *22.4;
                    prevAns = answer;
                out.println(answer);
                break;
            case 6:
                out.println("enter mols");
                    inp = kb.nextLine();
                    BigInteger mols = new BigInteger(inp);
                    BigInteger res = mols.multiply(avnum);
                    String temp = res.toString();
                    prevAns = Double.parseDouble(temp);
                out.println(res.toString());
            case 7: 
                back = true;
                break;
        }
        }
        while(back != true);
            return;
           

    } 
}
