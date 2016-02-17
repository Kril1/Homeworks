
public class Page implements Modifiable {

	String titleOfPage;
	StringBuilder textOnPage;

	@Override
	public void addText(String string) {

		if (string == null) {
			System.out.println("Enter a valid text");
		} else {
			this.textOnPage.append(" " + string);
		}
	}

	@Override
	public void deleteText() {

		this.textOnPage.delete(0, this.textOnPage.length());

	}

	void lookAtAPage(Page page) {

		System.out.println(titleOfPage);
		System.out.println(textOnPage);

	}

}
