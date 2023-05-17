package praktikumjava;

import Model.Mahasiswa;
import Model.MahasiswaTransfer;

public class PraktikumJava {

    public static void main(String[] args) {
       Mahasiswa mahasiswa = new Mahasiswa ();
       mahasiswa.viewData();
       
       mahasiswa.setId(1);
       mahasiswa.setNPM("2110010577");
       mahasiswa.setNama("Muhammad Azmi");
       mahasiswa.setIPK(3.9);
       
       mahasiswa.viewData();
       
       Mahasiswa ml = new Mahasiswa(
       2,
               "2110010577",
               "Muhammad Azmi",
               3.9);
       ml.viewData();
       
    MahasiswaTransfer mt = new MahasiswaTransfer();
    mt.setId(3);
    mt.setNPM("17990003");
    mt.setNama("Utsman ibn Affan");
    mt.setIPK(3.9);
    mt.viewData();
       
    }
    
    
   
}
