package Modulos.Mod11_Colecoes_1.List;
import java.util.Comparator;


public class ComparaNotaAluno implements Comparator<Aluno> {

    @Override
    public int compare(Aluno o1, Aluno o2) {
        //return Double.valueOf(o1.getNota()).compareTo(Double.valueOf(o2.getNota()));
        //return Double.compare(o2.getNota(), o1.getNota());
        return Double.compare(o2.getNota(), o1.getNota());
    }
}