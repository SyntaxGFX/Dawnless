package net.isuky.heroic.screens;

import net.isuky.heroic.level.Level;
import net.isuky.heroic.levels.Playground;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;

public class PlayScreen implements Screen
{
    public Game ggame;
	public Level currentLevel;
	
	public PlayScreen(Game game)
	{
		this.ggame = game;	
	}
	
	@Override
	public void show() 
	{
		currentLevel = new Playground();
		
		currentLevel.initialize(ggame);

	}

	@Override
	public void render(float delta)
	{
		Gdx.gl.glClearColor(0f, 0f, 0f, 1f);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		
		currentLevel.update(delta);
		currentLevel.render(delta);

	}

	@Override
	public void resize(int width, int height) 
	{
		// TODO Auto-generated method stub

	}

	@Override
	public void pause() 
	{
		// TODO Auto-generated method stub

	}

	@Override
	public void resume() 
	{
		// TODO Auto-generated method stub

	}

	@Override
	public void hide()
	{
		// TODO Auto-generated method stub

	}

	@Override
	public void dispose() 
	{
		currentLevel.dispose();
	}

}
