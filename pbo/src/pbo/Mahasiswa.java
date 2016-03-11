/*
 Kelompok 8 Sistem Informasi Pengolahan Data-TA
 - Imam Rahman 1301140150
 - Ika Setyasari 1301144020
 - Laela Citra Asih 1301144300
 */
package pbo;
public class Mahasiswa extends Orang {
    private TugasAkhir tugasAkhir;
    private String status;
    private long NIM;
    
    public Mahasiswa(String nama,long nim, String kk){
        super(nama,kk);
        this.NIM = nim;
    }
    public void setNIM(long nim){
        this.NIM = nim;
    }
    public long getNIM(){
        return NIM;
    }
    public void createTA(String judul){
        tugasAkhir = new TugasAkhir(judul);
    }
    public TugasAkhir getTugasAkhir(){
        return tugasAkhir;
    }
    public void createStatus(String status){
        this.status = "Belum Lulus";
    }
    public void setStatus(String status){
        this.status = status;
    }
    public String getStatus(){
        return status;
    }
}
