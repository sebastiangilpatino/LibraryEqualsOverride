package SEP2;

public abstract class LendingItem {
	private int numCopiesInLib;

	public int getNumCopiesInLib() {
		return numCopiesInLib;
	}

	public void setNumCopiesInLib(int numCopiesInLib) {
		this.numCopiesInLib = numCopiesInLib;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + numCopiesInLib;
		return result;
	}

	@Override
	public abstract boolean equals(Object obj);

}
