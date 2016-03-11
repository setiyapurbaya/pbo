/*
 Kelompok 8 Sistem Informasi Pengolahan Data-TA
 - Imam Rahman 1301140150
 - Ika Setyasari 1301144020
 - Laela Citra Asih 1301144300
 */
package pbo;
public class KelompokTA {
    private String topik;
    private Mahasiswa[] anggota;
    private int nAnggota;
    
    public void addAnggota(Mahasiswa m){
        if(nAnggota<length(anggota)){
            anggota[nAnggota]= m;
            nAnggota++;
    }}
    
    public Mahasiswa getAnggota(int n){
        return anggota[n];
    }
    
    public Mahasiswa getAnggota(long NIM){
        for(int i=0;i<=length(anggota);i++){
            if(NIM=anggota[i].getNIM){
                i=length(anggota)+1;
                return anggota[i];
            }
        }
    }
    
    public void removeAnggota(long NIM){
        for(int i=0;i<=length(anggota);i++){
            if(NIM=anggota[i].getNIM){
                i=length(anggota)+1;
                anggota[i]=null;
            }
        }
    }
    
}
