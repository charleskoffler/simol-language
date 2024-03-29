package org.simol.snake_game;

import org.simol.simolframework.java.Simu_comp_as_worker;

/**
 * It's a simple 2D snake game, with two players and two snakes.
 * The display is with Swing, in a JFrame. This example contains much explanations of simol choices
 * and annotations used.
 * 
 * There are 4 speed gears.
 * Keys: Snake one: arrows, and comma/space for speed gear changes.
 * Snake two: z/w up/down, q/s left/right, a/x for speed gear changes.
 * 
 * V4.3(20240131).
 * Use of long actions, although the snake always slide. Added simol explanation comments.
 * Move of the endLongActions to the end of the paint() method.
 * 
 * possible evolves:
 * Count score, and display it, but the winner is the one who don't loose, except if all food is eaten.
 * 
 *
 * 
 * @author Charles Koffler for simol language GitHub Repository
 *
 */
//public simu_comp_as_worker MainSnakeGame
@Simu_comp_as_worker
public class MainSnakeGame {
	public static void main(String[] args) {
		//Just create a life scene, and the simulation will be displayed.
			SnakeGameLifeScene scene = new SnakeGameLifeScene();
	}
}
