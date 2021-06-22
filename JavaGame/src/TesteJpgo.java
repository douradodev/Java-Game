public class TesteJpgo {
    public static void main(String[] args) throws Exception {
        Personagem p2 = new Soldado(12,"tail",77,10);
        Personagem p3 = new Cavaleiro(99,"teloso",85,60);

        Jogo jogo = new Jogo();
        jogo.incluir(p2);
        jogo.incluir(p3);
        p2.atacar(p3);
        System.out.println(p3);
    }
}
