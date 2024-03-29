package org.simol.examples.design_patterns.bridge;

import org.simol.simolframework.java.Simu_comp_as_worker;
import org.simol.simolframework.java.With_compat;

/* Example of simol bridge from java bridge pattern example. Illustrates a case where a compat_interf_version
 * cas used for loose compling. */

//public simu_comp_as_worker Main
@Simu_comp_as_worker
public class Main {

	public static void main(String[] args) {
		@With_compat Color red = new Red();
		@With_compat Color green = new Green();

        Shape redCircle = new Circle(5, red);
        Shape greenSquare = new Square(7, green);

        redCircle.applyColor();    // Circle with radius 5 filled with red color
        greenSquare.applyColor();  // Square with side length 7 filled with green color

	}

}
