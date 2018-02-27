package blocksAndDocsLibrary;

public class DefaultBlock {

	private String titleText = "";
	private String cardText = "";
	private String author = "";
	private String sourceURL = "";
	
	public DefaultBlock() {
		titleText = "Default";
		cardText = "This is the default text.";
		author = "Albert Liu";
		sourceURL = "google.com";
	}
	
	public String getTitleText() {return titleText;}
	public String getCardText() {return cardText;}
	public String getAuthor() {return author;}
	public String getURL() {return sourceURL;}
	
	public void setTitleText(String text) {titleText = text;}
	public void setCardText(String text) {cardText = text;}
	public void setAuthor(String text) {author = text;}
	public void setURL(String text) {sourceURL = text;}
	
	public String toString() {
		return titleText + "\n" + author + "\n" + cardText + "\n" + sourceURL;
	}
}
