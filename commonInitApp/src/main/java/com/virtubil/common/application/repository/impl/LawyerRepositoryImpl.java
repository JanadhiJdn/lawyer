/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.virtubil.common.application.repository.impl;

import com.virtubil.common.application.repository.LawyerRepository;
import com.virtubil.common.application.beans.Lawyer;
import java.util.List;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Janadhi Nanayakkara
 */
@Repository
public class LawyerRepositoryImpl implements LawyerRepository{

    @Autowired
    private SessionFactory sessionFactory;
    
    @Override
    public void addLawyer(Lawyer lawyer) throws DataAccessException {
        System.out.println("CALLED0000000000000000000000");
        sessionFactory.getCurrentSession().saveOrUpdate(lawyer);
    }

    @Override
    public List<Lawyer> getAllLawyers() throws DataAccessException {
        return (List<Lawyer>) sessionFactory.
                getCurrentSession()
                .createCriteria(Lawyer.class)
                .setMaxResults(100)
                .list();
    }
    
    
}
