package Khelifi;

public class Main {
    public static void main (String[] args)
    {

        // Créer une cargaison routière
        Cargaison_Routiere CR = new Cargaison_Routiere(100,40);
        System.out.println("le ref est : " + CR.getRef());


        //Ajouter  3 marchandises à cette cargaison
        CR.ajouterMarchandise(new Marchandise(15, 150, 300));
        CR.ajouterMarchandise(new Marchandise(20, 180, 340));
        CR.ajouterMarchandise(new Marchandise(15, 130, 320));

        //Afficher toutes les marchandises de cette cargaison
        System.out.println("les Marchandises sont "+ CR.afficherMarchandise());

        //Afficher le coût de cette cargaison
        System.out.println("le cout des Marchandises est  "+ CR.calculerCoutTransport());


        // Créer une cargaison Aerienne
        Cargaison_Routiere AR = new Cargaison_Routiere(120 ,100);
        System.out.println("le ref est : " + AR.getRef());

        //Ajouter  3 marchandises à cette cargaison
        AR.ajouterMarchandise(new Marchandise(25, 110, 340));
        AR.ajouterMarchandise(new Marchandise(30, 75, 220));
        AR.ajouterMarchandise(new Marchandise(45, 100, 310));

        //Afficher toutes les marchandises de cette cargaison
        System.out.println("les Marchandises sont "+ AR.afficherMarchandise());

        //Afficher le coût de cette cargaison
        System.out.println("le cout des Marchandises est  "+ AR.calculerCoutTransport());

    }
}
