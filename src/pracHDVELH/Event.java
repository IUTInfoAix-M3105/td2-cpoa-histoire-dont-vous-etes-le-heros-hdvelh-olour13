/**
 * File: NodeMultipleEvents.java
 * Creation: 7 nov. 2020, Jean-Philippe.Prost@univ-amu.fr
 * Template étudiants
 */
package pracHDVELH;
import java.net.IDN;
import java.util.Scanner;

import jdk.jfr.Unsigned;
import myUtils.ErrorNaiveHandler;
import org.w3c.dom.Node;

/**
 * @author prost
 * @contributor LOURGUI Ousama
 */
public class Event extends NodeMultiple {
	public static final String ERROR_MSG_UNEXPECTED_END = "Sorry, for some unexpected reason the story ends here...";
	public static final String PROMPT_ANSWER = "Answer: ";
	public static final String WARNING_MSG_INTEGER_EXPECTED = "Please input a integer within range!";

	private Scanner Scan;
	private GUIManager gui;
	private int id;
	private int chosenPath;
	private String answer;

	public Event () {
		this.gui = new GUIManager();
		this.id= nextId++;
	}
	public Event (GUIManager gui, String data) {
		super(data);
		this.gui = gui;
		id = ++lastId;
		chosenPath = -1;
	}

	/**
	 * @return the answer
	 */
	public String getAnswer() {
		return answer;
	}

	/**
	 * @param answer the answer to set
	 */
	public void setAnswer(String answer) {

		this.answer = answer;
	}

	/**
	 * @return the reader
	 */
	public Scanner getReader() {
		return this.Scan;
	}

	/**
	 * @param reader the reader to set
	 */
	public void setReader(Scanner reader) {
		this.Scan = reader;
	}

	/**
	 * @return the chosenPath
	 */
	public int getChosenPath() {
		return this.chosenPath;
	}

	/**
	 * @param chosenPath the chosenPath to set
	 */
	public void setChosenPath(int chosenPath) {
		this.chosenPath = chosenPath;
	}

	/* Methods */
	/**
	 * @see pracHDVELH.NodeMultiple#getData()
	 */
	public String getData() {
		if (super.getData() != null)
			return (String) super.getData();
		return null;
	}

	/**
	 * @see pracHDVELH.NodeMultiple#setData(Object)
	 * @param data
	 */
	public void setData(String data) {
		super.setData(data);
	}

	/**
	 * @see pracHDVELH.NodeMultiple#getDaughter(int)
	 */
	public Event getDaughter(int i) {
		return (Event) super.getDaughter(i);
	}

	/**
	 * @see pracHDVELH.NodeMultiple#setDaughter(NodeMultiple, int)
	 * @param daughter
	 * @param i
	 */
	public void setDaughter(Event daughter, int i) {
		super.setDaughter(daughter, i);
	}

	/**
	 * @return the gui
	 */
	public GUIManager getGui() {
		return this.gui;
	}

	/**
	 * @param gui the gui to set
	 */
	public void setGui(GUIManager gui) {
		this.gui = gui;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return this.getId();
	}
}

// eof