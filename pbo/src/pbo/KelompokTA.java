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
    
    public KelompokTA(String topik){
        this.topik = topik;
    }
    public void addAnggota(Mahasiswa m){
        if(nAnggota<anggota.length){
            anggota[nAnggota]= m;
            nAnggota++;
        }
    }
   public String getTopik(){
       return topik;
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
    
    public void removeAnggota(long NIM){
        int j = -1;
        for(int i=0;i<nAnggota;i++){
            if(NIM == anggota[i].getNIM()){
                j = i;
                anggota[i] = null;
            }
        }
        if (j!= -1){
            for(int i=j;i<nAnggota-1;i++){
                anggota[i]=anggota[i+1];
            }
            nAnggota--;
        }
    }
    
}
