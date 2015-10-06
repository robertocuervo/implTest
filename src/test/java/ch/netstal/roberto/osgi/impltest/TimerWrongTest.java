package ch.netstal.roberto.osgi.impltest;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import ch.netstal.roberto.impl.Timer;

public class TimerWrongTest {
	private Timer timer;

	@Before
	public void setUp() throws Exception {
		timer = new Timer();
	}

	@Test
	public void testGetHello() {
		System.err.println("This test is wrong on purpose");
		assertEquals("hell", timer.getHello());
	}
}
