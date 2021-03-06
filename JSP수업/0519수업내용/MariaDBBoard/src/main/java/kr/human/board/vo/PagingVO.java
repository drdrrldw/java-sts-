package kr.human.board.vo;

import java.util.List;

public class PagingVO<T> {
	
	private List<T> list;
	
	private int totalCount;
	private int currentPage;
	private int pageSize;
	private int blockSize;

	private int totalPage;
	private int startNo;
	private int endNo;
	private int startPage;
	private int endPage;
	
	
	public PagingVO(int totalCount, int currentPage, int pageSize, int blockSize) {
		super();
		this.totalCount = totalCount;
		this.currentPage = currentPage;
		this.pageSize = pageSize;
		this.blockSize = blockSize;
		
		calc();
	}


	private void calc() {
		if(totalCount <0) totalCount = 0;
		if(currentPage <=0) currentPage=1;
		if(pageSize <=1) pageSize=10;
		if(blockSize <= 1) blockSize=10;
		
		if(totalCount>0) {
			totalPage = (totalCount-1)/pageSize+1;
			startNo = (currentPage -1 ) * pageSize;
			endNo = startNo + pageSize -1;
			if(endNo >= totalCount) endNo = totalCount-1;
			startPage = (currentPage -1) /blockSize * blockSize + 1;
			endPage = startPage + blockSize -1;
			if(endPage >= totalPage) endPage = totalPage;
			
			
		}
	}


	public List<T> getList() {
		return list;
	}


	public void setList(List<T> list) {
		this.list = list;
	}


	public int getTotalCount() {
		return totalCount;
	}


	public int getCurrentPage() {
		return currentPage;
	}


	public int getPageSize() {
		return pageSize;
	}


	public int getBlockSize() {
		return blockSize;
	}


	public int getTotalPage() {
		return totalPage;
	}


	public int getStartNo() {
		return startNo;
	}


	public int getEndNo() {
		return endNo;
	}


	public int getStartPage() {
		return startPage;
	}


	public int getEndPage() {
		return endPage;
	}


	@Override
	public String toString() {
		return "PagingVO [list=" + list + ", totalCount=" + totalCount + ", currentPage=" + currentPage + ", pageSize="
				+ pageSize + ", blockSize=" + blockSize + ", totalPage=" + totalPage + ", startNo=" + startNo
				+ ", endNo=" + endNo + ", startPage=" + startPage + ", endPage=" + endPage + "]";
	}
	
	
	public String getPageInfo() {
		String info = "?????? : " + totalCount + "???";
		if(totalCount>0) {
			info += "("+currentPage+ "/" + totalPage + "Page)";
		}
		return info;
	}
	
	public String getPageList() {
		String pageList ="";
		// ?????? ???????????? 1?????? ?????? ????????? ??????.
		if(startPage > 1) {
			pageList += "[<a href='?p="+(startPage-1)+"&s="+pageSize+"&=b="+blockSize+"'>??????</a>] ";
		}
		
		// ????????? ????????? ??????
		for(int i = startPage; i<=endPage; i++) {
			if(i==currentPage) {
				// ?????? ???????????? ????????? ?????? ?????????.
				pageList += "[" + i +"] ";
			}else {
				pageList += "[<a href='?p="+i+"&s="+pageSize+"&=b="+blockSize+"'>"+ i +"</a>] ";
			}
		}
		
		
		// ????????? ???????????? ?????????????????????  ????????? ????????? ??????.
		if(endPage < totalPage) {
			pageList += "[<a href='?p="+(endPage+1)+"&s="+pageSize+"&=b="+blockSize+"'>??????</a>] ";
		}
		return pageList;
	}
	
	
}
