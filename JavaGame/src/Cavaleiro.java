public class Cavaleiro extends Soldado{

    public Cavaleiro(int id, String nome, double energia, int forcaDeAtaque) {
        super(id, nome, energia, forcaDeAtaque);
    }

    @Override
    public void atacar(Personagem p) throws Exception {
        p.defenderAtaque(forcaDeAtaque * 2);
    }

    @Override
    public void defenderAtaque(int valor) throws Exception {
        valor = valor/3;
        defenderAtaque(valor);
    }

    @Override
    public String toString() {
        return "Cavaleiro{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", energia=" + energia +
                ", está vivo?: " + estaVivo() +
                '}';
    }
}
