/* Ad: Cuma
Soyad: Doğan
Öğrenci no: 250542003
*/



public class Exercise4_2 {

    // Main her zaman başlangıç noktasıdır (1)
    public static void main(String[] args) {                
        zippo("rattle", 13);                                 
    }                                                       

    public static void baffle(String blimp) {               
        System.out.println(blimp);                          
        zippo("ping", -5);                                  
    }                                                       

   
    public static void zippo(String quince, int flag) {     
        if (flag < 0) {                                      
            System.out.println(quince + " zoop");         
        } else {                                            
            System.out.println("ik");                       
            baffle(quince);                                 
            System.out.println("boo-wa-ha-ha");              
        }
    }                                                       
}
