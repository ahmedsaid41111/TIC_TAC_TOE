package aaa.com.example.TIC_TAC_TOE;

import java.util.Scanner;
import static aaa.com.example.TIC_TAC_TOE.TIC_TAC_TOE.x;

public class print_scan {
    public static Scanner myObj = new Scanner(System.in);

    public static int scan()
    {
        return myObj.nextInt();
    }

    public static void out(String s)
    {
        System.out.print(s);
    }

    public static void print()
    {

        out("\n             |   |\n");
        out("           "+x[0][0]+" | "+x[0][1]+" | "+x[0][2]+"\n");
        out("             |   |\n");
        out("          --- --- ---\n");
        out("             |   |\n");
        out("           "+x[1][0]+" | "+x[1][1]+" | "+x[1][2]+"\n");
        out("             |   |\n");
        out("          --- --- ---\n");
        out("           "+x[2][0]+" | "+x[2][1]+" | "+x[2][2]+"\n");
        out("             |   |\n");

    }
}
