package practica;

public class dos {

    private String numero;
    private int digito;

    public dos() {
    }

    public dos(String numero, int digito) {
        this.numero = numero;
        this.digito = digito;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public int getDigito() {
        return digito;
    }

    public void setDigito(int digito) {
        this.digito = digito;
    }

    @Override
    public String toString() {
        return "dos{" + "numero=" + numero + ", digito=" + digito + '}';
    }

}
