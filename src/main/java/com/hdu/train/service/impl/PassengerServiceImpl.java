package com.hdu.train.service.impl;

import com.hdu.train.entity.Passenger;
import com.hdu.train.mapper.PassengerMapper;
import com.hdu.train.service.IPassengerService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hdu.train.entity.Passenger;
import com.hdu.train.mapper.PassengerMapper;
import com.hdu.train.service.IPassengerService;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author zq
 * @since 2023-12-09
 */
@Service
public class PassengerServiceImpl extends ServiceImpl<PassengerMapper, Passenger> implements IPassengerService {

}
