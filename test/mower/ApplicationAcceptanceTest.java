package mower;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Test;

public class ApplicationAcceptanceTest {

	private final static String NEW_LINE = System.getProperty("line.separator");

	@Test
	public void lawnMowerMovesBasedOnASequenceOfInstructions() {
		ByteArrayOutputStream console = new ByteArrayOutputStream();
		System.setOut(new PrintStream(console));
		String[] args = new String[] { "5 5", "1 2 N", "GAGAGAGAA", "3 3 E", "AADAADADDA" };
		Application.main(args);
		String[] lines = console.toString().split(NEW_LINE);
		assertEquals("1 3 N", lines[0]);
		assertEquals("5 1 E", lines[1]);
	}

}
