package com.example.hakaton2.repository;

import com.example.hakaton2.entity.Pnr;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PnrRepository extends JpaRepository<Pnr, Long> {
}
