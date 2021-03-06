package am.org.game.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;

import am.org.game.ChupaChupGame;
import am.org.game.resources.InitDataResource;

public class DesktopLauncher {
	public static void main (String[] arg) {
		ChupaChupGame listener = new ChupaChupGame();
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.width = InitDataResource.WIDTH;
		config.height = InitDataResource.HEIGHT;
		config.fullscreen = true;
		config.vSyncEnabled = true;
		config.resizable = false;
		new LwjglApplication(listener, config);
	}
}