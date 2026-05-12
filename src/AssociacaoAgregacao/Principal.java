package AssociacaoAgregacao;

import java.util.*;

public class Principal {

   public static void main(String[] args) {
        Funcionarios joao = new Funcionarios("joão");
        Funcionarios joana = new Funcionarios("Joana");
        Funcionarios mateus = new Funcionarios("Mateus");
        Funcionarios Paula = new Funcionarios("Paula");
        List<Funcionarios> listaDeFuncionarios = new ArrayList<>();
        listaDeFuncionarios.add(joana);
        listaDeFuncionarios.add(joao);
        listaDeFuncionarios.add(mateus);
        listaDeFuncionarios.add(Paula);

        Departamento ti = new Departamento("TI", listaDeFuncionarios);
        ti.mostrarFuncionarios();


        //lista vazia
        Departamento marketing = new Departamento("Marketing", Collections.emptyList());
        marketing.mostrarFuncionarios();
    }
}
