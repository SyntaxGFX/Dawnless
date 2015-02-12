package net.isuky.dawnless.utils;

import com.badlogic.gdx.Gdx;

import net.isuky.dawnless.Dawnless;

public class CheckLang 
{
	/**
	 * Returns the Language witch is stored in the config.xml
	 * @return
	 */
	public static String check()
	{
		String lang;
		lang = Dawnless.root.get("lang");
		
		return lang;
	}
}
