package org.zerock.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;
import org.zerock.domain.BoardVO;

public interface TimeMapper {
	
	@Select("SELECT sysdate FROM dual")
	public String getTime();
	
	public String getTime2();
	
}
