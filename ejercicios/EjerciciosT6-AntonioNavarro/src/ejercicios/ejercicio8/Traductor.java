package ejercicios.ejercicio8;

public class Traductor {
    public boolean state;
    public String fraseTraducida;

    public Traductor() {
        state = false;
        fraseTraducida = "";
    }

    public Traductor(boolean state, String fraseTraducida) {
        this.state = state;
        this.fraseTraducida = fraseTraducida;
    }
}
