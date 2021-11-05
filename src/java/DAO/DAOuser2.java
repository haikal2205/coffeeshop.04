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
import pojo.TblUser2;

/**
 *
 * @author haikal
 */
public class DAOuser2 {
    
    public List<TblUser2> retrveTblUser()
    {
        List stud = new ArrayList();
        TblUser2 stud1 = new TblUser2();
        Transaction trans = null;
        Session session = coffeeshopUtil.getSessionFactory().openSession();
        try{
            trans = session.beginTransaction();
            Query query = session.createQuery("from TblUser2");
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
    
    public List<TblUser2>getbyID(String idU){
        TblUser2 usr = new TblUser2();
        List<TblUser2> iUsr = new ArrayList();
        
        Transaction trans = null;
        Session session = coffeeshopUtil.getSessionFactory().openSession();
        
        try{
            trans = session.beginTransaction();
            Query query = session.createQuery("from TblUser where id_user = :id");
            query.setString("id", idU);
            usr = (TblUser2) query.uniqueResult();
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
            TblUser2 usr = (TblUser2) session.load(TblUser2.class, new Integer(idU));
            session.delete(usr);
            trans.commit();
        }catch(Exception e){
            System.out.println(e);
        }
    }
    
    public void editUser(TblUser2 usr)
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
    
    public void resetUser(TblUser2 usr)
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
