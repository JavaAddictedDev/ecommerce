package br.com.jaddicted.ecommerce.modules;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;
import java.util.Objects;

@Entity
@Table(name = "natural_person")
@PrimaryKeyJoinColumn(name = "id")
public class NaturalPerson extends Person {
    @Column(nullable = false)
    private String identification;
    @Temporal(TemporalType.DATE)
    private Date birth;

    public String getIdentification() {
        return identification;
    }

    public void setIdentification(String identification) {
        this.identification = identification;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof NaturalPerson that)) return false;
        return Objects.equals(identification, that.identification);
    }

    @Override
    public int hashCode() {
        return Objects.hash(identification);
    }
}
