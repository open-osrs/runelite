package netscape.javascript;

import java.applet.Applet;
import netscape.javascript.JSException;
import netscape.javascript.JSObject;

@SuppressWarnings("deprecation")
public interface JSObjectProvider {
	/**
	 * Return a JSObject for the window containing the given applet.
	 * Implementations of this class should return null if not connected to a
	 * browser, for example, when running in AppletViewer.
	 *
	 * @param applet The applet.
	 * @return JSObject for the window containing the given applet or null if we
	 * are not connected to a browser.
	 * @throws JSException when an error is encountered.
	 */
	public JSObject getWindow(Applet applet) throws JSException;
}