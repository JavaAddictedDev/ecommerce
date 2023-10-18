package br.com.jaddicted.ecommerce.modules;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serial;
import java.io.Serializable;

@Entity
@Table(name = "product_brand")
//@SequenceGenerator(name = "seq_product_brand", sequenceName = "seq_product_brand", allocationSize = 1, initialValue = 1)
public class ProductBrand implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(generator = "product_brand_generator")
    @GenericGenerator(name = "product_brand_generator", strategy = "org.hibernate.id.UUIDGenerator")
    private String id;
    private String name;

    public String getId() {
        return id;
    }

    public String getIName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
