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
import pojo.TblCust;

/**
 *
 * @author Indri
 */
public class DAOCustomer {
    public List<TblCust> getBy(String uNcus, String uEmail, String uTlp, String uBook) 
   {
       Transaction trans = null;
       TblCust cs = new TblCust();
       List<TblCust> customer = new ArrayList();
       
       Session session = coffeeshopUtil.getSessionFactory().openSession();
       try{
           trans = session.beginTransaction();
           Query query = session.createQuery("from TblCust where nameCust=:uNcus AND email=:uEmail AND noTlpn=:uTlp AND book=:uBook");
           query.setString("uNcus", uNcus);
           query.setString("uEmail", uEmail);
           query.setString("uTlp", uTlp);
           query.setString("uBook", uBook);
           cs = (TblCust) query.uniqueResult();
           customer = query.list();
           trans.commit();
       } catch (Exception e){
           System.out.println(e);
       }
       return customer;
   }
   
   public void add_product(TblCust customer)
   {
       Transaction trans = null;
       Session session = coffeeshopUtil.getSessionFactory().openSession();
       try{
           trans = session.beginTransaction();
           session.save(customer);
           trans.commit();
       }catch(Exception e){
           System.out.println(e);
       }
   }
   
   public List<TblCust> retreveTblCust()
   {
       List cus = new ArrayList();
       TblCust cus1 = new TblCust();
       Transaction trans = null;
       Session session = coffeeshopUtil.getSessionFactory().openSession();
       try{
           trans = session.beginTransaction();
           Query query = session.createQuery("from TblCust");
           cus = query.list();
           cus.add(cus1.getIdCustomer());
           cus.add(cus1.getNameCust());
           cus.add(cus1.getEmail());
           cus.add(cus1.getNoTlpn());
           cus.add(cus1.getBook());
           trans.commit();
       }catch(Exception e){
           System.out.println(e);
       }
       return cus;
   }
   
   public List<TblCust> getbyID(String idC)
   {
       TblCust cus = new TblCust();
       List<TblCust> iCus = new ArrayList();
       
       Transaction trans = null;
       Session session = coffeeshopUtil.getSessionFactory().openSession();
       
       try{
           trans = session.beginTransaction();
           Query query = session.createQuery("from TblCust where id_cust= :id");
           query.setString("id", idC);
           cus = (TblCust) query.uniqueResult();
           iCus = query.list();
           trans.commit();
       } catch (Exception e){
           System.out.println(e);
       }
       return iCus;
   }
   
   public void deleteCustomer(Integer idC)
   {
       Transaction trans = null;
       Session session = coffeeshopUtil.getSessionFactory().openSession();
       
       try{
           trans = session.beginTransaction();
           TblCust cus = (TblCust) session.load(TblCust.class, new Integer(idC));
           session.delete(cus);
           trans.commit();
       }catch (Exception e){
           System.out.println(e);
       }
   }
   
   public void editCustomer(TblCust cus)
   {
       Transaction trans = null;
       Session session = coffeeshopUtil.getSessionFactory().openSession();
       
       try{
           trans = session.beginTransaction();
           session.update(cus);
           trans.commit();
       } catch (Exception e){
           System.out.println(e);
       }
   }
   
   public void resetCustomer(TblCust cus)
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
