package com.lec.board.common;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class SearchVO extends PagingVO {
	
	private String searchWord;
	private String searchType;
	private String searchCategory;

	public String getSearchWord() {
		return searchWord;
	}

	public void setSearchWord(String searchWord) {
		this.searchWord = searchWord;
	}

	public String getSearchType() {
		return searchType;
	}

	public void setSearchType(String searchType) {
		this.searchType = searchType;
	}

	public String getSearchCategory() {
		return searchCategory;
	}

	public void setSearchCategory(String searchCategory) {
		this.searchCategory = searchCategory;
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE);
	}
}
