/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Arhan
 */
public class divisibleTo35 {
    public static void main(String[] args) {
        
        for (int i = 1; i <= 100; i++) {
            // 3'e ve 5'e bölünebilen sayılar
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(i + " hem 3'e hem de 5'e bölünebilir");
            }
            
            else if (i % 3 == 0) {
                System.out.println(i + " 3'e bölünebilir");
            }
            
            else if (i % 5 == 0) {
                System.out.println(i + " 5'e bölünebilir");
            }
        }
    }
}
