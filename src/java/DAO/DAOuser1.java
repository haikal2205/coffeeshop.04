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
public class DAOuser1 {
    
    public List<TblUser1> retrveTblUser()
    {
        List stud = new ArrayList();
        TblUser1 stud1 = new TblUser1();
        Transaction trans = null;
        Session session = coffeeshopUtil.getSessionFactory().openSession();
        try{
            trans = session.beginTransaction();
            Query query = session.createQuery("from TblUser1");
            stud = query.list();
            stud.add(stud1.getIdUser());
            stud.add(stud1.getUsername());
            stud.add(stud1.getPassword());
            trans.commit();
        }catch(Exception e){
            System.out.println(e);
        }
        return stud;
    }
    
    public List<TblUser1>getbyID(String idU){
        TblUser1 usr = new TblUser1();
        List<TblUser1> iUsr = new ArrayList();
        
        Transaction trans = null;
        Session session = coffeeshopUtil.getSessionFactory().openSession();
        
        try{
            trans = session.beginTransaction();
            Query query = session.createQuery("from TblUser where id_user = :id");
            query.setString("id", idU);
            usr = (TblUser1) query.uniqueResult();
            iUsr = query.list();
            trans.commit();
        }catch(Exception e){
            System.out.println(e);
        }
        return iUsr;
    }
    
    public void deleteUser(Integer idU)
    {
        Transaction trans = null;
        Session session = coffeeshopUtil.getSessionFactory().openSession();
        
        try{
            trans = session.beginTransaction();
            TblUser1 usr = (TblUser1) session.load(TblUser1.class, new Integer(idU));
            session.delete(usr);
            trans.commit();
        }catch(Exception e){
            System.out.println(e);
        }
    }
    
    public void editUser(TblUser1 usr)
    {
        Transaction trans = null;
        Session session = coffeeshopUtil.getSessionFactory().openSession();
        
        try{
            trans = session.beginTransaction();
            session.update(usr);
            trans.commit();
        }catch(Exception e){
            System.out.println(e);
        }
    }
    
    public void resetUser(TblUser1 usr)
   {
       Transaction trans = null;
       Session session = coffeeshopUtil.getSessionFactory().openSession();
       
       try{
           trans = session.beginTransaction();
           session.clear();
           trans.commit();
       }catch(Exception e){
           System.out.println(e);
       }
   }
}
