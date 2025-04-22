package com.guarderia.dao;

import com.guarderia.domain.Matricula;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MatriculaDao extends JpaRepository<Matricula, Long> {

}
