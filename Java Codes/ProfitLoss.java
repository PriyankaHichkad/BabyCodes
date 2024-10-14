//Q- WAP to accept the CP and SP of an item and display its profit or loss. Also, check and display the profit or loss percentage.
import java.io.*;
public class ProfitLoss {
    public static void main(String[] args) throws IOException {
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader (read);
        System.out.println("Enter CP and SP respectively");
        int cp= Integer.parseInt(in.readLine());
        int sp= Integer.parseInt(in.readLine());
        double l;
        if ((sp-cp)>0)
        {
            System.out.println("Profit=Rs."+ (sp-cp));
            double p=(sp-cp)/cp*100;
            System.out.println("Profit Percentage=" +p);
        }
       else
        {
            System.out.println("Loss=Rs." + (cp-sp));
            l=(cp-sp)/cp*100;
            System.out.println("Loss percentage=" +l);
        }
    }
}
