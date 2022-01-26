package mower;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class LawnMowerTest {

	private LawnMower lawnMower;
	private Lawn lawn;
	
	@Before
	public void createLawnMower() {
		this.lawn = new Lawn(5, 5);
		this.lawnMower = new LawnMower(0, 0, "N", lawn);
	}

	@Test
	public void reportPosition() {
		assertEquals("0 0 N", lawnMower.position());
	}
	
	@Test
	public void turnRightChangesDirection() {
		lawnMower.turnRight();
		assertEquals("0 0 E", lawnMower.position());
		lawnMower.turnRight();
		assertEquals("0 0 S", lawnMower.position());
		lawnMower.turnRight();
		assertEquals("0 0 W", lawnMower.position());
		lawnMower.turnRight();
		assertEquals("0 0 N", lawnMower.position());
	}
	
	@Test
	public void turnLeftChangesDirection() {
		lawnMower.turnLeft();
		assertEquals("0 0 W", lawnMower.position());
		lawnMower.turnLeft();
		assertEquals("0 0 S", lawnMower.position());
		lawnMower.turnLeft();
		assertEquals("0 0 E", lawnMower.position());
		lawnMower.turnLeft();
		assertEquals("0 0 N", lawnMower.position());
	}
	
	@Test
	public void forwardNorth() {
		lawnMower.forward();
		assertEquals("0 1 N", lawnMower.position());
	}
	
	@Test
	public void forwardEast() {
		lawnMower = new LawnMower(0, 0, "E", lawn);
		lawnMower.forward();
		assertEquals("1 0 E", lawnMower.position());
	}
	
	@Test
	public void forwardSouth() {
		lawnMower = new LawnMower(0, 1, "S", lawn);
		lawnMower.forward();
		assertEquals("0 0 S", lawnMower.position());
	}
	
	@Test
	public void forwardWest() {
		lawnMower = new LawnMower(1, 0, "W", lawn);
		lawnMower.forward();
		assertEquals("0 0 W", lawnMower.position());
	}
	
	@Test
	public void forwardOutsideLimitWest() {
		lawnMower = new LawnMower(0, 0, "W", lawn);
		lawnMower.forward();
		assertEquals("0 0 W", lawnMower.position());
	}
	
	@Test
	public void forwardOutsideLimitSouth() {
		lawnMower = new LawnMower(0, 0, "S", lawn);
		lawnMower.forward();
		assertEquals("0 0 S", lawnMower.position());
	}
	
	@Test
	public void forwardOutsideLimitEast() {
		lawnMower = new LawnMower(5, 0, "E", lawn);
		lawnMower.forward();
		assertEquals("5 0 E", lawnMower.position());
	}
	
	@Test
	public void forwardOutsideLimitNorth() {
		lawnMower = new LawnMower(0, 5, "N", lawn);
		lawnMower.forward();
		assertEquals("0 5 N", lawnMower.position());
	}

}
