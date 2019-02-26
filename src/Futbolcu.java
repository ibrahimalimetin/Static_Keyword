public class Futbolcu {
   
    private String isim;
    
    private static int futbolcuSayisi = 0 ; //Static tanımlama yaptığımız için sınıfa özgü oldu. hem sınıf ismi hemde obje üzerinden erişebiliriz. 

    public Futbolcu(String isim) {
        this.isim = isim;
        futbolcuSayisi++; // Constractor içerisinde her obje oluşturulduğunda 1 artacak. 
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }
    
    public void topOyna(){
        System.out.println(isim + " futbol maçına başlıyor....");
    }
    
    public int getFutbolcuSayisi(){
        return futbolcuSayisi;
    }
}
