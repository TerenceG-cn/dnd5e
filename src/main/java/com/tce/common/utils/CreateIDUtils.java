package com.tce.common.utils;

import java.util.UUID;

public class CreateIDUtils {
    /**
     * 生成随机的怪物id
     * @return
     */
    public static Long createMonsterId(){
        return UUID.randomUUID().getMostSignificantBits() & Long.MAX_VALUE;
    }

    public static void main(String[] args) {
        System.out.println(createMonsterId());
    }
}
