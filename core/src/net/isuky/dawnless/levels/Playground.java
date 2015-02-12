/**
 * 
 * 
 *@author Alexander Chabowski
 * */

package net.isuky.dawnless.levels;

import com.badlogic.gdx.Game;

import net.isuky.dawnless.level.Level;
import net.isuky.dawnless.player.Player;

public class Playground implements Level
{
	public Player player;
	

	@Override
	public void initialize(Game game) 
	{
		player = new Player(10, 10);
		player.initialize();
	}

	@Override
	public void loadContent()
	{
		player.loadContent();
	}

	@Override
	public void dispose() 
	{
		player.dispose();
	}

	@Override
	public void update(float delta) 
	{
		player.update(delta);
	}

	@Override
	public void render(float delta)
	{
		player.render(delta);
	}

}
