/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cme.facade.settings;

import com.cme.entities.MessageOutDetail;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author admin
 */
@Stateless
public class MessageOutDetailFacade extends AbstractFacade<MessageOutDetail> {

    @PersistenceContext(unitName = "ContentManagerPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public MessageOutDetailFacade() {
        super(MessageOutDetail.class);
    }
    
    
    public List<MessageOutDetail> getOutDetailList(){
        return em.createNamedQuery("MessageOutDetail.findAll").getResultList();
    }
}