/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senac.tads.airsoftware.repository;

import br.senac.tads.airsoftware.model.ItensCarrinho;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author victor
 */
@Repository
@Transactional
public interface ItensCarrinhoRepository extends JpaRepository<ItensCarrinho, Long>{
    
}
