package org.simol.snake_game;

//Could be seen as a simu_real_world_obj, a queue of real-world event of a physical machine tool.
import java.awt.EventQueue;

import org.simol.simolframework.java.Contracts;
import org.simol.simolframework.java.Simu_comp_as_worker;

// A class for the technical realization of the life scene simu_real_world_obj. Typically it is used for display and sound
//effects. It can be compared to a view. Other simu_comp_as_worker can be used for other technical needs, as DAO.
// When the technical realization on computer is very simple, there's no need of a separate class, so we can put
// the technical code straight into the simu_real_world_obj class.

/* public simu_comp_as_worker SnakeGameLifeSceneRealiz contracts Runnable */
@Simu_comp_as_worker
public class SnakeGameLifeSceneRealiz implements @Contracts Runnable {
	
	// Accessors
	// A realization stuff may have kept his simu big brother
	private SnakeGameLifeScene lifeScene;
	//Just a getter
	public SnakeGameLifeScene getLifeScene() {
		return lifeScene;
	}
	
	private SnakeWindow window;
	//Just a getter
	public SnakeWindow getWindow() {
		return window;
	}

	//

	public SnakeGameLifeSceneRealiz(SnakeGameLifeScene lifeScene) {
		this.lifeScene = lifeScene;
		EventQueue.invokeLater(this);
	}
	
	// Just for the EventQueue.invokeLater().
	@Override
	public void run() {
			// Creation of the window using the dispatch thread.
			// The window will refresh itself his display, many times per seconds.
			window = new SnakeWindow(this);
	}

	/**
	 * Effects on game over!
	 * @param reponse
	 * @param concernedSnake
	 */
	public void reactToGameOver(Snake concernedSnake) {
		this.window.setBlnContinue(false);
		String msg = new String("The " + concernedSnake.getColor() + " snake is loosing!");
		java.awt.Toolkit.getDefaultToolkit().beep();
		this.getWindow().getGlobalPanel().getLblVictory().setText(msg);
	}
	
	public void doChangeSpeedGearEffect() {
		java.awt.Toolkit.getDefaultToolkit().beep();
	}
}
