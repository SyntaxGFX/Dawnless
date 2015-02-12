package net.isuky.heroic.desktop;

import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;

import net.isuky.heroic.Dawnless;

import org.xml.sax.SAXException;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.badlogic.gdx.files.FileHandle;
import com.badlogic.gdx.utils.XmlReader;
import com.badlogic.gdx.utils.XmlReader.Element;

public class DesktopLauncher 
{
	public static void main (String[] arg) throws ParserConfigurationException, SAXException, IOException
	{

		XmlReader reader = new XmlReader();
		Element root = reader.parse(new FileHandle("config.xml"));
		
		
		System.out.println("[Engine] ResX: " + root.getInt("res_w"));
		System.out.println("[Engine] ResY: " + root.getInt("res_h"));
		System.out.println("[Engine] Fullscreen: " +  root.getBoolean("fullscreen"));
		System.out.println("[Engine] Resizeable: " +  root.getBoolean("resizeable"));
		System.out.println("[Engine] Foreground FPS: " +  root.getInt("ffps"));
		System.out.println("[Engine] Background FPS: " +  root.getInt("bfps"));
		
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.width = root.getInt("res_w");
		config.height = root.getInt("res_h");
		config.resizable = root.getBoolean("resizeable");
		config.fullscreen = root.getBoolean("fullscreen");
		config.foregroundFPS = root.getInt("ffps");
		config.backgroundFPS = root.getInt("bfps");
		config.title = root.get("title");
		
		new LwjglApplication(new Dawnless(), config);
	}
}
