/*
 Kelompok 8 Sistem Informasi Pengolahan Data-TA
 - Imam Rahman 1301140150
 - Ika Setyasari 1301144020
 - Laela Citra Asih 1301144300
 */
package pbo;
public class DOSEN {
    private String nama;
    private int nip;
    private int StatusPembimbing;
    private KelompokTA topikTA[] t=new KelompokTA[10]; //Array KelompokTA terenkapsulasi private berukuran 10//
    private int jumlahKelompokTA=0;
   
    //method CreateKelompokTA, menginstansiasi kelompokTA baru sesuai input//
    public void CreateKelompokTA(String topik) {
        if(jumlahKelompokTA<10) {
            t[jumlahKelompokTA]=new KelompokTA(topik);
            jumlahKelompokTA++;
        }
    }
   
    //constructor untuk mengeset Status Pembimbing//
    public DOSEN(int statusPembimbing) {
        setStatusPembimbing(StatusPembimbing);
    }
    
    //method setStatusPembimbing & getStatusPembimbing//
    public void setStatusPembimbing(int StatusPembimbing) {
        this.StatusPembimbing = StatusPembimbing;
    }
    
    public int getStatusPembimbing() {
        return StatusPembimbing;
    } 
       
}
