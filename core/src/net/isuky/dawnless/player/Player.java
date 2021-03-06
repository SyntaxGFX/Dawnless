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
	private PlayerAnimations playerAnimations;
	
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
		
		playerAnimations = new PlayerAnimations();
		
		playerType = PlayerType.Type.Archer;
		
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
		animateCurrentPlayerType();
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
	/**
	 * 
	 * Checks and animates the current Type of the Player
	 * */
	private void animateCurrentPlayerType()
	{
		switch(playerType)
		{
		case Archer:
			playerAnimations.animateArcher();
			break;
		case Assassine:
			break;
		case Elve:
			break;
		case Lynx:
			break;
		case Mage:
			break;
		case Orc:
			break;
		case Paladin:
			break;
		case Skeleton:
			break;
		case Slave:
			break;
		case Thief:
			break;
		case Warrior:
			break;
		case Wolf:
			break;
		case none:
			break;
		default:
			break;
		}
	}
}
