/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minor.project;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class emailVal {
     public static boolean EmailValidation(String email){
        boolean status =false;
        String email_pattern="^[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$";
      Pattern pattern= Pattern.compile(email_pattern);
      Matcher match = pattern.matcher(email);
      if(match.matches())
      {
          status= true;
      }
      else
      {
          status= false;
      }
      return status;
    }

    
}
