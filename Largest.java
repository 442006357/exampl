import java.util.Scanner;
public class Largest.java {
public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float Y66;
        float Y77;
        float Y88;
        System.out.println("Enter Number1");
        Y77 = scan.nextFloat();
        System.out.println("Enter Number2");
        Y66 = scan.nextInt();
        System.out.println("Enter Number3");
        Y88 = scan.nextFloat();

        if(Y66>Y77 && Y66>Y88 ){
        System.out.println("The largest score is" + Y66);
        }
        else if(Y77>Y66 && Y77>Y88 ){
        System.out.println("The largest score is  " + Y77);
        }
        else if(Y88>Y66 && Y88>Y77 ){
        System.out.println("The largest score is"+Y88);
        }
        
        }
        }
//YAZN
