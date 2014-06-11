package projectS2;

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("a4c19624-f7ea-45da-85aa-f2804d1f2815")
public class SortilegeDefensif extends Capacite {
    @objid ("af08333b-5920-48d9-bab2-781daa3e6567")
    private int facilite;

    @objid ("bda72f18-d6e7-434c-84b6-1af355e824b8")
    private int efficacite;

    @objid ("a8aabd56-30af-40b9-8221-7ab0df08c6f4")
    public SortilegeDefensif(int facilite, int efficacite) throws CapaciteException {
        super();
        if (( facilite>=20) && (efficacite>=20)&& ((facilite+efficacite)==100)) { 
            this.facilite = facilite;
            this.efficacite = efficacite;
        }else {
        	throw new CapaciteException("Sortilege Defensif non conforme.");
        }
    }

    @objid ("1edda29e-1b1d-4943-b5b7-9e662e69d058")
    @Override
    public void use(Perso p) {
        System.out.println(this.getPerso().getNom() + " utilise s.defensif ");
        System.out.println("[ reussite = " + this.getReussite() + " ; efficacite : " + this.getAttaquePuissance() + " ]" );
    }

    @objid ("d8f9fa38-3f82-41a1-bd6f-7aa5422a48e5")
    public int getFacilite() {
        return facilite;
    }

    @objid ("9f28903f-f1e5-4912-9bbc-8247d9a9eeb1")
    public void setFacilite(int facilite) {
        this.facilite = facilite;
    }

    @objid ("92f818ce-9469-40ac-9653-75ba39719ab4")
    public int getEfficacite() {
        return efficacite;
    }

    @objid ("942ab08b-014b-48da-9648-23ef3d3fcb3c")
    public void setEfficacite(int efficacite) {
        this.efficacite = efficacite;
    }

    @objid ("f3e2996f-2e72-46ef-b932-fa92a4273a73")
    @Override
    public String toString() {
        String s = "S.Defensif";
        s = s + "\t| facilite\t=\t" + this.facilite;
        s = s + "\t| efficacite\t=\t" + this.efficacite + "\t|";
        return s;
    }

    @objid ("45495756-4e9c-41d0-ac1e-56fbdcca4a5a")
    @Override
    public double getReussite() {
        return ( (this.getPerso().getConcentration() * this.facilite) / 10000.0 );
    }

    @objid ("8fbc910c-a7d3-49aa-87d5-a89ed5599321")
    @Override
    public double getParadePuissance() {
        // TODO Auto-generated method stub
        return 0;
    }

    @objid ("9fb2529d-05cb-4413-999b-f05efe8af5e7")
    @Override
    public double getAttaquePuissance() {
        return ( (this.getPerso().getIntelligence() * this.efficacite) / 100.0);
    }

    @objid ("f4e38418-99f1-4dd0-91be-ca9e909c136f")
    @Override
    public String serialise() {
        return ("SD;" + this.facilite + ";" + this.efficacite);
    }

}
