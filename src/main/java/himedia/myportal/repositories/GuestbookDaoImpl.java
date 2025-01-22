package himedia.myportal.repositories;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import himedia.myportal.exceptions.GuestbookDaoException;
import himedia.myportal.mappers.GuestbookMapper;
import himedia.myportal.repositories.vo.GuestbookVo;

@Repository
public class GuestbookDaoImpl implements GuestbookDao {

//	mapper로 바꾸면 되니까 필요없음
//	@Autowired
//	SqlSession sqlSession;
	@Autowired
	private GuestbookMapper guestbookMapper;

	@Override
	public List<GuestbookVo> selectAll() {

		List<GuestbookVo> list = guestbookMapper.selectAll();

		return list;
	}

	@Override
	public int insert(GuestbookVo vo) {

		try {
			return guestbookMapper.insert(vo);
		} catch (Exception e) {
			throw new GuestbookDaoException("방명록 기록중 에러 발생", vo);
		}

	}

	@Override
	public int delete(GuestbookVo vo) {

		try {
			return guestbookMapper.delete(vo);
		} catch (Exception e) {
			throw new GuestbookDaoException("방명록 삭제중 에러 발생", vo);
		}

	}

}
