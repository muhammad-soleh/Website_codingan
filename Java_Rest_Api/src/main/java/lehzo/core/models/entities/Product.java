package lehzo.core.models.entities;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "tbl_product") // membuat table tbl_product jika belum ada tablenya
public class Product implements Serializable {

    @Id //primary key
    @GeneratedValue(strategy= GenerationType.IDENTITY) //auto increment
    private Long id;

    @Column(name="nama_produk", length=100)
    private String nama;


    @Column(name="deskripsi_produk", length=500)
    private String deskripsi;

    private double harga;

    public Product() {
    }

    public Product(Long id, String nama, String deskripsi, double harga) {
        this.id = id;
        this.nama = nama;
        this.deskripsi = deskripsi;
        this.harga = harga;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }
}
