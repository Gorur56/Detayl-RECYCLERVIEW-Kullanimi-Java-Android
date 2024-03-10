package com.firstapp.detaylirecyclerviewkullanimi;

public class Filmler {
    private int film_id;
    private String film_ad;
    private String film_resim_ad;
    private double film_fiyat;

    public Filmler() {
    }

    public Filmler(int film_id, String film_ad, String film_resim_ad, double film_fiyat) {
        this.film_id = film_id;
        this.film_ad = film_ad;
        this.film_resim_ad = film_resim_ad;
        this.film_fiyat = film_fiyat;
    }

    public int getFilm_id() {
        return film_id;
    }

    public void setFilm_id(int film_id) {
        this.film_id = film_id;
    }

    public String getFilm_ad() {
        return film_ad;
    }

    public void setFilm_ad(String film_ad) {
        this.film_ad = film_ad;
    }

    public String getFilm_resim_ad() {
        return film_resim_ad;
    }

    public void setFilm_resim_ad(String film_resim_ad) {
        this.film_resim_ad = film_resim_ad;
    }

    public double getFilm_fiyat() {
        return film_fiyat;
    }

    public void setFilm_fiyat(double film_fiyat) {
        this.film_fiyat = film_fiyat;
    }
}
