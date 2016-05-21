/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gradedb;

/**
 *
 * @author Sujay
 */
public class Customer  {
    private String cFirstName;
    private String cMiddleName;
    private String cLastName;
    private Address cCurrAdd;
    
    public Customer(String cfnm, String cmnm , String clnm)
    {
        cFirstName = cfnm;
        cMiddleName = cmnm;
        cLastName = clnm;
        
    }
    
    public String displayName()
    {
        return cFirstName + ' ' + cMiddleName +  ' ' + cLastName;
    }
    
    public String getFirstName()
    {
        return cFirstName;
    }
     public String getMiddleName()
    {
        return cMiddleName;
    }
      public String getLastName()
    {
        return cLastName;
    }
      public void setFirstName(String fnm)
      {
          cFirstName = fnm;
      }
      public void setMiddleName(String mnm)
      {
          cMiddleName = mnm;
      }
      public void setLastName(String lnm)
      {
          cLastName = lnm;
      }
      public String displayCurrentAddress()
      {
          return cCurrAdd.getAddress();
      }
      public void newCurrentAddress(String hno,String snm,String ct,String prv,String cntry)
      {
          cCurrAdd = new Address(hno,snm,ct,prv,cntry);
          
      }
}
