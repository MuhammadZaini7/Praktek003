package praktek003;

public class HandphoneAksi {
    public static void main(String[] args) {
        Handphone h= new Handphone();

        h.setMerk("Samsung");
        h.setWarna("Gold");
        h.setHarga(3000000);
         
        h.cetakInfo();
        
        System.out.print("Merknya \t : ");
        System.out.println(h.getMerk());
        System.out.print("Warnanya \t : ");
        System.out.println(h.getWarna());
        System.out.print("Harganya \t : ");
        System.out.println(h.getHarga());
    }
    
    
}
