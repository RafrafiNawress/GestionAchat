package tn.esprit.spring.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.FieldDefaults;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Produit implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)	
	Long idProduit;
	String codeProduit;
	String libelleProduit;
	float prix;
	Date dateCreation;
	Date dateDerniereModification;
	
	@OneToMany(mappedBy = "produit")
	public Set<DetailFacture> detailFactures;
	
	@ManyToOne
	public Stock stock;
	
	@ManyToOne
	@Setter
	public CategorieProduit categorieProduit;

}
