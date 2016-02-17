

public class SecuredNotepad extends SimpleNotepad {

	
	private int howManyPages;
	private Page[] pages = new Page [howManyPages];
	private String password;
	
	SecuredNotepad(int howManyPages, String password) {
		super(howManyPages);
		
		if (password != null && password.length() > 0 && password.length() < 12){
			this.password = password;
		}else{
			System.out.println("Enter a valid password!");
		}
	}
	
	
	public void overriteTextAtPage(String newText, int pageNumber, String password) {
		
		if (this.password == password){
			overriteTextAtPage(newText, pageNumber);
		}
	}

	
	public void lookAtAllPages(String password) {
		
		if (this.password == password){
			lookAtAllPages();
		}
	}	
	
	public void deleteTextAtPage(int pageNumber, String password){
		
		if (this.password == password){
			deleteTextAtPage(pageNumber);
		}				
	}


	public Page[] getPages() {
		return pages;
	}


	public void setPages(Page[] pages) {
		this.pages = pages;
	}	
}


