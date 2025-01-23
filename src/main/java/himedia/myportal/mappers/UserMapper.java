package himedia.myportal.mappers;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import himedia.myportal.repositories.vo.GuestbookVo;
import himedia.myportal.repositories.vo.UserVo;

//	이 매퍼 인터페이스를 mybatis mapper 설정의 namespace로 등록해줘야 한다.
//	MyBatis Mapper
@Mapper
public interface UserMapper {

//	<insert id="insert" parameterType="userVo">
	int insert(UserVo vo);
	
//	<select id="selectUserByEmailAndPassword" parameterType="map" resultType="userVo">
	UserVo selectUserByEmailAndPassword(Map<String, String> map);
	
//	<select id="selectUserByEmail" parameterType="string" resultType="userVo">
	UserVo selectUserByEmail(String email);
	
	
}
