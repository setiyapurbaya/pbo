/*
 Kelompok 8 Sistem Informasi Pengolahan Data-TA
 - Imam Rahman 1301140150
 - Ika Setyasari 1301144020
 - Laela Citra Asih 1301144300
 */
package pbo;
public class Dosen extends Orang{
    private KelompokTA[] topikTA = new KelompokTA[10];
    private String kode;
    private int nTopik;
    private String status;
    
    public Dosen(String nama, String kode, String kk){
        super(nama,kk);
        this.kode = kode;
    }
    public void CreateKelompokTA(String topik) {
        if (nTopik< topikTA.length){
            topikTA[nTopik] = new KelompokTA(topik);
            nTopik++;
        }
    }
    
    public String getKode() {
        return kode;
    }

    //public Mahasiswa getMahasiswa(long nim){}
    public void setKode(String kode) {
        this.kode = kode;
    }
    public KelompokTA GetKelompok(int n){
        return topikTA[n];
    }
    public KelompokTA GetKelompok(String topik){
        for(int i=0;i<nTopik;i++){
            if(topikTA[i].getTopik().equals(topik)){
                return topikTA[i];
            }
        }
        return null;
    }
    public void deleteKelompok(int n){
        for(int i=n;i<nTopik-1;i++){
                topikTA[i]=topikTA[i+1];
            }
        nTopik--;
    }
    public void setStatus(String s){
        status = s;
    }
    public String getStatus(){
        return status;
    }
}	