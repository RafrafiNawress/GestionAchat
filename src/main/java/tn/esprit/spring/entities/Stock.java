package tn.esprit.spring.entities;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
@Builder
//@RequiredArgsConstructor
public class Stock implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)	
	Long idStock;
	int qte;
	int qteMin;
	String libelleStock;
	
	@OneToMany(fetch= FetchType.EAGER,mappedBy = "stock" ,cascade = CascadeType.ALL)
	public Set<Produit> produits;
	

}
