package com.jgodara.stackoverflow.market.behaviour.impl;

import org.apache.log4j.Logger;

import com.jgodara.stackoverflow.market.behaviour.Modifier;
import com.jgodara.stackoverflow.market.model.Stock;

/**
 * @author Jay
 * 
 *         Modifier implementation for Integrity.
 */
public class IntegrityModifier implements Modifier {

	private static final Logger logger = Logger.getLogger(IntegrityModifier.class);

	public void modify(Stock target, float modifier) {
		logger.info("Modifying integrity of stock " + target);
		target.setIntegrity(target.getIntegrity() + modifier);
	}

}
