package SEP2;

import java.util.ArrayList;
import java.util.List;

public class CheckoutRecord {
	private List<CheckoutRecordEntry> checkoutEntryList;

	public CheckoutRecord() {
		checkoutEntryList = new ArrayList<CheckoutRecordEntry>();
	}

	public void addCheckoutEntry(CheckoutRecordEntry entry) {
		checkoutEntryList.add(entry);
	}

	public List<CheckoutRecordEntry> getCheckoutEntryList() {
		return checkoutEntryList;
	}

}
