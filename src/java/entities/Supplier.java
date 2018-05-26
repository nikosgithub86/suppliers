package entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table(name = "supplier")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Supplier.findAll", query = "SELECT s FROM Supplier s")
    , @NamedQuery(name = "Supplier.findById", query = "SELECT s FROM Supplier s WHERE s.id = :id")
    , @NamedQuery(name = "Supplier.findByCompanyName", query = "SELECT s FROM Supplier s WHERE s.companyName = :companyName")
    , @NamedQuery(name = "Supplier.findByName", query = "SELECT s FROM Supplier s WHERE s.name = :name")
    , @NamedQuery(name = "Supplier.findBySurname", query = "SELECT s FROM Supplier s WHERE s.surname = :surname")
    , @NamedQuery(name = "Supplier.findByIRoffice", query = "SELECT s FROM Supplier s WHERE s.iRoffice = :iRoffice")
    , @NamedQuery(name = "Supplier.findByZipCode", query = "SELECT s FROM Supplier s WHERE s.zipCode = :zipCode")
    , @NamedQuery(name = "Supplier.findByCity", query = "SELECT s FROM Supplier s WHERE s.city = :city")
    , @NamedQuery(name = "Supplier.findByCountry", query = "SELECT s FROM Supplier s WHERE s.country = :country")})
public class Supplier implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "companyName")
    private String companyName;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "name")
    private String name;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "surname")
    private String surname;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "iRoffice")
    private String iRoffice;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "zipCode")
    private String zipCode;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "city")
    private String city;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "country")
    private String country;

    public Supplier() {
    }

    public Supplier(Integer id) {
        this.id = id;
    }

    public Supplier(String companyName, String name, String surname, String iRoffice, String zipCode, String city, String country) {
        this.companyName = companyName;
        this.name = name;
        this.surname = surname;
        this.iRoffice = iRoffice;
        this.zipCode = zipCode;
        this.city = city;
        this.country = country;
    }

    public Supplier(Integer id, String companyName, String name, String surname, String iRoffice, String zipCode, String city, String country) {
        this.id = id;
        this.companyName = companyName;
        this.name = name;
        this.surname = surname;
        this.iRoffice = iRoffice;
        this.zipCode = zipCode;
        this.city = city;
        this.country = country;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getIRoffice() {
        return iRoffice;
    }

    public void setIRoffice(String iRoffice) {
        this.iRoffice = iRoffice;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Supplier)) {
            return false;
        }
        Supplier other = (Supplier) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Supplier[ id=" + id + " ]";
    }

}
