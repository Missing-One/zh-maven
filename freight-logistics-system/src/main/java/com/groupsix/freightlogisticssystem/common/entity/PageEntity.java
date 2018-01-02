package com.groupsix.freightlogisticssystem.common.entity;

/**
 * 分页工具
 * 默认一页显示8行数据
 * 需要提供页面总数量
 * @author zh
 */
public class PageEntity {
	private long pageSize;				//显示的数量
	private long totalCount;			//数据的总数
	private long currentPageNo;			//当前页码
	private long currentPageNoIndex;	//当前页码的下标
	private long totalPageCount;		//页面的总数，多少页
	
	public PageEntity() {
		this(0);
	}

	/**
	 * 默认一页显示8行数据
	 * 需要提供页面总数量
	 */
	public PageEntity(long totalCount) {
		super();
		this.pageSize = 8;
		setCurrentPageNo(1);
		setTotalCount(totalCount);
	}
	
	
	public long getPageSize() {
		return pageSize;
	}

	public void setPageSize(long pageSize) {
		this.pageSize = pageSize;
	}

	public long getTotalCount() {
		return totalCount;
	}
	
	public void setTotalCount(long totalCount) {
		this.totalCount = totalCount < 0 ? 0 : totalCount;
		
		setTotalPageCount((totalCount % pageSize) > 0
							? (totalCount / pageSize) +1
							: totalCount / pageSize);
		
		setCurrentPageNoIndex((currentPageNo > 0 && currentPageNo <= totalPageCount)
				? (currentPageNo-1) * pageSize
				: (currentPageNo < 0 ) ? 0 : (totalPageCount-1) * pageSize);
		
	}
	
	public long getCurrentPageNo() {
		return currentPageNo;
	}
	
	public void setCurrentPageNo(long currentPageNo) {
		
		this.currentPageNo = (currentPageNo < 1) 
							? 1 
							: (currentPageNo > totalPageCount)
											? totalPageCount 
											: currentPageNo;
		
		
	}
	
	public void setCurrentPageNo(String currentPageNo) {
		try {
			setCurrentPageNo(Long.parseLong(currentPageNo));
		}catch (NumberFormatException e) {
			System.err.println("设置页码出错：" + e);
		}
	}
	
	public long getCurrentPageNoIndex() {
		return currentPageNoIndex;
	}
	
	private void setCurrentPageNoIndex(long currentPageNoIndex) {
		this.currentPageNoIndex = currentPageNoIndex < 0 ? 0 : currentPageNoIndex;
	}
	
	
	public long getTotalPageCount() {
		return totalPageCount;
	}

	private void setTotalPageCount(long totalPageCount) {
		this.totalPageCount = totalPageCount;
	}

	@Override
	public String toString() {
		return "PageEntity [pageSize=" + pageSize + ", totalCount=" + totalCount + ", currentPageNo=" + currentPageNo
				+ ", currentPageNoIndex=" + currentPageNoIndex + ", totalPageCount=" + totalPageCount + "]";
	}
	
		
}