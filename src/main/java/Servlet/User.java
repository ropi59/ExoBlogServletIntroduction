package Servlet;

public class User {

	//attributs
	private String username;
	private int nbArticle;
	private String email;
	private boolean admin;
	
	/**User's constructor
	 * 
	 * @param username name of user
	 * @param nbArticle number of articles post by user
	 * @param email email of user
	 * @param admin true if user is admin
	 */
	public User (String username, int nbArticle, String email, boolean admin) {
		this.username = username;
		this.nbArticle = nbArticle;
		this.email = email;
		this.admin = admin;
	}

	//getters & setters
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public int getNbArticle() {
		return nbArticle;
	}

	public void setNbArticle(int nbArticle) {
		this.nbArticle = nbArticle;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public boolean isAdmin() {
		return admin;
	}

	public void setAdmin(boolean admin) {
		this.admin = admin;
	}
	
}
