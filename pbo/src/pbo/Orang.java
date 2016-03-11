
/**
 *
 * @author Windows
 */
package pbo;

public abstract class Orang {
    private String nama;
    private String kk;

    public Orang(String nama, String kk) {
        this.nama = nama;
        this.kk = kk;
    }
    
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getKk() {
        return kk;
    }

    public void setKk(String kk) {
        this.kk = kk;
    }
      
}
