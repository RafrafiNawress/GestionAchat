package tn.esprit.spring.entities;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.FieldDefaults;

@Entity
/*
 * @data =hedhouma lkol
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
@RequiredArgsConstructor
@Builder // ki nabda nheb naml des parametres kima nheb n3ayt lelcalsse.builder( w nhot lhne les att eli nheb alehom)
@FieldDefaults(level = AccessLevel.PRIVATE)
public class CategorieProduit implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)	
	Long idCategorieProduit;
	String codeProduit;
	
	@NonNull // n7ot alih non null ki nabda nheb n7otou fi constructeur 
	String libelleCategorieProduit;
	
	@OneToMany(mappedBy = "categorieProduit" , cascade = CascadeType.ALL)
	Set<Produit> produits;
}
