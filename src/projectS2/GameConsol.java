package projectS2;

import java.util.InputMismatchException;
import java.util.Scanner;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("b5d42879-bdfb-452c-acd5-681f01be34fa")
public class GameConsol extends Game {
    @objid ("5b624830-accc-4f23-a3db-0454bc4f643b")
     Scanner scan = new Scanner(System.in);

    @objid ("a8f88020-6c78-4846-9945-7e9c4f6f8c9a")
    public Perso createPerso() {
        while(true){
            try{
                Perso p = null;
                
                System.out.println("Classe : ");
                String classe = scan.next();
                
                System.out.println("Name :");
                String name = scan.next();
                
                System.out.println("force : ");
                int force = scan.nextInt();
                
                System.out.println("dexterite : ");
                int dexterite = scan.nextInt();
                
                System.out.println("intelligence : ");
                int intelligence = scan.nextInt();
                
                System.out.println("concentration : ");
                int concentration = scan.nextInt();
                
                switch (classe) {
                case "guerrier":
                     p = new Guerrier(name, force, dexterite, intelligence, concentration);
                     break;
                case "mage":
                     p = new Mage(name, force, dexterite, intelligence, concentration);
                     break;
                case "athlete":
                     p = new Athlete(name, force, dexterite, intelligence, concentration);
                     break;
                default :
                    throw new Exception("Classe inconnue");
                }
                return p;
            }catch(PersoException e){
                System.out.println(e.getMessage());
            }catch(InputMismatchException e){
                System.out.println("erreur entre un integer");
            }catch(Exception e){
                System.out.println(e.getMessage());
            }
        }
    }

    public Capacite createCapacite(){
    	int impact, para, facilite, protection, efficacite;
    	while(true){
            try{
                Capacite c = null;
                
                System.out.println("Capacite :\n");
                System.out.println("0 	:	Epee");
                System.out.println("1 	:	Bouclier");
                System.out.println("2 	:	Remede");
                System.out.println("3 	:	SortilegeOffensif");
                System.out.println("4 	:	SortilegeDefensif");
                System.out.println("5 	:	SortilegeGuerisseur");
                
                int type = scan.nextInt();
                              
                switch (type) {
                case 0: // Guerrier
                    System.out.println("Impact:");
                    impact = scan.nextInt();
                    System.out.println("Parade:");
                    para = scan.nextInt();
                    System.out.println("Maniabilite:");
                    int maniabilite = scan.nextInt();
                    c = new Epee(impact, para, maniabilite); 
                    break;
                case 1: // Bouclier
                    System.out.println("Maniabilite:");
                    maniabilite = scan.nextInt();
                    System.out.println("Protection:");
                    protection = scan.nextInt();
                    c = new Bouclier(maniabilite, protection);                     
                    break;
                case 2: // Remede
                    System.out.println("Facilite:");
                    facilite = scan.nextInt();
                    System.out.println("Efficacite:");
                    efficacite = scan.nextInt();
                    c = new Remede(facilite, efficacite);
                    break;
                case 3: // SortilegeOffensif
                    System.out.println("Facilite:");
                    facilite = scan.nextInt();
                    System.out.println("Efficacite:");
                    efficacite = scan.nextInt();
                    c = new SortilegeOffensif(facilite, efficacite);
                    break;
                case 4: // SortilegeDefensif
                    System.out.println("Facilite:");
                    facilite = scan.nextInt();
                    System.out.println("Efficacite:");
                    efficacite = scan.nextInt();
                    c = new SortilegeDefensif(facilite, efficacite);
                    break;
                case 5: // SortilegeGuerisseur
                    System.out.println("Facilite:");
                    facilite = scan.nextInt();
                    System.out.println("Efficacite:");
                    efficacite = scan.nextInt();
                    c = new SortilegeGuerisseur(facilite, efficacite);
                    break;
                default :
                    throw new Exception("Capacite inconnue");
                }
                return c;
            }catch(InputMismatchException e){
                System.out.println("erreur entre un integer");
                scan.next();
            }catch(Exception e){
                System.out.println(e.getMessage());
            }
    	}
    	
    }
    
    @objid ("d16f1106-157e-4b44-b3d4-dd0b591f3177")
    public void consol() {
        System.out.println("+-----------------------------+");
        System.out.println("| 1 - Cree perso1             |");
        System.out.println("| 2 - Cree perso2             |");
        System.out.println("| 3 - Cree Capacite           |");
        //System.out.println("|                             |");
        //System.out.println("|                             |");
        //System.out.println("|                             |");
        //System.out.println("|                             |");
        System.out.println("+-----------------------------+");
        System.out.println("cmd : ");
        try{
            switch (scan.nextInt()) {
            case 1:
                super.setPerso1(createPerso());
                System.out.println(this.getPerso1());
                break;
            case 2:
                super.setPerso2(createPerso());
                System.out.println(this.getPerso2());
                break;
            case 3:
            	Capacite c = this.createCapacite();
            	System.out.println(c);
                break;
            default:
                break;
            }
        }catch(InputMismatchException e){
            System.out.println("erreur entre un integer");
            scan.next();
        }
    }

}
