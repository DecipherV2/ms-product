package tn.esprit.msproduct.Service;

import tn.esprit.msproduct.Entity.Produit;

import java.util.List;
import java.util.Optional;

public interface IProduitService {
    public List<Produit> getAllProduits();
    public Optional<Produit> getProduitById(Long id);
    public Produit createProduit(Produit produit);
    public Produit updateProduit(Long id, Produit produit);
    public void deleteProduit(Long id);
}
