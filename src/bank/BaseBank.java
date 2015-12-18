/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bank;
import interfaces.BankInterface;

public class BaseBank implements BankInterface{
    
    private String name;
    private String creditDescription;
    
    @Override
    public void checkInfo(){
        
    }
    @Override
    public void giveCredit(){
        
    }
    @Override
    public String getName() {
        return name;
    }
    @Override
    public String getCreditDescription() {
        return creditDescription;
    }
    
}
