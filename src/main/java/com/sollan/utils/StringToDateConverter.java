package com.sollan.utils;


import org.springframework.core.convert.converter.Converter;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author 16190
 * @date 2019/11/29 15 00
 * @description
 *
 * 时间格式自定义
 */

public class StringToDateConverter implements Converter<String, Date> {



    @Override
    public Date convert(String source) {

        //数据不能为空
        if(source==null){
            throw new RuntimeException("数据不能为空");
        }

        DateFormat df = new SimpleDateFormat("yyyy-mm-dd");

        try {
            //把字符串转换日期
            return df.parse(source);
        } catch (ParseException e) {
            throw new RuntimeException("数据类型转换出现错误");
        }
    }
}
