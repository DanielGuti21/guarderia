package com.guarderia.service.impl;

import com.guarderia.dao.MatriculaDao;
import com.guarderia.domain.Matricula;
import com.guarderia.service.MatriculaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MatriculaServiceImpl implements MatriculaService {

    @Autowired
    private MatriculaDao matriculaDao;

    @Override
    public void save(Matricula matricula) {
        matriculaDao.save(matricula);
    }
}
