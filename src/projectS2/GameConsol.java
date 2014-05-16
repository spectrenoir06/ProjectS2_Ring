package projectS2;

import java.util.InputMismatchException;
import java.util.Scanner;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("b5d42879-bdfb-452c-acd5-681f01be34fa")
public class GameConsol {
    @objid ("6de8e41a-6d57-47e7-a1e5-8c1d22bfe816")
     Scanner scan = new Scanner(System.in);
    private Game game = new Game();

    @objid ("a8f88020-6c78-4846-9945-7e9c4f6f8c9a")
    public Perso createPerso() {
        while(true){
            try{
                Perso p = null;
                
                System.out.println( "Classe : \n"
                                +    " 1 - Guerrier\n"
                                +    " 2 - Mage\n"
                                +    " 3 - Athlete\n"
                                +    "cmd : ");
                int classe = scan.nextInt();
                if (classe < 1 || classe > 3){
                    throw new Exception("Classe inconnue");
                }
                
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
                case 1:
                     p = new Guerrier(name, force, dexterite, intelligence, concentration);
                     break;
                case 2:
                     p = new Mage(name, force, dexterite, intelligence, concentration);
                     break;
                case 3:
                     p = new Athlete(name, force, dexterite, intelligence, concentration);
                     break;
                }
                p.addCapacite(this.createCapacite());
                p.addCapacite(this.createCapacite());
                return p;
            }catch(PersoException e){
                System.out.println(e.getMessage());
            }catch(InputMismatchException e){
                System.out.println("erreur entre un integer");
                scan.next();
            }catch(Exception e){
                e.printStackTrace();
            }
        }
    }

    @objid ("4c3ee0b0-9f06-4cf8-91e3-f61722997873")
    public Capacite createCapacite() {
        int impact, para, facilite, protection, efficacite;
        while(true){
            try{
                Capacite c = null;
                
                System.out.println("Capacite :\n");
                System.out.println("0     :    Epee");
                System.out.println("1     :    Bouclier");
                System.out.println("2     :    Remede");
                System.out.println("3     :    SortilegeOffensif");
                System.out.println("4     :    SortilegeDefensif");
                System.out.println("5     :    SortilegeGuerisseur");
                
                int type = scan.nextInt();
                
                if (type < 0 || type > 5 ){
                    throw new Exception("Capacite inconnue");
                }
                              
                while (true){
                    try {
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
                        }
                        return c;
                    }
                    catch(InputMismatchException e){
                        scan.next();
                        System.out.println("erreur entre un integer");
                    }
                }
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
        System.out.println("| 3 - Add Capacite perso1     |");
        System.out.println("| 4 - Voir perso1             |");
        System.out.println("| 5 - Voir perso2             |");
        System.out.println("| 6 - 1 Use capa1 sur 2       |");
        System.out.println("| 7 - 1 use capa1 sur lui     |");
        System.out.println("+-----------------------------+");
        System.out.println("cmd : ");
        try{
            switch (scan.nextInt()) {
            case 1:
                game.setPerso1(createPerso());
                System.out.println(game.getPerso1());
                break;
            case 2:
            	game.setPerso2(createPerso());
                System.out.println(game.getPerso2());
                break;
            case 3:
                Capacite c = this.createCapacite();
                this.game.getPerso1().addCapacite(c);
                break;
            case 4:
            	System.out.println(this.game.getPerso1());
                break;
            case 5:
            	System.out.println(this.game.getPerso2());
                break;
            case 6:
            	game.getPerso1().use(0, game.getPerso2());
                break;
            case 7:
            	game.getPerso1().use(0, game.getPerso1());
                break;
            default:
                break;
            }
        }catch(InputMismatchException e){
            System.out.println("erreur entre un integer");
            scan.next();
        }
    }
    public static void main(String[] args){
        
        GameConsol consol = new GameConsol();
        
        while(true){
        	consol.consol();
        	consol.game.getPerso1();
        }
    }
}
