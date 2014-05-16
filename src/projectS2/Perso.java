package projectS2;

import java.util.ArrayList;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("ac53558f-117c-400a-bc74-89cf87b33b5b")
public abstract class Perso {
    @objid ("24b23d41-fa2a-4577-95c5-6b14447dc56f")
    private String nom;

    @objid ("e9bc87e8-3964-4c51-af31-8a54b234405f")
    private int force;

    @objid ("c46e697e-981d-47bb-bef7-a5b823dcb125")
    private int dexterite;

    @objid ("7217c81d-f752-4434-9753-a41cc1de04d5")
    private int intelligence;

    @objid ("2afadb1e-a597-48e0-be3a-06530a7c7bea")
    private int concentration;

    @objid ("9d751fe2-8c51-4dfe-8851-8d31f299d1df")
    private int vitalite;

    @objid ("329392df-1f31-4fb1-b763-abc628eccebd")
    private int experience;

    @objid ("5172a4ed-002a-4132-8afd-0e675031d82d")
    private ArrayList<Capacite> capacite = new ArrayList<Capacite> ();

    @objid ("21dc0070-6226-4621-b73e-79bfd1170da0")
    public Perso(String nom, int force, int dexterite, int intelligence, int concentration) throws PersoException {
        this.experience = 1;
        if ( (force+dexterite+intelligence+concentration) <= 100 + this.experience)
        {
            //System.out.println("perso conforme");
            this.nom = nom;
            this.force = force;
            this.dexterite = dexterite;
            this.intelligence = intelligence;
            this.concentration = concentration;
        }
        else
        {
            throw new PersoException("Erreur perso non conforme\nforce + dextérité + intelligence + concentration <= 101");
        }
    }

    @objid ("b9d243b6-d86a-4548-a13e-9c3776551ec0")
    int getForce() {
        return this.force;
    }

    @objid ("8bbd5952-ad83-499d-84cb-6db04e42006b")
    void setForce(int value) {
        this.force = value;
    }

    @objid ("fa9f686a-a77a-4685-971b-a0bbc506866d")
    String getNom() {
        return this.nom;
    }

    @objid ("b05143d9-9b86-47be-b2f8-1fba04132f16")
    void setNom(String value) {
        this.nom = value;
    }

    @objid ("ed15745f-d430-4f54-bb77-73b56cf9bfd4")
    int getDexterite() {
        return this.dexterite;
    }

    @objid ("23d42c35-848c-42fe-84ea-f7d8f9f86fa2")
    void setDexterite(int value) {
        this.dexterite = value;
    }

    @objid ("73c8dede-8a0e-413d-b4ca-90708d3ec4e2")
    int getIntelligence() {
        return this.intelligence;
    }

    @objid ("a0c4619f-2cf2-47bd-8579-93d33b40dd1f")
    void setIntelligence(int value) {
        this.intelligence = value;
    }

    @objid ("7df0e712-4c9c-44dd-9f93-0be49ae52631")
    int getConcentration() {
        return this.concentration;
    }

    @objid ("d29b0e74-6ef2-4e91-a7f1-cfc21e9f71ec")
    void setConcentration(int value) {
        this.concentration = value;
    }

    @objid ("2a7053f9-b4dd-434b-be43-8045dbe35f18")
    int getExperience() {
        return this.experience;
    }

    @objid ("39225c44-d9f5-4e1d-b83d-acc645405f1f")
    void setExperience(int value) {
        this.experience = value;
    }

    @objid ("d11148a2-6303-42ca-880a-9a129193a0ca")
    int getVitalite() {
        return this.vitalite;
    }

    @objid ("c93f2607-f887-4548-b69d-19e43927a41d")
    void setVitalite(int value) {
        this.vitalite = value;
    }

    @objid ("216756fb-4d26-490c-b7fe-c73511aed9f0")
    public String getInfo(String type) {
        return ("Je suis "+ this.nom +" un " + type  +" de niveau " + this.getExperience() 
            + "\n -force            : "     + this.force
            + "\n -dexterite        : "     + this.dexterite
            + "\n -intelligence     : "     + this.intelligence
            + "\n -concentration    : "     + this.concentration + "\n" + this.getInfoCapacite()  );
    }

    @objid ("8e0f7c13-46de-467f-871c-3fb5189493b2")
    void addCapacite(Capacite c) {
        c.setPerso(this);
        this.capacite.add(c);
    }

    @objid ("22c575ec-3038-441c-bf3d-b5357eb4530f")
    void addCapacite(Capacite c, int i) {
        c.setPerso(this);
        this.capacite.add(i,c);
    }

    @objid ("9c2eb4b2-57ff-4e1e-941a-fa5f6c738f22")
    void use(int i, Perso cible) {
        this.capacite.get(i).use(cible);
    }

    @objid ("051d6133-974d-4856-80b4-b6adef097425")
    public void initVitalite() {
        this.vitalite = 200 - (this.force+this.dexterite+this.intelligence+this.concentration) + this.experience * 3;
    }

    @objid ("9b329fa5-5bfe-4ad1-99ed-8f36088c041d")
    public String getInfoCapacite() {
        String s = "Capacite de " + this.nom + ":\n\n";
        int i = 0;
        for (Capacite c : this.capacite){
            s = s + i + " : " + c.toString() + "\n";
            i++;
        }
        return s;
    }
    public String getSerialise(String type) {
    	String s = (type + ";" + this.nom + ";" + this.experience + ";" + this.force + ";" + this.dexterite + ";" + this.intelligence + ";" + this.concentration + "\n");
        for (Capacite c : this.capacite){
            s = s  + c.serialise() + "\n";
        }
    	return s;
    }
    
    public abstract String serialise();
}
