import java.util.Scanner;

public class tanrin1{
    public static void main(String[] args) {
        // int numbs
        int m,i,bz,b1,d,j,c,k,b2,s,l,b3,x,b4,p,b5,v,o,n;


        //reader
        Scanner reader=new Scanner(System.in);
        System.out.println("inter your number");
        String numstr=reader.nextLine();

        //str to int
        int numberint = Integer.parseInt(numstr);


        //printing M
        m=numberint/1000;
        bz=numberint%1000;
        for(i=1;i<=m;i++){
            System.out.print("M");
        }
        //printing D
        d=bz/500;
        b1=bz%500;
        for(j=1;j<=d;j++){
            System.out.print("D");
        }
        //printing C
        c=b1/100;
        b2=b1%100;
        for(k=1;k<=c;k++){
            System.out.print("C");
        }
        //printing L
        l=b2/50;
        b3=b2%50;
        for(s=1;s<=l;s++){
            System.out.print("L");
        }
        //printing X
        x=b3/10;
        b4=b3%10;
        for(p=1;p<=x;p++){
            System.out.print("X");
        }
        //printing V
        v=b4/5;
        b5=b4%5;
        for(o=1;o<=v;o++){
            System.out.print("V");
        }
        //printing I
        for(n=1;n<=b5;n++){
            System.out.print("I");
        }
        System.out.println(x);
    }
}