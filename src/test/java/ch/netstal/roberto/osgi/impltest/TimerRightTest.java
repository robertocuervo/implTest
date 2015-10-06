package ch.netstal.roberto.osgi.impltest;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import ch.netstal.roberto.impl.Timer;

public class TimerRightTest {
	private Timer timer;

	@Before
	public void setUp() throws Exception {
		timer = new Timer();
	}

	@Test
	public void test() {
		assertEquals("Timmer get Hello was wrong", "hello", timer.getHello());
	}

}
