
public class PaginationHelper {

	public Object[] items = null;
	public int itemSizePerPage = 0;
	int countTotalPages = 0;

	// take in an array of values and an integer indicating how many items will be
	// allowed per each page.
	public PaginationHelper(Object[] items, int itemSizePerPage) {
		this.items = items;
		this.itemSizePerPage = itemSizePerPage;
		countTotalPages = this.items.length / itemSizePerPage;
	}

	// returns the number of items within the entire collection
	public int itemCount() {

		return this.items.length;
	}

	// returns the number of pages
	public int pageCount() {
		int countTotalPages = (this.items.length / this.itemSizePerPage)+1;
		return countTotalPages;
	}

	// returns the number of items on the given page. Page numbers start from 0.
	// invalid page numbers returns -1
	public int pageItemCount(int pageNumber) {
		if (items.length == 0 || pageNumber > countTotalPages) {
			return -1;

		} else if (countTotalPages > pageNumber) {

			return itemSizePerPage;
		} else {
			return items.length % itemSizePerPage;
		}
	}

	// pageIndex takes an item's index number and returns the page number that it belongs
	// on. invalid index numbers returns -1.

	public int pageIndex(int indexNumberOfItem) {

		if (indexNumberOfItem > items.length) {

			return -1;

		} else if (indexNumberOfItem<0){
			return -1;
			
		}else {
	
			return indexNumberOfItem / itemSizePerPage;
		}
	}

}
