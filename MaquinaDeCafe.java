package mx.unam.POO;

public class MaquinaDeCafe {

    private int agua;
    private int cafe;
    private int crema;
    private int CapacidadVasos;
    private boolean EstadoMaquina;
    private int variable;

    private int[] Vaso;

    public void almacenamiento() {
        agua = 5000;
        cafe = 1000;
        crema = 1500;
        Vaso = new int[50];
        CapacidadVasos = 200;
        variable = 49;
        EstadoMaquina = true;
    }

    public void Americano() {
        if (agua >= 180 && cafe >= 15 && Vaso[0] != 200) {
            this.agua = this.agua - 180;
            this.cafe = this.cafe - 15;
            Vaso[variable] = 200;
            variable--;
        } else {
            System.out.println("No se ha podido crear tu cafe 'americano'");
            EstadoMaquina = false;
        }
    }

    public boolean Expreso() {

        if (agua >= 120 && cafe >= 20 && Vaso[0] != 200) {
            this.agua = this.agua - 120;
            this.cafe = this.cafe - 20;
            System.out.println("Aqui esta tu 'expreso'");
            Vaso[variable] = 200;
            variable--;
            EstadoMaquina = true;
            return EstadoMaquina;
        } else {
            System.out.println("No se ha podido crear tu cafe 'expreso'");
            EstadoMaquina = false;
            return EstadoMaquina;
        }
    }

    public void Capuchino() {
        if (agua >= 100 && crema >= 70 && cafe >= 14 && Vaso[0] != 200) {
            this.agua = this.agua - 100;
            this.crema = this.cafe - 70;
            this.cafe = this.cafe - 14;
            Vaso[variable] = 200;
            variable--;
        } else {
            System.out.println("No se ha podido crear tu cafe 'capuchino'");
            EstadoMaquina = false;
        }
    }

    public int getAgua() {
        return agua;
    }

    public void setAgua(int agua) {
        this.agua = agua;
    }

    public int getCafe() {
        return cafe;
    }

    public void setCafe(int cafe) {
        this.cafe = cafe;
    }

    public int getCrema() {
        return crema;
    }

    public void setCrema(int crema) {
        this.crema = crema;
    }

    public int[] getVaso() {
        return Vaso;
    }

    public void setVaso(int[] Vaso) {
        this.Vaso = Vaso;
    }

    @Override
    public String toString() {
        return "La Maquina tiene de {" + "agua=" + agua + " \ncafe=" + cafe + ", \ncrema=" + crema + ", Vasos=" + Vaso[variable] + '}';
    }

    public static void main(String[] args) {
        Maquina cafetera = new Maquina();

        for (int i = 0; i <= 8; i++) {
            System.out.println(cafetera.toString());
            cafetera.Americano();
            cafetera.Americano();
            cafetera.Capuchino();
            cafetera.Expreso();
            cafetera.Capuchino();

            System.out.println(cafetera.toString());
        }

    }
}
