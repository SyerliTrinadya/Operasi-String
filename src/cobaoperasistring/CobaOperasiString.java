
package cobaoperasistring;

public class CobaOperasiString {
    public static void main(String[] args) {
        String identitas = "Syerli Trinadya / X RPL 2 / 33";
        System.out.println("Identitas : " + identitas);
        
        String x = "Operasi";
        System.out.println("isi variable x : "+ x);
        System.out.println("\""+ x + "\" panjang karakter = "+x.length());
        
        System.out.println("x adalah kosong : " + x.isEmpty());
        
        String y = "";
        System.out.println("isi variable y : " + y);
        System.out.println("y adalah kosong : " + y.isEmpty());
        
    }
    
}
