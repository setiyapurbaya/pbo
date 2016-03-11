/*
 Kelompok 8 Sistem Informasi Pengolahan Data-TA
 - Imam Rahman 1301140150
 - Ika Setyasari 1301144020
 - Laela Citra Asih 1301144300
 */
package pbo;
public class KelompokTA {
    private String topik;
    private int nAnggota;
    private Mahasiswa[] anggota;
    
    public void addanggotakelompok(Mahasiswa a){
        if(nAnggota<length(anggota)){
            anggota[nAnggota]=a;
            nAnggota++;
    }}
    
    public Mahasiswa getanggotabyindex(int n){
        return anggota[n];
    }
    
    public Mahasiswa getanggotabyNIM(long NIM){
        for(int i=0;i<=length(anggota);i++){
            if(NIM=anggota[i].getNIM){
                i=length(anggota)+1;
                return anggota[i];
            }
        }
    }
    
    public void removeanggota(long NIM){
        for(int i=0;i<=length(anggota);i++){
            if(NIM=anggota[i].getNIM){
                i=length(anggota)+1;
                anggota[i]=null;
            }
        }
    }
    
}
