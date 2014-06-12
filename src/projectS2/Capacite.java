package projectS2;

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("9eef0ccb-3836-4f77-a84f-aaceed0e472c")
public abstract class Capacite {
    @objid ("e8139eac-f5a1-4143-9238-6ecce703f125")
    private Perso perso;

    @objid ("b5090cee-2d8d-41a5-837f-bf5808e73577")
    public Capacite() {
    }

    @objid ("c719d115-d7dd-4e7c-ad46-3b7e24636d82")
    public abstract String getCapaciteInfo();

    @objid ("9511e4d2-a1d9-45c2-91ff-f4f0840f42f8")
    public Perso getPerso() {
        return perso;
    }

    @objid ("320bb0b9-0ee2-4780-815b-bb449dec1d08")
    public abstract double getPuissance();

    @objid ("34ed52e3-dbc3-4b18-bfaf-23be1d7973ea")
    public abstract double getReussite();

    @objid ("55ba066b-1dc3-4dab-bfaf-fded553131e9")
    public abstract String serialise();

    @objid ("3a8d896a-0451-4e01-87b8-948d344e42dc")
    public void setPerso(Perso perso) {
        this.perso = perso;
    }

    @objid ("2274b715-70cf-436f-ad8f-bc0bc27b432a")
    public abstract String toString();

    @objid ("e853b988-9789-4b12-8a38-b37fecaa7dd5")
    public void use(Perso p) {
        System.out.println(this.getPerso().getNom() + " utilise " + getCapaciteInfo());
    }

}
