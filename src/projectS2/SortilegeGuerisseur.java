package projectS2;

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("b9a641c0-2695-481f-b92e-debb8df7c13a")
public class SortilegeGuerisseur extends Capacite {
    @objid ("07ceab59-a008-4753-b56b-c0a0c90ee742")
    private int facilite;

    @objid ("f4206970-5518-4091-9fd7-84f935698ee0")
    private int efficacite;

    @objid ("27a1ddeb-dfc5-4b6b-872d-194587056bcc")
    public SortilegeGuerisseur(int facilite, int efficacite) throws CapaciteException {
        super();
        if (( facilite>=20) && (efficacite>=20)&& ((facilite+efficacite)==100)) { 
            this.facilite = facilite;
            this.efficacite = efficacite;
        }else {
            throw new CapaciteException("Sortilege Guerisseur non conforme.");
        }
    }

    @objid ("930cb00d-d9a9-48f0-b562-380e5da4129d")
    @Override
    public void use(Perso p) {
        super.use(p);
        if (this.getReussite() >= Math.random()){
            if ((getPerso().getVitalite() + getPuissance()) < getPerso().getMaxVitalite()){
                getPerso().setVitalite(getPerso().getVitalite() + getPuissance());
            }else{
                getPerso().setVitalite(getPerso().getMaxVitalite());
            }
            System.out.println("soin reussi vitalite de " + this.getPerso().getNom() + " = " + this.getPerso().getVitalite());
        }else{
            System.out.println("Capacite rate !");
        }
    }

    @objid ("7e698428-7dbc-465e-b9b0-779d33c13a26")
    public int getFacilite() {
        return facilite;
    }

    @objid ("1d6b168c-dab0-4577-8412-c977e67ceb67")
    public void setFacilite(int facilite) {
        this.facilite = facilite;
    }

    @objid ("65c6711d-feff-400b-82b7-581e46e8ce68")
    public int getEfficacite() {
        return efficacite;
    }

    @objid ("33aec797-3e94-477b-9b7d-b2665b91d6f4")
    public void setEfficacite(int efficacite) {
        this.efficacite = efficacite;
    }

    @objid ("f45552d4-3bad-46f1-aa3e-afbf63fd9bf2")
    @Override
    public String toString() {
        String s = "S.Gueriss.";
        s = s + "\t| facilite\t=\t" + this.facilite;
        s = s + "\t| efficacite\t=\t" + this.efficacite + "\t|";
        return s;
    }

    @objid ("2f78e301-005e-4b37-8d27-368e2eb73d01")
    @Override
    public double getReussite() {
        return ( (this.getPerso().getConcentration() * this.facilite) / 1000.0 );
    }

    @objid ("2d706a2b-4ac0-476e-9e30-1f2d60e40946")
    @Override
    public String serialise() {
        return ("SG;" + this.facilite + ";" + this.efficacite);
    }

    @objid ("3d2d474d-fe3f-4967-abce-eb7c0a957914")
    @Override
    public double getPuissance() {
        return ( (this.getPerso().getIntelligence() * this.efficacite) / 100.0);
    }

    @objid ("05ce7271-e3b9-451a-9b9f-9ccc9499a84b")
    @Override
    public String getCapaciteInfo() {
        return ("S.guerr.    :    reussite = " + this.getReussite() + "    ; efficacite : " + this.getPuissance() );
    }

}
