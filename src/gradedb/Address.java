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
public class Address {
    private String aHouseNo;
    private String aStreetNm;
    private String aCity;
    private String aProv;
    private String aCountry;

    
   Address(String hs, String snm, String ct, String prv, String cntry)
    {
        aHouseNo = hs;
        aStreetNm = snm;
        aCity = ct;
        aProv   =  prv;
        aCountry  =  cntry;     
    }
    public String getAddress()
    {
        return aHouseNo + ' ' + aStreetNm + ' '+ aCity + ' ' +  aProv + ' ' + aCountry  ;
    }
    public void setAddress(String hs, String snm, String ct, String prv, String cntry)
    {
        aHouseNo = hs;
        aStreetNm = snm;
        aCity = ct;
        aProv   =  prv;
        aCountry  =  cntry;     
    }
    
    
    
    
        
    
}

