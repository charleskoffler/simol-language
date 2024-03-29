package org.simol.examples.design_patterns.bridge;

import org.simol.simolframework.java.Simu_real_world_obj;
import org.simol.simolframework.java.With_compat;

//Base class for shapes
//public abstract simu_real_world_obj Shape
@Simu_real_world_obj
public abstract class Shape {
	@With_compat
	protected Color color;

    public Shape(@With_compat Color color) {
        this.color = color;
    }

    public abstract void applyColor();
    
    // Other common properties and methods for shapes can go here
}
