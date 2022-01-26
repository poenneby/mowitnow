package mower.helper;

import static org.junit.Assert.*;
import mower.helper.DirectionHelper;

import org.junit.Test;

public class DirectionHelperTest {

	@Test
	public void nextDirectionClockwise() {
		assertEquals("E", DirectionHelper.nextClockwise("N"));
		assertEquals("S", DirectionHelper.nextClockwise("E"));
		assertEquals("W", DirectionHelper.nextClockwise("S"));
		assertEquals("N", DirectionHelper.nextClockwise("W"));
	}
	
	@Test
	public void nextDirectionAntiClockwise() {
		assertEquals("W", DirectionHelper.nextAntiClockwise("N"));
		assertEquals("S", DirectionHelper.nextAntiClockwise("W"));
		assertEquals("E", DirectionHelper.nextAntiClockwise("S"));
		assertEquals("N", DirectionHelper.nextAntiClockwise("E"));
	}

}
