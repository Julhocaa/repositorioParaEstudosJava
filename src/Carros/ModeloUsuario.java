package Carros;

public class ModeloUsuario {

    //Atributos
    private String usuario;
    private String senha;
    private String cpf;
    private String telefone;
    private String genero;
    private String dataNascimento;

    //1-contrutor com parametros cadastro usuario
    public ModeloUsuario(String usuario, String senha, String cpf, String telefone, String genero, String dataNascimento) {

        this.usuario = usuario;
        this.senha = senha;
        this.cpf = cpf;
        this.telefone = telefone;
        this.genero = genero;
        this.dataNascimento = dataNascimento;


    }

    //2-contrutor sem parametro
    public ModeloUsuario() {

    }





}