/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gradedb;
import java.util.*;
import java.io.*;

        

/**
 *
 * @author Sujay
 */
public class GradeDB {

    /**
   
   * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException
    {
        // TODO code application logic here
        Customer currCst ;
        String fnm;
        String mnm;
        String lnm;        
        String hno;
        String stnm;
        String ct;
        String prv;
        String cntry;
        int id = 0;
        Iterator<Customer> iter;
                
        List<Customer> cst = new LinkedList<>();   
  

        
        System.out.println("Enter Customer Name 'Stop' to quit.");
        BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
        //Entering new Customer 
        do 
        {
            System.out.print("Enter Customer First Name:");
            fnm = br.readLine();
            if (fnm.equals("Stop")) break;
            System.out.print("Enter Customer middle Name:");
            mnm = br.readLine();
            if (mnm.equals("Stop")) break;
            System.out.print("Enter Customer last Name:");
            lnm = br.readLine();
            if (lnm.equals("Stop")) break;
             cst.add(new Customer(fnm,mnm,lnm));

        } while (!fnm.equals("Stop"));
        
        // Entering Address of the Customer
        
        iter = cst.iterator();
        while(iter.hasNext())
        {
            System.out.print("Enter House No:");
            hno = br.readLine();
            System.out.print("Enter Street Name:");
            stnm = br.readLine();
            System.out.print("Enter City No:");
            ct = br.readLine();
            System.out.print("Enter Province:");
            prv = br.readLine();
            System.out.print("Enter Country:");
            cntry = br.readLine();      
            currCst = iter.next();
            currCst.newCurrentAddress(hno,stnm,ct,prv,cntry);
            System.out.println();
        }
        
        
       //Printing  details of the Customer 
       
        iter = cst.iterator();
        while(iter.hasNext())
        {
            currCst = iter.next();
            System.out.print("Current Customer:" + currCst.displayName() +" ");     
            System.out.print("Customer Address:" + currCst.displayCurrentAddress());    
        }
      
      
        
        
       }               
 /*       fileName = userInput();
        if (gradeReader(fileName)) {
            System.out.println("done");
 */          
        
        
    
    static String userInput()
    {
        String fileNm;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Filename:");
        fileNm = input.next();
        System.out.println("Confirm your file name is:"+fileNm);
        return fileNm;
    }
        
    static boolean gradeReader(String filename) 
    {
        BufferedReader bfrd_Rdr = null;
        try
        {
            //Open the file fo REading
            bfrd_Rdr = new BufferedReader(new FileReader(new File(filename)));
            String inputLine;
            while ((inputLine = bfrd_Rdr.readLine()) != null)
            System.out.println(inputLine);
        }
        catch (IOException ex) 
        {
                System.out.println("IO EXception was triggered" );
                ex.printStackTrace();
        }
           finally 
        {
            try
            {
                bfrd_Rdr.close();
            }
            catch (IOException ex)
            {
                System.out.println("IO EXception was triggered" );
                ex.printStackTrace();
            }
                    
        }
      
    return true;
    }
}
    
