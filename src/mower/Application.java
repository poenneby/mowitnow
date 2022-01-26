package mower;

import java.util.ArrayList;
import java.util.List;

public class Application {

	public static void main(String[] args) {
		// Collect parameters
		List<String> mowerPositions = new ArrayList<String>();
		List<String> mowerInstructions = new ArrayList<String>();
		String lawnParameters = null;
		for (int i = 0; i < args.length; i++) {
			if (i == 0) {
				lawnParameters = args[i];
				continue;
			}
			if (i % 2 == 0) {
				mowerInstructions.add(args[i]);
			} else {
				mowerPositions.add(args[i]);
			}
		}

		// Construct
		String[] lawnWidthLength = lawnParameters.split(" ");
		Lawn lawn = new Lawn(intOf(lawnWidthLength[0]), intOf(lawnWidthLength[1]));

		List<LawnMower> lawnMowers = new ArrayList<LawnMower>();
		for (String mowerPosition : mowerPositions) {
			String[] mowerXYD = mowerPosition.split(" ");
			lawnMowers.add(new LawnMower(intOf(mowerXYD[0]), intOf(mowerXYD[1]), mowerXYD[2], lawn));
		}

		// Execute
		for (int i = 0; i < lawnMowers.size(); i++) {
			String[] instructions = mowerInstructions.get(i).split("");
			LawnMower lawnMower = lawnMowers.get(i);
			for (String instruction : instructions) {
				if (instruction.equals("A")) {
					lawnMower.forward();
				} else if (instruction.equals("G")) {
					lawnMower.turnLeft();
				} else if (instruction.equals("D")) {
					lawnMower.turnRight();
				}
			}
			System.out.println(lawnMower.position());
		}

	}

	private static int intOf(String s) {
		return Integer.parseInt(s);
	}
}
