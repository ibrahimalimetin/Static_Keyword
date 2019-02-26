# Static_Keyword

Tüm methodlar objeye özgü oluyordu. Obje referansından erişebiliyorduk. Static anahtar kelimesi ile yazar isek objeye bağlı değil 
sınıfa bağlı oluyor ve obje tanımlaması yapmamıza gerek kalmamaktadır. Sınıf ismi üzerinden erişim sağlanmaktadır. Static 
tanımladığımız tüm özellikler ve methodlar program çalıştığında bellekte direk olarak oluşurlar. Sınıfa ait oldukları için 
yalnızca bir defa oluşurlar.

public class Main {
    public static void main(String[] args) {
       
        Futbolcu futbolcu1 = new Futbolcu("Ronaldo");
        Futbolcu futbolcu2 = new Futbolcu("Alex"); // iki tane obje oluşturduk. 
        
        futbolcu1.topOyna();
        //System.out.println("Futbolcu sayısı : " + Futbolcu.futbolcuSayisi); 
        // Sınıf üzerinden erişim (Sınıf içinde tanımlama pulic olduğunda)
        System.out.println("Futbolcu sayısı : " + futbolcu1.getFutbolcuSayisi()); 
        // Obje üzerinden erişim
        //System.out.println("Futbolcu sayısı : " + futbolcu.getFutbolcuSayisi()); 
        // Methodumuz static olmadığı için sınıf üzerinden erişilemiyor.
    
       /* durdur(); */
        // Main methodumuz static bir method, durdur() methosumuz static değil! Main.java mız bir class 'tır. bir oble oluşturmadan
        //durdur() methodunu çağıramayız. Bunuda static yaparak proje çalıştığında oluşmasını sağlamalıyız...
    
    }
    
   /* public void durdur(){
        System.out.println("Maç durduruluyor.....");
    }*/
    
}
