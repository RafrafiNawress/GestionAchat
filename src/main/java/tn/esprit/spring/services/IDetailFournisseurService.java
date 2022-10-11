package tn.esprit.spring.services;

import java.util.List;

import org.springframework.stereotype.Service;

import tn.esprit.spring.entities.DetailFournisseur;


public interface IDetailFournisseurService {

	DetailFournisseur saveDetailFournisseur(DetailFournisseur dF);
	List<DetailFournisseur> retrieveDetailFournisseurs();
	DetailFournisseur retrieveById(Long id);
	DetailFournisseur updateDetailFournisseur(DetailFournisseur s);
	void deleteDetailFournisseur(Long id);
}
