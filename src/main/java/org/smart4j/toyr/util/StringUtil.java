package org.smart4j.toyr.util;

import org.apache.commons.lang3.StringUtils;

/**
 * @author unisk1123
 * @Description
 * @create 2019/5/26
 */
public class StringUtil {

    /**
     * 判断字符串是否为空
     * @param str
     * @return
     */
    public static boolean isEmpty(String str) {
        if (str != null) {
            str = str.trim();
        }
        return StringUtils.isEmpty(str);
    }

    public static boolean isNotEmpty(String str) {
        return !isEmpty(str);
    }
}
