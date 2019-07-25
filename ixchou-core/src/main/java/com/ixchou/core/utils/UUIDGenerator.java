package com.ixchou.core.utils;

import java.util.UUID;

/**
 * <b>Author</b>: Hsiang Leekwok<br/>
 * <b>Date</b>: 2019/07/25 22:50<br/>
 * <b>Version</b>: v1.0<br/>
 * <b>Subject</b>: UUID 随机生成器<br/>
 * <b>Description</b>:
 */
public class UUIDGenerator {

    private UUIDGenerator() {
    }

    private static String getUUID() {
        String s = UUID.randomUUID().toString();
        return s.substring(0, 8) + s.substring(9, 13) + s.substring(14, 18) + s.substring(19, 23) + s.substring(24);
    }

    public static String[] getUUID(int number) {
        if (number < 1) {
            return null;
        }
        String[] ss = new String[number];
        for (int i = 0; i < number; i++) {
            ss[i] = getUUID();
        }
        return ss;
    }

    public static String getSerialId() {
        String s = UUID.randomUUID().toString();
        return s.substring(0, 16);
    }

    public static void main(String[] args) {
        System.out.println(getUUID());
    }
}
