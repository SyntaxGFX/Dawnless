package net.isuky.heroic.player;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.math.Vector2;

public class Player 
{
	
	private float x,y;
	private Vector2 playerVec;
	private Texture playerTex;
	private Sprite playerSpr;
	
	public Player(float x, float y)
	{
		this.x = x;
		this.y = y;
	}
	
	public Player(Vector2 playerVec)
	{
		this.playerVec = playerVec;
	}
	
	/**
	 * Initializes the Player
	 * */
	public void initialize()
	{
		
	}
	
	/**
	 * Loads all the Player Content(Textures, Sounds etc..)
	 * */
	public void loadContent()
	{
		//load tex here
	}
	
	/**
	 * Disposes all the Content of the Player
	 * */
	public void dispose()
	{
		
	}
	
	/**
	 * Updates the Player
	 * */
	public void update(float delta)
	{
		
	}
	
	/**
	 * Renders the Player
	 * */
	public void render(float delta)
	{
		
	}
	
	/**
	 * Gets the Position of the Player on the X-Axis
	 **/
	public float getPosX()
	{
		return x;
	}
	
	/**
	 * Gets the Position of the Player on the Y-Axis
	 **/	
	public float getPosY()
	{
		return y;
	}
	
	/**
	 * Gets the Position of the Player as a Vector2 (com.badlogic.gdx.math.Vector2)
	 **/
	public Vector2 getPosition()
	{
		return playerVec;
	}
}
