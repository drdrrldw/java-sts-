package kr.human.memo.service;

import java.util.List;

import kr.human.memo.vo.CommentVO;
import kr.human.memo.vo.PagingVO;

// 로직을 처리하는 기능들....	메서드 1개당 로직1개
public interface CommentService {
	// 1. 목록보기
	// 원래는 
	PagingVO<CommentVO> selectList(int currentPage, int pageSize, int blockSize);
	//List<CommentVO> selectAll();
	// 2. 저장하기
	int insert(CommentVO vo);
	// 3. 수정하기
	int update(CommentVO vo);
	// 4. 삭제하기
	int delete(CommentVO vo);
	
}
