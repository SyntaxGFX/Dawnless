package net.isuky.heroic.screens.control;

import net.isuky.heroic.Heroic;
import net.isuky.heroic.screens.MainMenu;
import net.isuky.heroic.screens.PlayScreen;
import net.isuky.heroic.utils.CheckLang;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;
import com.badlogic.gdx.scenes.scene2d.ui.TextButton;
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;

public class MainMenuControl 
{
	/**
	 * Creates the Singleplayer button for the MainMenu
	 * 
	 * @param mmScr
	 * @param singleplayerButton 
	 * @param skin
	 * @param game
	 * @param stage
	 * */
	public static void addSingleplayerButton(final MainMenu mmScr, TextButton singleplayerButton, Skin skin, final Game game, Stage stage)
	{
		String btnStr = null;
		
		if(CheckLang.check().equals("ENGLISH"))
		{
			btnStr = mmScr.mainMenuRoot.get("singleplayerEng");
		}
		
		if(CheckLang.check().equals("GERMAN"))
		{
			btnStr = mmScr.mainMenuRoot.get("singleplayerGer");
		}

        singleplayerButton = new TextButton(btnStr, skin);
        singleplayerButton.setPosition(Gdx.graphics.getWidth()/2.7f - Gdx.graphics.getWidth()/8 , Gdx.graphics.getHeight()/2);
        
        singleplayerButton.addListener( new ClickListener() 
        {              
            @Override
            public void clicked(InputEvent event, float x, float y) 
            {
               	game.setScreen(new PlayScreen(game));
               	mmScr.dispose();
            };
        });
        
        stage.addActor(singleplayerButton);
		
		
	}
	
	/**
	 * Creates the Multiplayer button for the MainMenu
	 * @param multiplayerButton
	 * @param skin
	 * @param stage
	 */
	public static void addMultiplayerButton(MainMenu mmScr,TextButton multiplayerButton, Skin skin, Stage stage)
	{
		String btnStr = null;
		
		if(CheckLang.check().equals("ENGLISH"))
		{
			btnStr = mmScr.mainMenuRoot.get("multiplayerEng");
		}
		
		if(CheckLang.check().equals("GERMAN"))
		{
			btnStr = mmScr.mainMenuRoot.get("multiplayerGer");
		}
		
        multiplayerButton = new TextButton(btnStr, skin);
        multiplayerButton.setPosition(Gdx.graphics.getWidth()/2.7f - Gdx.graphics.getWidth()/8 , Gdx.graphics.getHeight()/2.6f);
        
        multiplayerButton.addListener( new ClickListener() 
        {              
            @Override
            public void clicked(InputEvent event, float x, float y) 
            {
               	System.out.println("pressed");
            };
        });
        
        stage.addActor(multiplayerButton);
	}
	
	/**
	 * Creates the Settings button for the MainMenu
	 * @param optionsButton
	 * @param skin
	 * @param stage
	 */
	public static void addSettingsButton(MainMenu mmScr,TextButton optionsButton, Skin skin, Stage stage)
	{
		String btnStr = null;
		
		if(CheckLang.check().equals("ENGLISH"))
		{
			btnStr = mmScr.mainMenuRoot.get("settingsEng");
		}
		
		if(CheckLang.check().equals("GERMAN"))
		{
			btnStr = mmScr.mainMenuRoot.get("settingsGer");
		}
		
        optionsButton = new TextButton(btnStr, skin);
        optionsButton.setPosition(Gdx.graphics.getWidth()/2.7f - Gdx.graphics.getWidth()/8 , Gdx.graphics.getHeight()/3.7f);
        
        optionsButton.addListener( new ClickListener() 
        {              
            @Override
            public void clicked(InputEvent event, float x, float y) 
            {
               	System.out.println("pressed");
            };
        });
        
        stage.addActor(optionsButton);
	}
	
	/**
	 * Creates the Credits button for the MainMenu
	 * @param creditsButton
	 * @param skin
	 * @param stage
	 */
	public static void addCreditsButton(MainMenu mmScr,TextButton creditsButton, Skin skin, Stage stage)
	{
		String btnStr = null;
		
		if(CheckLang.check().equals("ENGLISH"))
		{
			btnStr = mmScr.mainMenuRoot.get("creditsEng");
		}
		
		if(CheckLang.check().equals("GERMAN"))
		{
			btnStr = mmScr.mainMenuRoot.get("creditsGer");
		}
        creditsButton = new TextButton(btnStr, skin);
        creditsButton.setPosition(Gdx.graphics.getWidth() / 2.7f - Gdx.graphics.getWidth() / 8 , Gdx.graphics.getHeight() / 6.5f);
        
        creditsButton.addListener( new ClickListener() 
        {              
            @Override
            public void clicked(InputEvent event, float x, float y) 
            {
               	System.out.println("pressed");
            };
        });
        
        stage.addActor(creditsButton);
	}
	
	/**
	 * Creates the Close button for the MainMenu
	 * @param endButton
	 * @param skin
	 * @param stage
	 */
	public static void addCloseButton(MainMenu mmScr,TextButton endButton, Skin skin, Stage stage)
	{
		String btnStr = null;
		
		if(CheckLang.check().equals("ENGLISH"))
		{
			btnStr = mmScr.mainMenuRoot.get("closeEng");
		}
		
		if(CheckLang.check().equals("GERMAN"))
		{
			btnStr = mmScr.mainMenuRoot.get("closeGer");
		}
        endButton = new TextButton(btnStr, skin);
        endButton.setPosition(Gdx.graphics.getWidth()/2.7f - Gdx.graphics.getWidth()/8 , Gdx.graphics.getHeight()/28f);
        
        endButton.addListener( new ClickListener() 
        {              
            @Override
            public void clicked(InputEvent event, float x, float y) 
            {
               	Gdx.app.exit();
            };
        });
        
        stage.addActor(endButton);
	}
}
