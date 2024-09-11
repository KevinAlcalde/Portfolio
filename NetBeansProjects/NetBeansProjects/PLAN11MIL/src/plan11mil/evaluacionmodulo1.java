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
public class evaluacionmodulo1 {
    public static void main(String[] args)
        throws InterruptedException{
        int matriz[][]=new int[5][5];
         int contador=0;
         int cont1=0,cont2=0;
         int h,a;
         int anotaciones[]=new int[25];
         for(int i=0;i<5;i++){
             for(int j=0;j<5;j++){
                 matriz [i][j]=(int)(Math.random()*100+1);
                               
             }
         }
         mostrar(matriz);    
         for(h=0;h<25;h++){
          anotaciones[h]=cantados();
          cont2++;
             System.out.println("Numero"+h+"corresponde al "+ anotaciones[h]);
             Thread.sleep(1000);
           for(int i=0;i<5;i++){
             for(int j=0;j<5;j++){
              if(anotaciones[h]==matriz[i][j]){
                  contador++;
                  System.out.println("YUPII!");}
               if(contador>=5){
                  System.out.println("premio!");
               for(h=0;h<25;h++){
                   System.out.println(anotaciones[h]+" - ");
               }
               
               System.exit(0);
                } }}}
           if(contador < 5){
               System.out.println("Vuelva a probar suerte!");
           }
           System.out.println("la funcion cantados se ejecuta"+cont2+"veces");
          
           System.out.println("El procedimiento modtrar se ejecuta"+cont1+"veces");
    }
    public static int cantados( ){

    return (int)(Math.random()*100+1);
}
     public static void  mostrar(int matriz[][] ){
       int cont1=0;
        cont1++;
       for(int i=0;i<5;i++){
             for(int j=0;j<5;j++){
            if(j==4)System.out.println(matriz[i][j]);
                 else System.out.print(matriz[i][j]+"");  
             }   
     }
     }
}
