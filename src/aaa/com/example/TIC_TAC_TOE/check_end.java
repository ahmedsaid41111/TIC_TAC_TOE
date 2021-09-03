package aaa.com.example.TIC_TAC_TOE;


import static aaa.com.example.TIC_TAC_TOE.TIC_TAC_TOE.Print_scan;
import static aaa.com.example.TIC_TAC_TOE.TIC_TAC_TOE.c;
import static aaa.com.example.TIC_TAC_TOE.TIC_TAC_TOE.x;
import static aaa.com.example.TIC_TAC_TOE.TIC_TAC_TOE.m;


public class check_end {
    public static void check()
    {
        for(int i=0;i<3;i++)
        {
            if(x[0][i]=='x'&&x[1][i]=='x'&&x[2][i]=='x' || x[i][0]=='x'&&x[i][1]=='x'&&x[i][2]=='x')
            {
                m=0;
                Print_scan.out("Player one win\n");
                System.exit(0);
            }
            else if(x[0][i]=='o'&&x[1][i]=='o'&&x[2][i]=='o' || x[i][0]=='o'&&x[i][1]=='o'&&x[i][2]=='o')
            {
                m=0;
                Print_scan.out("Player two win\n");
                System.exit(0);
            }
        }
        if(x[0][0]=='x'&&x[1][1]=='x'&&x[2][2]=='x')
        {
            m=0;
            Print_scan.out("Player one win\n");
            System.exit(0);
        }
        else if(x[0][2]=='x'&&x[1][1]=='x'&&x[2][0]=='x')
        {
            m=0;
            Print_scan.out("Player one win\n");
            System.exit(0);
        }
        else if(x[0][0]=='o'&&x[1][1]=='o'&&x[2][2]=='o')
        {
            m=0;
            Print_scan.out("Player two win\n");
        }
        else if(x[0][2]=='o'&&x[1][1]=='o'&&x[2][0]=='o')
        {
            m=0;
            Print_scan.out("Player two win\n");
        }
        else if(c==5)
        {
            Print_scan.out("No one win\n");
            System.exit(0);
        }
    }
}
