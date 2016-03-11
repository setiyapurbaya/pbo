/*
 Kelompok 8 Sistem Informasi Pengolahan Data-TA
 - Imam Rahman 1301140150
 - Ika Setyasari 1301144020
 - Laela Citra Asih 1301144300
 */
package pbo;
public class TugasAkhir {
    private Dosen[] pembimbing = new Dosen[2];
    private String judul;
    
    public TugasAkhir(String judul){
        this.judul = judul;
    }
    public void setJudul(String judul){
        this.judul = judul;
    }
    public String getJudul(){
        return judul;
    } 
    public void setPembimbing(Dosen d,int i){
        this.pembimbing[i] = d;
    }
    public Dosen getPembimbing(int i){
        return pembimbing[i];
    }
    public Dosen getPembimbing(String kode){
        for(int i=0;i<2;i++){
            if (pembimbing[i].getKode().equals(kode)){
                return pembimbing[i];
            }
        }
        return null;
    }
}