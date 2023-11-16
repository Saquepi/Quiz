/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio.practico.pkg3;

import javax.swing.JOptionPane;

/**
 *
 * @author LABORATORIO 04
 */
public class Logic {
    //
    
    String pastorNameLogic;
    String IglesiaNameTemp;
    int feligressesTemp;
    String tempQQ;
    String tempQ;
    double tempD;
    
    
    int cycle = 0;
    Iglesias iglesiaArr[] = new Iglesias[9999999];    
    
    
    public void info(){
        pastorNameLogic = JOptionPane.showInputDialog("Inroduzca el nombre del pastor");
        
        
        while(true){
            
            IglesiaNameTemp = JOptionPane.showInputDialog("Introduzca el nombre de la iglesia");
            feligressesTemp = Integer.parseInt(JOptionPane.showInputDialog("Introduzca la cantidad de feligreses"));
            
            
            iglesiaArr[cycle] = new Iglesias(IglesiaNameTemp , pastorNameLogic , feligressesTemp ); 
            
            for (int i = 0; i < feligressesTemp; i++) {
                tempQ = "Nombre:\n"+JOptionPane.showInputDialog("Introduzca el nombre del feligres")+"\nCedula:"+JOptionPane.showInputDialog("Introduzca la cédula del Feligres");
                iglesiaArr[cycle].setFeliArr(i, tempQ);
                tempD = Double.parseDouble(JOptionPane.showInputDialog("Introduzca el total del diezmo"));
                
            }
            iglesiaArr[cycle].totalDiezmo();
            tempQ  = JOptionPane.showInputDialog("Desea añadir otra iglesia? (Y/N)");
            if("Y".equals(tempQ) || "y".equals(tempQ)){
                break;
            }
        }  
    }    
    
    
    public void infoOut(){
        for (int i = 0; i < cycle; i++) {
            JOptionPane.showMessageDialog(null, iglesiaArr[i].getChurchName());
            JOptionPane.showMessageDialog(null,"Total ganancias: " + iglesiaArr[i].getTotal());
            JOptionPane.showMessageDialog(null,"Impuesto Municipalidad: " + iglesiaArr[i].getMuniCut());
            JOptionPane.showMessageDialog(null,"Impuesto comedor: "  + iglesiaArr[i].getFoodCut());
            JOptionPane.showMessageDialog(null,"Total del pastor: " + iglesiaArr[i].getPastorCut());
            tempQ ="";
            tempQQ="";
            
        }
        
    }
}
