import java.util.ArrayList;

public class Jogo {
    ArrayList<Personagem> elementos = new ArrayList<>();

    public void incluir(Personagem p) throws Exception {
        for (int i = 0; i < elementos.size(); i++) {
            if (p.id == elementos.get(i).id) {
                throw new Exception("Este ID de personagem já existe");
            } else {
                elementos.add(p);
            }
        }
    }

    public Personagem consultar(int id) {
        for (int i = 0; i < elementos.size(); i++) {
            if (id == elementos.get(i).id) {
                return elementos.get(i);
            }
        };
        return null;
    }

    public void atacar(int id1, int id2 ) throws Exception {
        Personagem p1 = null;
        Personagem p2 = null;
        for (int i = 0; i < elementos.size(); i++) {
            if (id1 == elementos.get(i).id) {
                p1 = elementos.get(i);
            } else if (id2 == elementos.get(i).id) {
                p2 = elementos.get(i);
            }
        };
        p1.atacar(p2);
    }

    public void avaliarBatalha() {
        //toString
    }


}
