/**
 * Handles multiple Levels
 * 
 * 
 * @author Alexander Chabowski
 * */

package net.isuky.heroic.level;

import com.badlogic.gdx.Game;

public interface Level
{
	/**
	 * Initializes the Level
	 *@param game
	 * **/
	public void initialize(Game game);
	
	/**
	 * Load all your content in this method
	 * */
	public void loadContent();
	
	/**
	 * Dispose here your disposeable content
	 * */
	public void dispose();
	
	/**
	 * Updates the Level
	 * @param delta
	 * */
	public void update(float delta);
	
	/**
	 * Renders the Level
	 * @param delta
	 * */
	public void render(float delta);
}
