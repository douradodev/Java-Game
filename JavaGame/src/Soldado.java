public class Soldado extends Personagem{
    int forcaDeAtaque;

    public Soldado(int id, String nome, double energia, int forcaDeAtaque) {
        super(id, nome, energia);
        this.forcaDeAtaque = forcaDeAtaque;
    }

    @Override
    public void defenderAtaque(int valor) throws Exception {
        valor = valor/2;
        defenderAtaque(valor);
    }

    @Override
    public void atacar(Personagem p) throws Exception {
        p.defenderAtaque(forcaDeAtaque);

    }

    @Override
    public String toString() {
        return "Soldado{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", energia=" + energia +
                ", está vivo?: " + estaVivo() +
                '}';
    }
}
