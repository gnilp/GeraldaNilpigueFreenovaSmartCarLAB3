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
public class Camera extends Body implements SelfCheckCapable{
	
	private String model;
	private String brand;
	private boolean onoffstate;
	
	public void turnOn() {
		// Turn on the camera
		
	}
	
	public void turnOff() {
		// Turn off the camera
		
	}
	private boolean recordstate;
	
	public void record()  {
		// Start record
		
	}
	
	public void record() {
		// Stop  recording
		
	}
	private boolean playstate;
	
	public void play() {
		// start play
		
	}
	
	public void play1() {
		// Stop play
		
	}
	private boolean pausestate;
	
	public void pause1() { 
		// Pause recording
		
	}
	public void pause() {
		// unpause recording
	}

	@Override
	public String getComponentName() {
		// TODO Auto-generated method stub
		return "Camera";
	}

	@Override
	public boolean selfCheck() {
		// TODO Auto-generated method stub
		return SelfCheckUtils.randomCheck(0.3);
	}

}
