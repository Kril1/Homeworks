
public interface INotepad extends Modifiable {

	void overriteTextAtPage (String newText, int pageNumber);
	void lookAtAllPages ();
	void deleteTextAtPage(int pageNumber);
	
}
