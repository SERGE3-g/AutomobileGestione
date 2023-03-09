/*
Scrivere una classe automobile che abbia i seguenti attributi:

marca
modello
litri
chilometri
consumo

E' possibile inizializzare gli attributi con un costruttore parametrico! (scegliete bene
i parametri)
Scrivere un metodo che in base ai chilometri percorsi e ai litri di benzina consumati
calcoli il consumo al litro, ad esempio 20 km con 2 litri di benzina = 10 km al litro
Metodo non deve tornare void!

Effettuare un test nel main:

Se il consumo al litro è superiore a 20 stampare : consumi eccellenti

Se il consumo è compreso tra 15 e 19 stampare : consumi superiori alla media

Se il consumo è compreso tra 12 e 14 stampare : consumi nella media

Se il consumo è compreso tra 8 e 11 stampare : consumi sotto la media

Altrimenti stampare: L'auto consuma troppo!

In ogni caso si valuti che non è possibile un valore di consumo superiore a 30!

La stampa negli if deve stampare anche la marca ed il modello

Esempi:
La fiat panda percorre 22 chilometri con un litro ed ha consumi eccellenti
La fiat croma percorre 4 chilometri al litro e consuma troppo
Errore, non è possibile che un auto faccia 30 chilometri al litro
 */


public class Automobile {

    String marca;
    String modello;
    int litri;
    int chilometri;
    double consumo;

    public Automobile(String marca, String modello, int litri, int chilometri) { // creo il costruttore parametrico
        super();
        this.marca = marca;
        this.modello = modello;
        this.litri = litri;
        this.chilometri = chilometri;
    }

    public double calcolaConsumi() { // creo il metodo che calcola il consumo

        return (double) this.chilometri/this.litri;// ritorno il valore del consumo

    }

    static void checkConsumi(String automobile,double consumo) { // creo il metodo che controlla il consumo

        if (consumo >29) {

            System.out.println("Errore l'auto "+automobile+ " non è possibile che faccia più di 30 chilometri al litro");// stampo il messaggio di errore

        }else if (consumo >=20) {
            System.out.println("La "+automobile+ " percorre "+consumo+ " km con un litro ed ha consumi eccellenti");

        }else if (consumo >=15 && consumo <20) {
            System.out.println("La "+automobile+ " percorre "+consumo+ " km con un litro ed ha consumi superiori alla media");
        }else if (consumo >=12 && consumo <15) {
            System.out.println("La "+automobile+ " percorre "+consumo+ " km con un litro ed ha consumi nella media");
        }	else if (consumo >=8 && consumo <12) {
            System.out.println("La "+automobile+ " percorre "+consumo+ " km con un litro ed ha consumi sotto la media");

        }else {
            System.out.println("La "+automobile+ " percorre "+consumo+ " km con un litro e consuma troppo");
        }
    }
}