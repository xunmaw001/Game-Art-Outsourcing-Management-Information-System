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


import com.dao.WaibaoxuqiuDao;
import com.entity.WaibaoxuqiuEntity;
import com.service.WaibaoxuqiuService;
import com.entity.vo.WaibaoxuqiuVO;
import com.entity.view.WaibaoxuqiuView;

@Service("waibaoxuqiuService")
public class WaibaoxuqiuServiceImpl extends ServiceImpl<WaibaoxuqiuDao, WaibaoxuqiuEntity> implements WaibaoxuqiuService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<WaibaoxuqiuEntity> page = this.selectPage(
                new Query<WaibaoxuqiuEntity>(params).getPage(),
                new EntityWrapper<WaibaoxuqiuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<WaibaoxuqiuEntity> wrapper) {
		  Page<WaibaoxuqiuView> page =new Query<WaibaoxuqiuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<WaibaoxuqiuVO> selectListVO(Wrapper<WaibaoxuqiuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public WaibaoxuqiuVO selectVO(Wrapper<WaibaoxuqiuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<WaibaoxuqiuView> selectListView(Wrapper<WaibaoxuqiuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public WaibaoxuqiuView selectView(Wrapper<WaibaoxuqiuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
