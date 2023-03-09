//
// crreate by serge Guea on 09/03/2023
//


public class Test {

    public static void main(String[] args) {

       // creo le auto
        Automobile auto1=new Automobile("Fiat","Panda",2,23);
        Automobile auto2=new Automobile("Seat","Ibiza",3,60);
        Automobile auto3=new Automobile("Mercedes","ClasseA",1,7);
        Automobile auto4=new Automobile("Tesla","S",2,62);

        // stampo i consumi delle auto

        Automobile.checkConsumi(auto1.marca+" "+auto1.modello,auto1.calcolaConsumi());
        Automobile.checkConsumi(auto2.marca+" "+auto2.modello,auto2.calcolaConsumi());
        Automobile.checkConsumi(auto3.marca+" "+auto3.modello,auto3.calcolaConsumi());
        Automobile.checkConsumi(auto4.marca+" "+auto4.modello,auto4.calcolaConsumi());


    }



}