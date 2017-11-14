/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo12_10116515_latihanuts5;

/**
 *
 * @author JARVIS PC
 */
public class PBO12_10116515_LATIHANUTS5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        JajarGenjang Jg = new JajarGenjang(50, 60, 70, 80, 100, 120);
        Jg.hitungKeliling();
        Jg.hitungLuas();
        
        
        Segitiga Sg = new Segitiga(50, 60, 70, 100, 120);
        Sg.hitungKeliling();
        Sg.hitungLuas();        
    

    }
    
}
