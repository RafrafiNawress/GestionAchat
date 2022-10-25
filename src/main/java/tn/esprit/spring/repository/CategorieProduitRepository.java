package tn.esprit.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.spring.entities.CategorieProduit;

public interface CategorieProduitRepository extends JpaRepository<CategorieProduit, Long> {
}
