package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.WaibaoyingzhengDao;
import com.entity.WaibaoyingzhengEntity;
import com.service.WaibaoyingzhengService;
import com.entity.vo.WaibaoyingzhengVO;
import com.entity.view.WaibaoyingzhengView;

@Service("waibaoyingzhengService")
public class WaibaoyingzhengServiceImpl extends ServiceImpl<WaibaoyingzhengDao, WaibaoyingzhengEntity> implements WaibaoyingzhengService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<WaibaoyingzhengEntity> page = this.selectPage(
                new Query<WaibaoyingzhengEntity>(params).getPage(),
                new EntityWrapper<WaibaoyingzhengEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<WaibaoyingzhengEntity> wrapper) {
		  Page<WaibaoyingzhengView> page =new Query<WaibaoyingzhengView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<WaibaoyingzhengVO> selectListVO(Wrapper<WaibaoyingzhengEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public WaibaoyingzhengVO selectVO(Wrapper<WaibaoyingzhengEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<WaibaoyingzhengView> selectListView(Wrapper<WaibaoyingzhengEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public WaibaoyingzhengView selectView(Wrapper<WaibaoyingzhengEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
