package com.mindhub.homebanking.Repositories;

import com.mindhub.homebanking.Models.Card;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource
public interface CardRepository extends JpaRepository<Card, Long> {
        List<Card> findByStatus(boolean status);
        Card findByNumber(String number);

}
