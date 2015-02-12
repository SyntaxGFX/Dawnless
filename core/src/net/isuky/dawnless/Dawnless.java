package net.isuky.dawnless;


import java.io.IOException;

import net.isuky.dawnless.screens.MainMenu;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.files.FileHandle;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.XmlReader;
import com.badlogic.gdx.utils.XmlReader.Element;
import com.badlogic.gdx.utils.viewport.StretchViewport;
import com.badlogic.gdx.utils.viewport.Viewport;

public class Dawnless extends Game 
{
	public static SpriteBatch batch;
	public static Viewport viewport;	
	public static OrthographicCamera camera;
	public static XmlReader reader;
	public static Element root;
	
	@Override
	public void create () 
	{
		batch = new SpriteBatch();
		camera = new OrthographicCamera(800, 600);
		viewport = new StretchViewport(800, 600, camera);
		
		reader = new XmlReader();
		try {
			root = reader.parse(new FileHandle("config.xml"));
		} catch (IOException ex) {
			Gdx.app.log("Heroic", "Can´t load config.xml! Exception: " + ex.getMessage());
		}
		
		setScreen(new MainMenu(this));
		
	}

	@Override
	public void render () 
	{
		Gdx.gl.glClearColor(1f, 1f, 1f, 1f);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		
		super.render();
	}
	
}
