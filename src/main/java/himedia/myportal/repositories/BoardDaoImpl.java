package himedia.myportal.repositories;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import himedia.myportal.exceptions.BoardDaoException;
import himedia.myportal.mappers.BoardMapper;
import himedia.myportal.repositories.vo.BoardVo;

@Repository
public class BoardDaoImpl implements BoardDao {
	@Autowired 
//	SqlSession sqlSession;
	private BoardMapper boardMapper;
	
	@Override
	public List<BoardVo> selectAll() {
//		List<BoardVo> list = sqlSession.selectList("board.selectAll");
		
		List<BoardVo> list = boardMapper.selectAll();
		return list;
	}

	@Override
	public int insert(BoardVo boardVo) {
		try {
//			return sqlSession.insert("board.insert", boardVo);
			return boardMapper.insert(boardVo);
		} catch (Exception e) {
			throw new BoardDaoException("게시물 삽입 중 예외 발생", boardVo);
		}
	}

	@Override
	public BoardVo getContent(Integer no) {
//		sqlSession.update("board.increaseHitCount", no);
		boardMapper.update("board.increaseHitCount", no);
//		BoardVo vo = sqlSession.selectOne("board.getContent", no);
		BoardVo vo = boardMapper.selectOne(no);
		return vo;
	}

	@Override
	public int update(BoardVo boardVo) {
//		int updatedCount = sqlSession.update("board.update", boardVo);
		int updatedCount = boardMapper.update(boardVo);
		return updatedCount;
	}

	@Override
	public int delete(Integer no, Integer userNo) {
//		Map<String, Integer> map = new HashMap<>();
//		map.put("no", no);
//		map.put("userNo", userNo);
		
//		return sqlSession.delete("board.delete", map);
		return boardMapper.delete(no, userNo);
	}

}
