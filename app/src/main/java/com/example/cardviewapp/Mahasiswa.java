package com.example.cardviewapp;

public class Mahasiswa {
    private String nim;
    private String nama;
    private int photo;

    public Mahasiswa (String nim, String nama, int photo) {
        this.nim = nim;
        this.nama = nama;
        this.photo = photo;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getPhoto() {
        return photo;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }
}
