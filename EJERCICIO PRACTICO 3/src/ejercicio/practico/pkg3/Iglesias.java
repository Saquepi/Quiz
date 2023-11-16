/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio.practico.pkg3;

/**
 *
 * @author LABORATORIO 04
 */
public class Iglesias {
    //
    private String churchName;
    private String pastorName;
    private Double diezmoArr[];
    private String feligArr[];
    private double totalDiezmo = 0;
    private double tempReturn;

    public Iglesias(String churchName, String pastorName, int diezmoArr) {
        this.churchName = churchName;
        this.pastorName = pastorName;
        this.diezmoArr = new Double[diezmoArr];
        this.feligArr = new String[diezmoArr];
        
    }
    
    public double getTotal(){
        return totalDiezmo;
    }
    
    public int getLenght(){
        
        return feligArr.length;
    }
    
    public void setFeliArr(int pos, String info){
        this.feligArr[pos] = info;
        
    }
    
    public String getFeliArr(int pos){
        String temp = feligArr[pos];
        return temp;
    }
    
    public void setDiezArr(int pos, Double info){
        this.diezmoArr[pos] = info;
        
    }
    
     public double getDiezmoArr(int pos){
        double temp = diezmoArr[pos];
        return temp;
    }
    
    public void totalDiezmo(){
        for (int i = 0; i < diezmoArr.length; i++) {
            totalDiezmo = totalDiezmo + diezmoArr[i];
        }
        
    }
    
    public double getMuniCut(){
        
        tempReturn = (totalDiezmo*0.09);
        return tempReturn;
    }
    
    public double getFoodCut(){
        
        tempReturn = (totalDiezmo*0.21);
        return tempReturn;
    }
    
    public double getPastorCut(){
        
        tempReturn = (totalDiezmo*0.70);
        return tempReturn;
    }

    public String getChurchName() {
        return churchName;
    }

    public void setChurchName(String churchName) {
        this.churchName = churchName;
    }

    public String getPastorName() {
        return pastorName;
    }

    public void setPastorName(String pastorName) {
        this.pastorName = pastorName;
    }


    
    
    
}
