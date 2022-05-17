package Aplicação;

import Entidades.Midia;
import Entidades.Cd;
import Entidades.Dvd;
public class App {
    public static void main(String[] args) throws Exception {
        //Criando objetos
        Midia md = new Midia(123, 30.0, "Rei Leão");
        Cd cd = new Cd(457, 25.0, "Rising Force", 12);
        Dvd dvd = new Dvd();
    
        System.out.println(md.getDetalhes());    
        System.out.println();
        System.out.println(cd.getDetalhes());
        System.out.println();
        dvd.inserirDados();
        System.out.println();
        System.out.println(dvd.getDetalhes());
    }
}
