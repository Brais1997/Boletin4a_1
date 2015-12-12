/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin.pkg4_1;

import javax.swing.JOptionPane;

/**
 *
 * @author Brais
 */
public class incremento {
    int num=Integer.parseInt(JOptionPane.showInputDialog("Inserte un numero"));
    int cantidade;
    int incremento;
    public void calculos(){
 
    
  if(num<=500){
       cantidade =(int) (num  + num*0.5);
       incremento = cantidade-num;
  }
  else if(num <= 1000){
        cantidade= (int) (num +num*0.07);
         incremento = cantidade-num;
        
    }
  else if(num <=5000){
       cantidade=(int) (num+num*0.15);
        incremento = cantidade-num;
  }
  else{
      cantidade=(int) (num-num*0.03);
         incremento = cantidade-num;
  }
  System.out.println("Cantidade : " + num);
    System.out.println("Incremento : " + incremento);
      System.out.println("Cantidade final : " + cantidade);
    }
}
