package com.dao;

import com.entity.WaibaoyingzhengEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.WaibaoyingzhengVO;
import com.entity.view.WaibaoyingzhengView;


/**
 * 外包应征
 * 
 * @author 
 * @email 
 * @date 2022-03-29 16:14:52
 */
public interface WaibaoyingzhengDao extends BaseMapper<WaibaoyingzhengEntity> {
	
	List<WaibaoyingzhengVO> selectListVO(@Param("ew") Wrapper<WaibaoyingzhengEntity> wrapper);
	
	WaibaoyingzhengVO selectVO(@Param("ew") Wrapper<WaibaoyingzhengEntity> wrapper);
	
	List<WaibaoyingzhengView> selectListView(@Param("ew") Wrapper<WaibaoyingzhengEntity> wrapper);

	List<WaibaoyingzhengView> selectListView(Pagination page,@Param("ew") Wrapper<WaibaoyingzhengEntity> wrapper);
	
	WaibaoyingzhengView selectView(@Param("ew") Wrapper<WaibaoyingzhengEntity> wrapper);
	

}
