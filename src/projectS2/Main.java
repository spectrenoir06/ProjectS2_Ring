package projectS2;

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("5fc32c10-8d27-41fc-8681-349453223632")
public class Main {
    @objid ("c1635a43-d42f-4224-8ae1-643760026bd3")
    public static void main(String[] args) throws Exception {
        Perso test1 = new Guerrier("Jebediah",30,20,10,10);
        //Perso test2 = new Mage("Bill",15,15,30,30);
        //Perso test3 = new Athlete("Bob",20,20,20,20);
        
        System.out.println(test1);
        //System.out.println(test2);
        //System.out.println(test3);
        
        Capacite cap1 = new Epee(10,10,10);
        Capacite cap2 = new Bouclier(10,20);
        Capacite cap3 = new Remede(50,50);
        Capacite cap4 = new SortilegeDefensif(50,50);
        Capacite cap5 = new SortilegeGuerisseur(50,50);
        Capacite cap6 = new SortilegeOffensif(50,50);
        
        test1.addCapacite(cap1);
        test1.addCapacite(cap2);
        test1.addCapacite(cap3);
        test1.addCapacite(cap4);
        test1.addCapacite(cap5);
        test1.addCapacite(cap6);
        
        //test1.use(0, test2);
        //test1.use(0, test1);
        
        System.out.println(test1.getInfoCapacite());
        
        
        //GameConsol game = new GameConsol();
        
    	//game.consol();
    }

}
