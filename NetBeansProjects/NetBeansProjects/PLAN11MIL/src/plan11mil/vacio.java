/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package plan11mil;

/**
 *
 * @author Windows
 */
public class vacio {
    public static int a = 5;
    public static void main(String[] args) {
        String [] arreglo = new String[5];
        for (int h=100;h<105;h++){
            arreglo[105-h]= vender(105,190,h);
            System.out.println("arreglo["+(105-h)+"]="+arreglo[105-h]);
        }
    }
   
    	//public static float vender(int a, int b){
       // return (a+b)/2.0f;}
	//public static int vender(int a, float b){
       // return a+(int)b;}
	public static String vender(int a, int b, int c){
        return String.valueOf((char)a)+String.valueOf((char)b)+String.valueOf(c);}
	//public static float vender(){
       /* return vender(9,7);}
	public static char vender (char a, char b){
        return (char)((int)a+(int)b);}*/

}

    
