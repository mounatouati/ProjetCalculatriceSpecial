package projet.calculatrices.integer;

import java.util.ArrayList;

public class historiqueDesoperations <T>{

    private T[] tableau;
    private int index;

    public historiqueDesoperations() {
        this.tableau = (T[]) new Object[100];
        this.index = 0;
    }

    public void add(T element) {
        this.tableau[this.index] = element;
        this.index++;
    }

    public T getElement(int index) {
        return this.tableau[index];
    }

    public String toString() {
        String resultat = "";

        for (int i = 0; i < this.index; i++) {
            resultat += this.tableau[i] + "\n";
        }

        return resultat;
    }
}
