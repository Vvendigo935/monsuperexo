package org.example.Exoannuaire;

public class Entreprise {

    private String nom;
    private long siret;
    private String adresse;
    private String site;

    public Entreprise(String nom, long siret, String adresse, String site) {
        this.nom = nom;
        this.siret = siret;
        this.adresse = adresse;
        this.site = site;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public long getSiret() {
        return siret;
    }

    public void setSiret(long siret) {
        this.siret = siret;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site;
    }

    @Override
    public String toString() {
        return "Entreprise{" +
                "nom='" + nom + '\'' +
                ", siret=" + siret +
                ", adresse='" + adresse + '\'' +
                ", site='" + site + '\'' +
                '}';
    }
}
