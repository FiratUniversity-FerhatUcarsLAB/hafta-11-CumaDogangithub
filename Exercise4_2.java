/* Ad: Cuma
Soyad: Doğan
Öğrenci no: 250542003
*/



public class Exercise4_2 { 

   
    public static void main(String[] args) {            
        zippo("rattle", 13); //1                                 
    }                                                       

    public static void baffle(String blimp) {               
        System.out.println(blimp);    //6                      
        zippo("ping", -5);    //7                              
    }                                                       

   
    public static void zippo(String quince, int flag) {     
        if (flag < 0) { //3,8                                     
            System.out.println(quince + " zoop"); //8        
        } else {                                          
            System.out.println("ik");     // 4                    
            baffle(quince);           //5                      
            System.out.println("boo-wa-ha-ha");   //9           
        }
    }                                                       
}
