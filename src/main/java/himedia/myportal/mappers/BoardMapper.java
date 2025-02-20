package himedia.myportal.mappers;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import himedia.myportal.repositories.vo.BoardVo;
import himedia.myportal.repositories.vo.GuestbookVo;

//	이 매퍼 인터페이스를 mybatis mapper 설정의 namespace로 등록해줘야 한다.
//	MyBatis Mapper
@Mapper
public interface BoardMapper {

//	<select id="selectAll"	resultType="boardVo">
	List<BoardVo> selectAll();
	
//	<insert id="insert" parameterType="boardVo">
	int insert(BoardVo boardVo);
	
//	TODO : 인자로 id를 받는 이유?
//	<update id="increaseHitCount" parameterType="int">
	int increaseHitCount(int id);
	
//	<select id="getContent" parameterType="int"	resultType="boardVo">
	BoardVo getContent(Integer no);
	
//	<update id="update" parameterType="boardVo">
	int update(BoardVo boardVo);
	
//	<delete id="delete" parameterType="map">
//	int delete(Integer no, Integer userNo);
	int delete(Map<String,Integer> map);
	
	
	
}
