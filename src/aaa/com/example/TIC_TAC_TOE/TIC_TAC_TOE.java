package aaa.com.example.TIC_TAC_TOE;

import java.util.Scanner;

public class TIC_TAC_TOE {

    public static char x[][] = {{' ',' ',' '},{' ',' ',' '},{' ',' ',' '}};
    public static int y=0,z=0,k=0,s,l=1,m=1,c=0;
    public static print_scan Print_scan=new print_scan();
    public static cpu_first Cpu_first=new cpu_first();
    public static check_end Check_end=new check_end();

    public static void main(String[] args) {
        Print_scan.out("Select one option:\n1)One player\n2)Two players\n");
        s = Print_scan.scan();
        while(m == 1)
        {
            c++;
            while(l==1)
            {
                Print_scan.out("Player one try\n");
                k = Print_scan.scan();
                y = (k-1)/3;
                z = (k-1)%3;
                if(x[y][z]!='x' && x[y][z]!='o')
                    l=0;
            }
            x[y][z] = 'x';
            Print_scan.print();
            l=1;
            Check_end.check();
            while(l==1)
            {
                if(s==2)
                {
                    Print_scan.out("Player two try\n");
                    k = Print_scan.scan();
                    y = (k - 1) / 3;
                    z = (k - 1) % 3;
                    if (x[y][z] != 'x' && x[y][z] != 'o')
                        l = 0;
                }
                else if(s==1)
                {
                    Cpu_first.cpu_try();
                    l=0;
                }
            }
            x[y][z] = 'o';
            Print_scan.print();
            l=1;
            Check_end.check();
        }
        return ;
    }
}
