/**
 * 
 */
package com.nil.lab1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import edu.fiu.jit.GenericComponent;
import edu.fiu.jit.SelfCheckCapable;

/**
 * @author gnilp
 *
 */
public class FreenovaSmartCarKit implements GenericComponent {
	
	private String brand;
	private String model;
	private Int price;
	private Sensor mysensors;
	private Motor mymotor;
	private Camera mycamera;
	private Light mylight;
	private Wheel mywheel;
	private Cloud mycloud;
	private Software mysoftware;
	
	public FreenovaSmartCarKit() {
		mySensors = new Sensor();
		myMotor = new Motor();
		myCamera = new Camera();
		myLight = new Light();
		myWheel = new Wheel();
		myCloud = new Cloud();
		mySoftware = new Software();
		
		
		
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public String getComponentName() {
		// TODO Auto-generated method stub
		return "Freenova Smart car Kit Model 3";
	}

	@Override
	public boolean selfCheck() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public List<SelfCheckCapable> getSubComponents() {
		List internalComponents = new ArrayList(); // create an empty list
		Collections.addAll(internalComponents, mySensor, myMotor, myCamera, myLight, myWheel, myCloud, mySoftware); // add all your sub components
		return internalComponents;
	}
	}

}
