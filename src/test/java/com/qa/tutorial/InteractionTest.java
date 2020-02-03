package com.qa.tutorial;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class InteractionTest {
	/**
	 * This is the method for cool people
	 * @return a greeting
	 */
	@Test
	public void greetingTest() {
		Interaction interaction = new Interaction();
		assertEquals("Hi friend", interaction.greeting());
	}
	/**
	 * This is the method for sam
	 * @return an insult
	 */
	@Test
	public void insultTest() {
		Interaction interaction = new Interaction();
		assertEquals("Is trash", interaction.insult());
	}
}
