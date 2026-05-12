package algunsTestes;

public class PraticaMoldeLoginCadastroUsuario {

    //atributos

   private String usuario;
   private String senha;
   private String email;
   private String genero;
   private String cpf;

    //Construtores com parametros e sem parametros

    public PraticaMoldeLoginCadastroUsuario(String usuario, String senha, String email,String genero , String cpf){

        this.usuario = usuario;
        this.senha = senha;
        this.email = email;
        this.genero = genero;
        this.cpf = cpf;

    }

    public PraticaMoldeLoginCadastroUsuario(){

    }

    //Metodos

    public boolean logarUsuario(String usuarioDigitado, String senhaDigitada) {
        return this.usuario.equals(usuarioDigitado) &&
                this.senha.equals(senhaDigitada);
    }




    //getters e setters para visualizar e mudar alguma informação



    public String getUsuario(){

        return usuario;
    }


    public void setUsuario(String alterarNome){

        this.usuario = alterarNome;

    }

    public String getSenha(){
        return senha;
    }

    public void setSenha(String alterarSenha){

        this.senha = alterarSenha;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String mudarEmail) {
        this.email = mudarEmail;
    }


    public String getCpf() {
        return cpf;
    }

    public void setCpf(String mudarCpf) {
        this.cpf = mudarCpf;
    }
}
