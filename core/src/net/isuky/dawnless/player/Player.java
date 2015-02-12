/**
 * A Class wich handles the Player
 * 
 * @author Alexander Chabowski
 * */

package net.isuky.dawnless.player;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Animation;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.math.Vector2;

public class Player implements PlayerType
{
	//Player position
	private float x,y;
	private Vector2 playerVec;
	
	//Player texture and Sprite
	private Texture playerTex;
	private Sprite playerSpr;
	
	//Rows and Collums of the SpriteSheet
	private int FRAME_ROWS,
				FRAME_COLS;
	
	//Animations
	private Animation idle,
					  walk,
					  attack;
	
	/*
	 * The stateTime is the number of seconds elapsed from the start of the animation
	 * This is used to determine the state of the animation
	 *  It is a simple accumulator based on which the animation knows when to change to the next state
	 **/
	private float stateTime;
	
	
	private Type playerType;
	
	public Player(float x, float y)
	{
		this.x = x;
		this.y = y;
	}
	
	public Player(Vector2 playerVec)
	{
		this.playerVec = playerVec;
		this.x = playerVec.x;
		this.y = playerVec.y;
	}
	
	/**
	 * Initializes the Player
	 * */
	public void initialize()
	{
		FRAME_COLS = 0;
		FRAME_ROWS = 0;
		
		playerType = PlayerType.Type.none;
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
	
	private void initAnimations()
	{
		if(playerType.equals(PlayerType.Type.Archer)){}
		if(playerType.equals(PlayerType.Type.Assassine)){}
		if(playerType.equals(PlayerType.Type.Elve)){}
		if(playerType.equals(PlayerType.Type.Lynx)){}
		if(playerType.equals(PlayerType.Type.Mage)){}
		if(playerType.equals(PlayerType.Type.none)){}
		if(playerType.equals(PlayerType.Type.Orc)){}
		if(playerType.equals(PlayerType.Type.Paladin)){}
		if(playerType.equals(PlayerType.Type.Skeleton)){}
		if(playerType.equals(PlayerType.Type.Slave)){}
		if(playerType.equals(PlayerType.Type.Thief)){}
		if(playerType.equals(PlayerType.Type.Warrior)){}
		if(playerType.equals(PlayerType.Type.Wolf)){}

	}
}
