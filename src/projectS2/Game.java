package projectS2;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;
import java.util.StringTokenizer;

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("3c87cb07-e5b2-4706-ac36-e5a91104d80f")
public abstract class Game {
    @objid ("6bb69aa6-f3c6-43d8-a09d-3b5746f3dce7")
    private Perso perso1;

    @objid ("4336642f-3f98-416d-b1eb-dd71724cd0b9")
    private Perso perso2;

    @objid ("b66a9408-4028-4110-a68e-f822f0e32bd0")
    public Perso getPerso1() {
        return perso1;
    }

    @objid ("c6ee85ac-f034-4ae7-9e70-8fbea0d2c25c")
    public void setPerso1(Perso perso1) {
        this.perso1 = perso1;
    }

    @objid ("57d1e580-dcc5-4f1b-94b4-36782cafbe8d")
    public Perso getPerso2() {
        return perso2;
    }

    @objid ("a42a2edd-1499-43f3-a0f4-de026a1ddf00")
    public void setPerso2(Perso perso2) {
        this.perso2 = perso2;
    }

    @objid ("4b18d94b-4d14-4dfb-979d-1358e4f6824f")
    public void duel() {
        if (this.perso1 != null && this.perso2 != null){
            perso1.resetVitalite();
            perso2.resetVitalite();
            System.out.println("Duel:\t" + perso1.getNom() + "\tVS\t" + perso2.getNom());
            System.out.println("\t" + perso1.getVitalite() + "\t\t" + perso2.getVitalite());
            
            if (perso1.getExperience() > perso2.getExperience()){
            	System.out.println(perso1.getNom() + " Commence");
            }else if(perso1.getExperience() < perso2.getExperience()){
            	System.out.println(perso2.getNom() + " Commence");
            }else{
            	if (Math.random()>0.5){
            		System.out.println(perso1.getNom() + " Commence");
            	}else{
            		System.out.println(perso2.getNom() + " Commence");
            	}
            }
        }else{
        	System.out.println("perso1 ou perso2 n'existe pas");
        }
    }

    @objid ("3ce95ca5-e3c0-43db-a049-4615dc66d80d")
    public final boolean save(Perso perso, String file) {
        System.out.println("write start");
        
        PrintStream p = null;
        FileOutputStream out;
        
        try {
            out = new FileOutputStream(file);
            p = new PrintStream( out );
            p.print(perso.serialise());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return false;
        }finally{
            p.close();
        }
        System.out.println("write done in "+ file);
        return true;
    }

    @objid ("2fdcda71-2443-41fe-a5bc-ef40f3088af0")
    public final Perso load(String file) throws NumberFormatException, CapaciteException {
        InputStream in ;
        BufferedInputStream bin ;
        Scanner sc ;
        Perso p = null;
        
        try {
            in = new FileInputStream(file);
            bin = new BufferedInputStream(in);
            sc = new Scanner(bin);
        
            String s = sc.nextLine();
            StringTokenizer st = new StringTokenizer(s,";");
            
            String classe   = st.nextToken();
            String name     = st.nextToken();
            int exp         = new Integer(st.nextToken());
            int force       = new Integer(st.nextToken());
            int dexterite   = new Integer(st.nextToken());
            int inteligence = new Integer(st.nextToken());
            int conc        = new Integer(st.nextToken());
                
            switch (classe) {
                case "guerrier":
                     p = new Guerrier(name,exp,force,dexterite,inteligence,conc);
                     break;
                case "mage":
                     p = new Mage(name, exp,force,dexterite,inteligence,conc);
                     break;
                case "athlete":
                     p = new Athlete(name,exp,force,dexterite,inteligence,conc);
                     break;
                }
            
            while(sc.hasNextLine()){
                s = sc.nextLine();
                st = new StringTokenizer(s,";");
                Capacite c = null;
                switch (st.nextToken()) {
                case "eppe":
                     c = new Epee(new Integer(st.nextToken()), new Integer(st.nextToken()), new Integer(st.nextToken()));
                     break;
                case "bouclier":
                    c = new Bouclier(new Integer(st.nextToken()), new Integer(st.nextToken()));
                    break;
                case "remede":
                     c = new Remede(new Integer(st.nextToken()), new Integer(st.nextToken()));
                     break;
                case "SO":
                    c = new SortilegeOffensif(new Integer(st.nextToken()), new Integer(st.nextToken()));
                    break;
                case "SD":
                    c = new SortilegeDefensif(new Integer(st.nextToken()), new Integer(st.nextToken()));
                    break;
                case "SG":
                    c = new SortilegeGuerisseur(new Integer(st.nextToken()), new Integer(st.nextToken()));
                    break;
                }
                p.addCapacite(c);
            }
            sc.close();
            bin.close();
            in.close();
        
        }
        catch(IOException e){
            System.out.println(e);
        }catch(PersoException pe){
            System.out.println("Perso non conforme");
        }
        
        finally 
        {
            sc    = null;
            bin    = null;
            in    = null;
        }
        return p;
    }

    @objid ("16639ec1-98ac-4116-98f9-7b1565f8acb0")
    public boolean tour(Perso p1, Perso p2) {
        // true if use capa false if loose
                System.out.println("Action de "+p1.getNom());
                if (this.useCapacity(p1, p2)){
                     System.out.println("use capa");
                     return true;
                }else{
                    System.out.println("abandon");
                    return false;
                }
    }

    @objid ("761b1134-4b16-4714-a4a4-92a4e97a3415")
    public abstract boolean useCapacity(Perso p1, Perso p2);

    @objid ("f99e38b5-4b0c-498a-b35a-81ff093d92a8")
    public abstract Perso createPerso();

    @objid ("c12aaa67-20b5-4355-adc0-2a54939e873a")
    public abstract Capacite createCapacite();

}
