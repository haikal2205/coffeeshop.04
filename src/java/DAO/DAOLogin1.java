/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.util.ArrayList;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import pojo.coffeeshopUtil;
import pojo.TblUser1;

/**
 *
 * @author haikal 
 */
public class DAOLogin1 {
    public List<TblUser1>getBy(String uName, String uPass)
    {
        Transaction trans = null;
        TblUser1 us = new TblUser1();
        List<TblUser1> user = new ArrayList();
        
        Session session = coffeeshopUtil.getSessionFactory().openSession();
        try{
            trans = session.beginTransaction();
            Query query = session.createQuery("from TblUser1 where username=:uName AND password=:uPass");
            query.setString("uName", uName);
            query.setString("uPass", uPass);
           
            us = (TblUser1) query.uniqueResult();
            user = query.list();
            trans.commit();
        }catch (Exception e){
            System.out.println(e);
        }
        return user;
    } 
    
    public void add_user(TblUser1 user)
    {
        Transaction trans = null;
        Session session = coffeeshopUtil.getSessionFactory().openSession();
        try{
            trans = session.beginTransaction();
            session.save(user);
            trans.commit();
        }catch(Exception e){
            System.out.println(e);
        }
        
    }
}
