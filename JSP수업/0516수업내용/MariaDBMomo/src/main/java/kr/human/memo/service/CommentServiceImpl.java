package kr.human.memo.service;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import kr.human.jdbc.JDBCUtil;
import kr.human.memo.dao.CommentDAO;
import kr.human.memo.dao.CommentDAOImpl;
import kr.human.memo.vo.CommentVO;
import kr.human.memo.vo.PagingVO;

public class CommentServiceImpl implements CommentService {
	// 싱글톤 클래스로 만들자
	// ----------------------------------------------------------------------------
	private static CommentService instance = new CommentServiceImpl();

	private CommentServiceImpl() {
		;
	}

	public static CommentService getInstance() {
		return instance;
	}
	// ----------------------------------------------------------------------------
	/*
	 * @Override public List<CommentVO> selectAll() { List<CommentVO> list = null;
	 * try(Connection conn = JDBCUtil.getConnection()){ // 0번부터 10000개 주세요 list =
	 * CommentDAOImpl.getInstance().selectList(conn, 0, 10000);
	 * 
	 * } catch (SQLException e) { e.printStackTrace(); } return list; }
	 */

	@Override
	public PagingVO<CommentVO> selectList(int currentPage, int pageSize, int blockSize) {
		PagingVO<CommentVO> pagingVO = null; // ======== 이 부분
		Connection conn = null;
		CommentDAO dao = null;
		try {
			conn = JDBCUtil.getConnection();
			conn.setAutoCommit(false);
			// 이 부분만 바뀐다.
			// -----------------------------------------------------------------------------------
			// 전체개수는 DB에서 가져온다.
			int totalCount = dao.selectCount(conn);

			// 객체를 생성하는 순간 모든 페이지 계산이 끝난다.
			pagingVO = new PagingVO<>(totalCount, currentPage, pageSize, blockSize);

			// 글 목록을 가져온다.
			List<CommentVO> list = dao.selectList(conn, pagingVO.getStartNo(), pagingVO.getPageSize());

			// 글을 VO에 넣어준다.
			pagingVO.setList(list);
			// -----------------------------------------------------------------------------------
			conn.commit();

		} catch (SQLException e) {
			JDBCUtil.rollback(conn);
			e.printStackTrace();
		}
		return pagingVO; // ======== 이 부분
	}

	@Override
	public int insert(CommentVO vo) {
		int count = 0;

		try (Connection conn = JDBCUtil.getConnection()) {
			// 데이터가 유효할때만 저장한다.
			if (vo != null) { // 객체가 있고
				if (vo.getName() != null && vo.getName().trim().length() > 0) { // 이름이 존재하고
					if (vo.getPassword() != null && vo.getPassword().trim().length() > 0) { // 비번이 존재하고
						if (vo.getContent() != null && vo.getContent().trim().length() > 0) { // 내용도 존재할때
							count = CommentDAOImpl.getInstance().insert(conn, vo);
						}
					}
				}
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return count;
	}

	@Override
	public int update(CommentVO vo) {
		int count = 0;

		try (Connection conn = JDBCUtil.getConnection()) {
			// 데이터가 유효할때만 수정한다.
			if (vo != null) { // 객체가 있고
				if (vo.getPassword() != null && vo.getPassword().trim().length() > 0) { // 비번이 존재하고
					if (vo.getContent() != null && vo.getContent().trim().length() > 0) { // 내용도 존재할때
						// DB에 있는 암호와 넘어온 암호가 일치할때만 수정한다.
						CommentVO dbVO = CommentDAOImpl.getInstance().selectByIdx(conn, vo.getIdx());
						if (dbVO != null && dbVO.getPassword().equals(vo.getPassword())) {
							count = CommentDAOImpl.getInstance().update(conn, vo);
						}
					}
				}
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return count;
	}

	@Override
	public int delete(CommentVO vo) {
		int count = 0;

		try (Connection conn = JDBCUtil.getConnection()) {
			// 데이터가 유효할때만 삭제한다.
			if (vo != null) { // 객체가 있고
				// DB에 있는 암호와 넘어온 암호가 일치할때만 삭제한다.
				CommentVO dbVO = CommentDAOImpl.getInstance().selectByIdx(conn, vo.getIdx());
				if (dbVO != null && dbVO.getPassword().equals(vo.getPassword())) {
					count = CommentDAOImpl.getInstance().delete(conn, vo.getIdx());
				}

			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return count;
	}

}
