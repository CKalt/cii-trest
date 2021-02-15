package com.cii.question;


public abstract class MultipleSelectionAnswer extends Answer {
	int[] selectedIds;

	public int[] getSelectedIds() {
		return selectedIds;
	}

	public void setSelectedIds(int[] selectedIds) {
		this.selectedIds = selectedIds;
	}
}
