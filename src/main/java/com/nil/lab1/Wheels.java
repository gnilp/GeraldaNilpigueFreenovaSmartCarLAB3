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
public class Wheels extends Body implements SelfCheckCapable {
	
	private double size; 
	private double amount;
	private boolean turnrightstate;
	
	public void turn  righ() {
		// Turn wheel right
	}
	
	/**
	 * Shows a meaagse on display
	 */
	
	private boolean turnleftstate;
	
	public void turnleft()  {
		// Turn wheel left
	}
	
	/**
	 *  Shows a message 
	 */
	
	private boolean moveforwardstate;
	
	public void moveforward () {
		// Move wheel forward
		
	}
	
	/** 
	 * Shows a message 
	 */
	private boolean movebackwardstate;
	
	public void movebackward () {
		// Move wheel backward
		
	}

	@Override
	public String getComponentName() {
		// TODO Auto-generated method stub
		return "Wheel";
	}

	@Override
	public boolean selfCheck() {
		// TODO Auto-generated method stub
		return SelfCheckUtils.randomCheck(0.1);
	}

}
