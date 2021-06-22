public abstract class Personagem {
    int id;
    String nome;
    double energia;

    public Personagem(int id, String nome, double energia) {
        this.id = id;
        this.nome = nome;
        this.energia = energia;
    }

    public boolean estaVivo() {
        if (energia <= 0) {
            return false;
        } else {
            return true;
        }
    }

    public void defenderAtaque(int valor) throws Exception {
        if (energia < 1) {
            throw new Exception("O personagem já está morto");
        } else if (valor > energia) {
            energia = 0;
        } else {
            energia -= valor;
        }
    }

    public abstract void atacar(Personagem p) throws Exception;

    @Override
    public String toString() {
        return "Personagem{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", energia=" + energia +
                ", está vivo?: " + estaVivo() +
                '}';
    }
}
