package SEP2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Admin {
	// Returns phone numbers (in sorted order) of the Library Members who have ever
	// checked out the specified lending item
	public static List<String> getPhoneNums(LibraryMember[] members, LendingItem item) {
		List<String> phoneNums = new ArrayList<>();

		for (int i = 0; i < members.length; i++) {
			for (int j = 0; j < members[i].getCheckOutRecord().getCheckoutEntryList().size(); j++) {
				if (members[i].getCheckOutRecord().getCheckoutEntryList().get(j).getLendingItem().equals(item)) {
					phoneNums.add(members[i].getPhone());
				}
			}
		}

		Collections.sort(phoneNums);
		return phoneNums;
	}
}
