package com.knn.rcs.repository;

import com.knn.rcs.model.Replacement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReplacementRepository extends JpaRepository<Replacement, Long> {
}
