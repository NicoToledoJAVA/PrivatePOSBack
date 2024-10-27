package ecomistika.central.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Index;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;
import java.io.Serializable;
import lombok.*;

import jakarta.persistence.*;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;

import java.util.List;

@Data
@Entity
@Table(name = "owners",
        uniqueConstraints = {
            @UniqueConstraint(columnNames = {"owners_nickName"}),
            @UniqueConstraint(columnNames = {"mail"}) // Nueva restricción única
        },
        indexes = {
            @Index(columnList = "owners_nickName"),
            @Index(columnList = "mail"), // Nuevo índice
        })
@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Owner implements Serializable, UserDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(unique = true)
    private String owners_nickName;
    private String name;
    private String familyName;
    @Column(unique = true)
    private String mail;
    private Boolean enabled;
    private Boolean accountNotExpired;
    private Boolean accountNotLocked;
    private Boolean credentialNotExpired;

    /*
        RELACIONES 
     */
    @OneToMany(mappedBy = "owner", cascade = CascadeType.ALL)
    private List<Category> categories;

    @OneToMany(mappedBy = "owner", cascade = CascadeType.ALL)
    private List<Company> companies;

    @OneToMany(mappedBy = "owner", cascade = CascadeType.ALL)
    private List<Customer> customers;  // Métodos de pago

    @OneToMany(mappedBy = "owner", cascade = CascadeType.ALL)
    private List<PaymentMethod> paymentMethods;

    @OneToMany(mappedBy = "owner", cascade = CascadeType.ALL)
    private List<Product> products;

    @OneToMany(mappedBy = "owner", cascade = CascadeType.ALL)
    private List<Sale> sales;

    @OneToMany(mappedBy = "owner", cascade = CascadeType.ALL)
    private List<Product> sale_items;
    
    @OneToMany(mappedBy = "owner", cascade = CascadeType.ALL)
    private List<User> users;

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return List.of(new SimpleGrantedAuthority("ROLE_USER"), new SimpleGrantedAuthority("ROLE_ADMIN"));

    }

      @Override
    public String getUsername() {
       return owners_nickName;
    }
    
    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }

    public String getPassword() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((owners_nickName == null) ? 0 : owners_nickName.hashCode());
        result = prime * result + ((mail == null) ? 0 : mail.hashCode());
        // Excluir referencias mutuas
        return result;
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
        Owner other = (Owner) obj;
        if (owners_nickName == null) {
            if (other.owners_nickName != null) {
                return false;
            }
        } else if (!owners_nickName.equals(other.owners_nickName)) {
            return false;
        }
        if (mail == null) {
            if (other.mail != null) {
                return false;
            }
        } else if (!mail.equals(other.mail)) {
            return false;
        }
        return true;

    }

    @Override
    public String toString() {
        return "UserSec{"
                + "id=" + id
                + ", user_name='" + owners_nickName + '\''
                + ", name='" + name + '\''
                + ", familyName='" + familyName + '\''
                + ", mail='" + mail + '\''
                + ", enabled=" + enabled
                + ", accountNotExpired=" + accountNotExpired
                + ", accountNotLocked=" + accountNotLocked
                + ", credentialNotExpired=" + credentialNotExpired
                + '}';
    }

  

}
