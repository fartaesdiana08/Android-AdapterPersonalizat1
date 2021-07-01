package com.example.adapterpersonalizat1;

import java.io.Serializable;

public class Material implements Serializable {
    private String material;
    private int pret;
    private int nrMateriale;
    private String valoare;
    private int luna;

    public Material(String material, int pret, int nrMateriale, String valoare, int luna) {
        this.material = material;
        this.pret = pret;
        this.nrMateriale = nrMateriale;
        this.valoare = valoare;
        this.luna = luna;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public int getPret() {
        return pret;
    }

    public void setPret(int pret) {
        this.pret = pret;
    }

    public int getNrMateriale() {
        return nrMateriale;
    }

    public void setNrMateriale(int nrMateriale) {
        this.nrMateriale = nrMateriale;
    }

    public String getValoare() {
        return valoare;
    }

    public void setValoare(String valoare) {
        this.valoare = valoare;
    }

    public int getLuna() {
        return luna;
    }

    public void setLuna(int luna) {
        this.luna = luna;
    }

    @Override
    public String toString() {
        return "Material{" +
                "material='" + material + '\'' +
                ", pret=" + pret +
                ", nrMateriale=" + nrMateriale +
                ", valoare='" + valoare + '\'' +
                ", luna=" + luna +
                '}';
    }
}