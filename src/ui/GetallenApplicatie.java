package ui;

import javax.swing.JOptionPane;

/**
 *
 * @author luca
 */
public class GetallenApplicatie {
    public static void main(String args[]){
        String getalS;
        int getal,volgendGetal,teller=0;
        String resultaat="";
        
        getalS=JOptionPane.showInputDialog("geef een geheel getal in afsluiten met -2000");
            getal=Integer.parseInt(getalS);
        
        while(getal!=-2000){
            getalS=JOptionPane.showInputDialog("geef een geheel getal in afsluiten met -2000");
            volgendGetal=Integer.parseInt(getalS);
            if(volgendGetal<getal){
                teller++;
                getal=volgendGetal;
                resultaat=String.format("het aantal keer is %d", teller);
            }
        }
        JOptionPane.showMessageDialog(null,resultaat);
    }
}
