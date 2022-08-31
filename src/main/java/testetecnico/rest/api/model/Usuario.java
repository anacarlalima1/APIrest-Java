package testetecnico.rest.api.model;


import javax.persistence.*;

@Entity
public class Usuario {

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getData_nasc() {
        return data_nasc;
    }

    public void setData_nasc(String data_nasc) {
        this.data_nasc = data_nasc;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    public Integer codigo;
    @Column(nullable = false, length = 50)
    public String nome;
    @Column(nullable = false, length = 14)
    public String cpf;
    @Column(nullable = false, length = 8)
    public String data_nasc;
    @Column(nullable = false, length = 20)
    public String email;
}
