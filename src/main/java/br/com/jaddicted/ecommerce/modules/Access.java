package br.com.jaddicted.ecommerce.modules;

import org.hibernate.annotations.GenericGenerator;
import org.springframework.security.core.GrantedAuthority;

import javax.persistence.*;
import java.io.Serial;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "user_access")
public class Access implements GrantedAuthority {
    @Id
    @GeneratedValue(generator = "user_access_generator")
    @GenericGenerator(name = "user_access_generator", strategy = "org.hibernate.id.UUIDGenerator")
    private String id;
    @Column(nullable = false)
    private String description;

    public String getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String getAuthority() {
        return null;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Access access)) return false;
        return Objects.equals(id, access.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
