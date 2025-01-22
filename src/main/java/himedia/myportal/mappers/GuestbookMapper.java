package himedia.myportal.mappers;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import himedia.myportal.repositories.vo.GuestbookVo;

//	이 매퍼 인터페이스를 mybatis mapper 설정의 namespace로 등록해줘야 한다.
//	MyBatis Mapper
@Mapper
public interface GuestbookMapper {

	
//	<select id="selectAll" resultType="guestbookVo">
	List<GuestbookVo> selectAll();
	
//	<insert id="insert"	parameterType="guestbookVo">
	int insert(GuestbookVo vo);
	
//	<delete id="delete" parameterType="guestbookVo">
	int delete(GuestbookVo vo);
	
	
	
}
