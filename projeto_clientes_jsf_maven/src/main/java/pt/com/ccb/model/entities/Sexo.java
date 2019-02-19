package pt.com.ccb.model.entities;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
//import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import org.hibernate.annotations.ForeignKey;

/**
 * @author Cesar Barbosa
 */
@Entity
@Table(name="sexo")

public class Sexo implements Serializable{

    @Id
    @GeneratedValue
    @Column(name="idSexo", nullable = false)
    private Integer idSexo;
    
    @Column(name="Descrição", unique=true,nullable = false, length=9)
    private String descrição;

    @OneToMany(mappedBy = "sexo", fetch = FetchType.LAZY)
    @ForeignKey(name = "PessoaSexo")
    private List<Pessoa> pessoas;
    
    public Sexo() {
    }

    public Integer getIdSexo() {
        return idSexo;
    }

    public void setIdSexo(Integer idSexo) {
        this.idSexo = idSexo;
    }

    public String getDescrição() {
        return descrição;
    }

    public void setDescrição(String descrição) {
        this.descrição = descrição;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + Objects.hashCode(this.idSexo);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Sexo other = (Sexo) obj;
        if (!Objects.equals(this.idSexo, other.idSexo)) {
            return false;
        }
        return true;
    }

    public List<Pessoa> getPessoas() {
        return pessoas;
    }
}






