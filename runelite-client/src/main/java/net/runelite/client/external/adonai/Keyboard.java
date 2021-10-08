package net.runelite.client.external.adonai;

import java.awt.*;
import java.util.Random;

import static java.awt.event.KeyEvent.*;

public class Keyboard
{
	private Robot robot;
	private Random rand;
	public final static char LEFT_ARROW_KEY = 'à';
	public final static char RIGHT_ARROW_KEY = 'á';
	public final static char UP_ARROW_KEY = 'û';
	public final static char DOWN_ARROW_KEY = 'ü';
	public final static char ALT_KEY = '\f';

	public Keyboard() throws AWTException
	{
		this.robot = new Robot();
		this.rand = new Random();
	}

	public Keyboard(Robot robot)
	{
		this.robot = robot;
	}

	public void type(CharSequence characters) throws InterruptedException
	{
		int length = characters.length();
		for (int i = 0; i < length; i++)
		{
			char character = characters.charAt(i);
			type(character);
			Thread.sleep(rand.nextInt(25));
		}
	}

	public void type(char character)
	{
		switch (character)
		{
			case 'a':
				doType(VK_A);
				break;
			case 'b':
				doType(VK_B);
				break;
			case 'c':
				doType(VK_C);
				break;
			case 'd':
				doType(VK_D);
				break;
			case 'e':
				doType(VK_E);
				break;
			case 'f':
				doType(VK_F);
				break;
			case 'g':
				doType(VK_G);
				break;
			case 'h':
				doType(VK_H);
				break;
			case 'i':
				doType(VK_I);
				break;
			case 'j':
				doType(VK_J);
				break;
			case 'k':
				doType(VK_K);
				break;
			case 'l':
				doType(VK_L);
				break;
			case 'm':
				doType(VK_M);
				break;
			case 'n':
				doType(VK_N);
				break;
			case 'o':
				doType(VK_O);
				break;
			case 'p':
				doType(VK_P);
				break;
			case 'q':
				doType(VK_Q);
				break;
			case 'r':
				doType(VK_R);
				break;
			case 's':
				doType(VK_S);
				break;
			case 't':
				doType(VK_T);
				break;
			case 'u':
				doType(VK_U);
				break;
			case 'v':
				doType(VK_V);
				break;
			case 'w':
				doType(VK_W);
				break;
			case 'x':
				doType(VK_X);
				break;
			case 'y':
				doType(VK_Y);
				break;
			case 'z':
				doType(VK_Z);
				break;
			case 'A':
				doType(VK_SHIFT, VK_A);
				break;
			case 'B':
				doType(VK_SHIFT, VK_B);
				break;
			case 'C':
				doType(VK_SHIFT, VK_C);
				break;
			case 'D':
				doType(VK_SHIFT, VK_D);
				break;
			case 'E':
				doType(VK_SHIFT, VK_E);
				break;
			case 'F':
				doType(VK_SHIFT, VK_F);
				break;
			case 'G':
				doType(VK_SHIFT, VK_G);
				break;
			case 'H':
				doType(VK_SHIFT, VK_H);
				break;
			case 'I':
				doType(VK_SHIFT, VK_I);
				break;
			case 'J':
				doType(VK_SHIFT, VK_J);
				break;
			case 'K':
				doType(VK_SHIFT, VK_K);
				break;
			case 'L':
				doType(VK_SHIFT, VK_L);
				break;
			case 'M':
				doType(VK_SHIFT, VK_M);
				break;
			case 'N':
				doType(VK_SHIFT, VK_N);
				break;
			case 'O':
				doType(VK_SHIFT, VK_O);
				break;
			case 'P':
				doType(VK_SHIFT, VK_P);
				break;
			case 'Q':
				doType(VK_SHIFT, VK_Q);
				break;
			case 'R':
				doType(VK_SHIFT, VK_R);
				break;
			case 'S':
				doType(VK_SHIFT, VK_S);
				break;
			case 'T':
				doType(VK_SHIFT, VK_T);
				break;
			case 'U':
				doType(VK_SHIFT, VK_U);
				break;
			case 'V':
				doType(VK_SHIFT, VK_V);
				break;
			case 'W':
				doType(VK_SHIFT, VK_W);
				break;
			case 'X':
				doType(VK_SHIFT, VK_X);
				break;
			case 'Y':
				doType(VK_SHIFT, VK_Y);
				break;
			case 'Z':
				doType(VK_SHIFT, VK_Z);
				break;
			case '`':
				doType(VK_BACK_QUOTE);
				break;
			case '0':
				doType(VK_0);
				break;
			case '1':
				doType(VK_1);
				break;
			case '2':
				doType(VK_2);
				break;
			case '3':
				doType(VK_3);
				break;
			case '4':
				doType(VK_4);
				break;
			case '5':
				doType(VK_5);
				break;
			case '6':
				doType(VK_6);
				break;
			case '7':
				doType(VK_7);
				break;
			case '8':
				doType(VK_8);
				break;
			case '9':
				doType(VK_9);
				break;
			case '-':
				doType(VK_MINUS);
				break;
			case '=':
				doType(VK_EQUALS);
				break;
			case '~':
				doType(VK_SHIFT, VK_BACK_QUOTE);
				break;
			case '!':
				doType(VK_EXCLAMATION_MARK);
				break;
			case '@':
				doType(VK_AT);
				break;
			case '#':
				doType(VK_NUMBER_SIGN);
				break;
			case '$':
				doType(VK_DOLLAR);
				break;
			case '%':
				doType(VK_SHIFT, VK_5);
				break;
			case '^':
				doType(VK_CIRCUMFLEX);
				break;
			case '&':
				doType(VK_AMPERSAND);
				break;
			case '*':
				doType(VK_ASTERISK);
				break;
			case '(':
				doType(VK_LEFT_PARENTHESIS);
				break;
			case ')':
				doType(VK_RIGHT_PARENTHESIS);
				break;
			case '_':
				doType(VK_UNDERSCORE);
				break;
			case '+':
				doType(VK_PLUS);
				break;
			case '\t':
				doType(VK_TAB);
				break;
			case '\n':
				doType(VK_ENTER);
				break;
			case '[':
				doType(VK_OPEN_BRACKET);
				break;
			case ']':
				doType(VK_CLOSE_BRACKET);
				break;
			case '\\':
				doType(VK_BACK_SLASH);
				break;
			case '{':
				doType(VK_SHIFT, VK_OPEN_BRACKET);
				break;
			case '}':
				doType(VK_SHIFT, VK_CLOSE_BRACKET);
				break;
			case '|':
				doType(VK_SHIFT, VK_BACK_SLASH);
				break;
			case ';':
				doType(VK_SEMICOLON);
				break;
			case ':':
				doType(VK_COLON);
				break;
			case '\'':
				doType(VK_QUOTE);
				break;
			case '"':
				doType(VK_QUOTEDBL);
				break;
			case ',':
				doType(VK_COMMA);
				break;
			case '<':
				doType(VK_SHIFT, VK_COMMA);
				break;
			case '.':
				doType(VK_PERIOD);
				break;
			case '>':
				doType(VK_SHIFT, VK_PERIOD);
				break;
			case '/':
				doType(VK_SLASH);
				break;
			case '?':
				doType(VK_SHIFT, VK_SLASH);
				break;
			case ' ':
				doType(VK_SPACE);
				break;
			case ALT_KEY:
				doType(VK_ALT);
				break; // ALT KEY
			case LEFT_ARROW_KEY:
				doType(VK_LEFT);
				break;
			case RIGHT_ARROW_KEY:
				doType(VK_RIGHT);
				break;
			case UP_ARROW_KEY:
				doType(VK_UP);
				break;
			case DOWN_ARROW_KEY:
				doType(VK_DOWN);
				break;
			default:
				throw new IllegalArgumentException("Cannot type character " + character);
		}
	}

	private void doType(int... keyCodes)
	{
		doType(keyCodes, 0, keyCodes.length);
	}

	private void doType(int[] keyCodes, int offset, int length)
	{
		if (length == 0)
		{
			return;
		}

		robot.keyPress(keyCodes[offset]);
		doType(keyCodes, offset + 1, length - 1);
		robot.keyRelease(keyCodes[offset]);
	}
}
