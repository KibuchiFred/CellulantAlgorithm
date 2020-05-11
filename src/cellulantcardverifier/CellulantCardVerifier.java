/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cellulantcardverifier;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author fred
 */
public class CellulantCardVerifier {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a card Number: ");
        String cardNumber = scanner.nextLine().replaceAll("[^0-9]","");
        
       int firstSets = Integer.parseInt(cardNumber.substring(0, 4));
       int secondSets  =Integer.parseInt(cardNumber.substring(5, 9)) ;
       int thirdsSets = Integer.parseInt(cardNumber.substring(10, 14));
       int fourthSets = Integer.parseInt(cardNumber.substring(15, 19));
       
      int[] numbers = {firstSets,secondSets,thirdsSets,fourthSets};
      String[] arrayNumber = new String[numbers.length];
      
      for(int i=0;i<numbers.length;i++){
          
          int finalOct = Integer.parseInt(Integer.toOctalString(numbers[i]));
          int result = CheckSum(finalOct);
          
          int finalResult =  appendChecksum(numbers[i], result);
        
          String verifiedCardNumber = Integer.toString(finalResult);
          
          arrayNumber[i] =verifiedCardNumber;
          
    }
      
      String finalVerifiedNumber = Arrays.toString(arrayNumber).replaceAll("[^0-9]","");

    System.out.println(ValidateCard(cardNumber, finalVerifiedNumber));  
    }
    
    static int CheckSum(int n){
        
        if(n==0)  return 0;
        
        return (n % 9 ==0) ? 9 : (n%9);  
      }
    
     static int appendChecksum(int number, int cSum){
                String checkSumNo = Integer.toString(cSum);
                String appendedNumber = Integer.toString(number).concat(checkSumNo);
                int finalSet = Integer.parseInt(appendedNumber);
                
                return finalSet;
    }
    
    static boolean ValidateCard(String inputNumber, String correctNumber){
        return inputNumber.equals(correctNumber);
    }
}
