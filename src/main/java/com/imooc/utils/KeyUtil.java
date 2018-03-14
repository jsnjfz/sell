package com.imooc.utils;

import java.util.Random;

/**
 * Created by fz on 2018-03-14.
 */
public class KeyUtil {

    /**
     * 生产主键
     *
     * @return
     */
    public static synchronized String genUniqueKey() {
        Random random = new Random();

        Integer result = random.nextInt(900000) + 100000;

        return System.currentTimeMillis() + String.valueOf(result);

    }
}
