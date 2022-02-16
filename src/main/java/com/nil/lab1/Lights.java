/**
 * 
 */
package com.nil.lab1;

import edu.fiu.jit.SelfCheckCapable;
import edu.fiu.jit.SelfCheckUtils;

/**
 * @author gnilp
 *
 */
public class Lights extends Body implements SelfCheckCapable {
	
	private String brand;
	private String model;	
	private boolean onoffstate;
	
	public void turnon() {
	           //	power on lights
		
	}
	
	/**
	 * 
	 */

}
    public void turnoff() {
    	// power off the lights
    	
    }
	@Override
	public String getComponentName() {
		// TODO Auto-generated method stub
		return "Light";
	}
	@Override
	public boolean selfCheck() {
		// TODO Auto-generated method stub
		return SelfCheckUtils.randomCheck(0.5);
	}
    
    //**
    
   
    
  }
