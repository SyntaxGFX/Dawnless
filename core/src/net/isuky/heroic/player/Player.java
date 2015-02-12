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
	
	
	public void initialize()
	{
		
	}
	
	public void loadContent()
	{
		//load tex here
	}
	
	public void dispose()
	{
		
	}
	
	public void update(float delta)
	{
		
	}
	
	public void render(float delta)
	{
		
	}
	
	public float getPosX()
	{
		return x;
	}
	
	public float getPosY()
	{
		return y;
	}
	
	public Vector2 getPosition()
	{
		return playerVec;
	}
}
