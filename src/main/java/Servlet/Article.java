package Servlet;

public class Article {

	private String title;
	private String content;
	
	
	/**Article constructor
	 * 
	 * @param title the article title
	 * @param content the content of the article
	 */
	public Article (String title, String content) {
		this.title = title;
		this.content = content;
	}

	//getters & setters
	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getContent() {
		return content;
	}


	public void setContent(String content) {
		this.content = content;
	}
	
	
}
