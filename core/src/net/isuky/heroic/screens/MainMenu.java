package net.isuky.heroic.screens;

import net.isuky.heroic.Heroic;
import net.isuky.heroic.screens.control.MainMenuControl;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.files.FileHandle;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Pixmap;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;
import com.badlogic.gdx.scenes.scene2d.ui.TextButton;
import com.badlogic.gdx.utils.XmlReader;
import com.badlogic.gdx.utils.XmlReader.Element;


public class MainMenu implements Screen
{
	
	private Stage stage;
	private Skin skin;
	
	
	private String singleplayerBtnStr;
	
	private TextButton singleplayerButton,
					   multiplayerButton,
					   optionsButton,
					   creditsButton,
					   endButton;
	
	private Game game;
	
	public String lang;
	
	public XmlReader mainMenuReader;
	public Element mainMenuRoot;
	
	public MainMenu(Game ggame)
	{
		this.game = ggame;
	}
	
	@Override
	public void show()
	{
		createMainMenuXmlReader();
		
		stage = new Stage(Heroic.viewport);
		Gdx.input.setInputProcessor(stage);// Make the stage consume events
		 
		//Initializes the Basic Skin
        initBasicSkin();
        
        //Initializes the Buttons
        initMainMenuButtons();
		
        //Sets the Input Processor to stage
		Gdx.input.setInputProcessor(stage);
	}

	@Override
	public void render(float delta)
	{
		Gdx.gl.glClearColor(0f, 0f, 0f, 1f);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		
		stage.act(delta);
		stage.draw();
	
		
		Heroic.batch.setProjectionMatrix(Heroic.camera.combined);
		Heroic.batch.begin();
		{
			
		}
		Heroic.batch.end();
	}

	@Override
	public void resize(int width, int height) 
	{	
	}

	@Override
	public void pause() 
	{
	}

	@Override
	public void resume() 
	{
	}

	@Override
	public void hide() 
	{
	}

	@Override
	public void dispose()
	{
		stage.dispose();
		skin.dispose();
	}
	
	/**
	 * Creates the Buttons for the MainMenu
	 * */
	private void initMainMenuButtons()
	{
		MainMenuControl.addSingleplayerButton(this, singleplayerButton, skin, game, stage);
		MainMenuControl.addMultiplayerButton(this, multiplayerButton, skin, stage);
		MainMenuControl.addSettingsButton(this,optionsButton, skin, stage);
        MainMenuControl.addCreditsButton(this,creditsButton, skin, stage);
        MainMenuControl.addCloseButton(this,endButton, skin, stage); 
	}
	
	/**
	 * Initializes the Basic Skin for the Buttons
	 * */
	private void initBasicSkin()
	{
		  //Create a font
		  BitmapFont font = new BitmapFont();
		  skin = new Skin();
		  skin.add("default", font);
		 
		  //Create a texture
		  Pixmap pixmap = new Pixmap((int)Gdx.graphics.getWidth()/8, (int)Gdx.graphics.getHeight()/10, Pixmap.Format.RGB888);
		  pixmap.setColor(Color.WHITE);
		  pixmap.fill();
		  skin.add("background",new Texture(pixmap));
		 
		  //Create a button style
		  TextButton.TextButtonStyle textButtonStyle = new TextButton.TextButtonStyle();
		  textButtonStyle.up = skin.newDrawable("background", Color.GRAY);
		  textButtonStyle.down = skin.newDrawable("background", Color.DARK_GRAY);
		  textButtonStyle.over = skin.newDrawable("background", Color.LIGHT_GRAY);
		  textButtonStyle.font = skin.getFont("default");
		  skin.add("default", textButtonStyle);
	}
	
	/**
	 * Creates the XmlReader for the MainMenu to support multiple Languages
	 * */
	private void createMainMenuXmlReader()
	{
		mainMenuReader = new XmlReader();
		
		try
		{
			mainMenuRoot = mainMenuReader.parse(new FileHandle("lang/buttons/mainmenu/mainMenuLang.xml"));
		}catch(Exception ex)
		{
			Gdx.app.log("MainMenu", "Can´t load lang/buttons/mainmenu/mainMenuLang.xml! Exception: " + ex.getMessage());
		}
	}

}
