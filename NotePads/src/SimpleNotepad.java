
public class SimpleNotepad extends Page implements INotepad{

	
	private int howManyPages;
	private Page[] pages = new Page [howManyPages];
	
	
	SimpleNotepad (int howManyPages){
		
		if (howManyPages >0){
			this.howManyPages = howManyPages;
		}else{
			System.out.println("Enter a valid number!");
		}
	}
	
	
	@Override
	public void overriteTextAtPage(String newText, int pageNumber) {
		
		if (newText !=null){
			deleteTextAtPage(pageNumber);
			addText(newText);
		}
	}

	@Override
	public void lookAtAllPages() {
		
		for (int index =0; index <this.pages.length; index++){
			
			lookAtAPage (pages[index]);
		}		
	}	
	
	public void deleteTextAtPage(int pageNumber){
		
		pages[pageNumber].deleteText();
				
	}	
}
