package com.shixin.service.impl;

import com.shixin.pojo.Test;
import com.shixin.mapper.TestMapper;
import com.shixin.service.TestService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author shixin
 * @since 2021-06-20
 */
@Service
public class TestServiceImpl extends ServiceImpl<TestMapper, Test> implements TestService {

}
