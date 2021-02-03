/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package farmyard;

public class sheep extends animal{
    private String lastSheared;

    public sheep(String lastSheared, String name,  int age) {
        super(name, "sheep", age);
        this.lastSheared = lastSheared;
    }
@Override
//it looks for one with the same method signatuere
//run subclass one instead and ignore superclass
public String toString(){
        return name +", "+type+", "+age+",  "+lastSheared;
    }
    public String getLastSheared() {
        return lastSheared;
    }

    public void setLastSheared(String lastSheared) {
        this.lastSheared = lastSheared;
    }
    
}
