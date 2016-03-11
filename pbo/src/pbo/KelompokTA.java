/*
 Kelompok 8 Sistem Informasi Pengolahan Data-TA
 - Imam Rahman 1301140150
 - Ika Setyasari 1301144020
 - Laela Citra Asih 1301144300
 */
package pbo;
public class KelompokTA {
    private String topik;
    private Mahasiswa[] anggota = new Mahasiswa[2];
    private int nAnggota;
    
    public void addAnggota(Mahasiswa m){
        if(nAnggota<anggota.length){
            anggota[nAnggota]= m;
            nAnggota++;
        }
    }
    
    public Mahasiswa getAnggota(int n){
        return anggota[n];
    }
    
    public Mahasiswa getAnggota(long NIM){
        for(int i=0;i<anggota.length;i++){
            if(NIM == anggota[i].getNIM()){
                return anggota[i];
            }
        }
        return null;
    }
    /*
    public void removeAnggota(long NIM){
        for(int i=0;i<anggota.length;i++){
            if(NIM == anggota[i].getNIM()){
                
            }
        }
    }
    */
}
