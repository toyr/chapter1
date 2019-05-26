package org.smart4j.toyr.util;

/**
 * @author unisk1123
 * @Description 转换操作工具类
 * @create 2019/5/26
 */
public class CastUtil {

    /**
     * 转换为 String 型
     */
    public static String castString(Object object) {
        return CastUtil.castString(object, "");
    }

    /**
     * 转为 String 型（提供默认值）
     *
     * @param object
     * @param defaultValue
     * @return
     */
    public static String castString(Object object, String defaultValue) {
        return object != null ? String.valueOf(object) : defaultValue;
    }


    /**
     * 转为 double 型
     *
     * @param object
     * @return
     */
    public static double castDouble(Object object) {
        return castDouble(object, 0);
    }

    /**
     * 转为 double 型 （提供默认值）
     *
     * @param object
     * @param defaultValue
     * @return
     */
    public static double castDouble(Object object, double defaultValue) {

        double doubleValue = defaultValue;
        if (object != null) {
            String strValue = castString(object);
            if (StringUtil.isNotEmpty(strValue)) {
                try {
                    doubleValue = Double.parseDouble(strValue);
                } catch (NumberFormatException e) {
                    doubleValue = defaultValue;
                }
            }
        }
        return doubleValue;
    }

    /**
     * 转为 long 型
     *
     * @param object
     * @return
     */
    public static long castLong(Object object) {
        return CastUtil.castLong(object, 0);
    }

    /**
     * 转为 long 型 （提供默认值）
     *
     * @param object
     * @param defaultValue
     * @return
     */
    public static long castLong(Object object, long defaultValue) {
        long longValue = defaultValue;
        if (object != null) {
            String strValue = castString(object);
            if (StringUtil.isNotEmpty(strValue)) {
                try {
                    longValue = Long.parseLong(strValue);
                } catch (NumberFormatException e) {
                    longValue = defaultValue;
                }
            }
        }
        return longValue;
    }

    /**
     * 转为 int 型
     *
     * @param object
     * @return
     */
    public static int castInt(Object object) {
        return CastUtil.castInt(object, 0);
    }

    /**
     * 转为 int 型（提供默认值）
     *
     * @param object
     * @param defaultValue
     * @return
     */
    public static int castInt(Object object, int defaultValue) {
        int intVaule = defaultValue;
        if (object != null) {
            String strValue = castString(object);
            if (StringUtil.isNotEmpty(strValue)) {
                try {
                    intVaule = Integer.parseInt(strValue);
                } catch (NumberFormatException e) {
                    intVaule = defaultValue;
                }
            }
        }
        return intVaule;
    }

    /**
     * 转为 boolean 型
     *
     * @param object
     * @return
     */
    public static boolean castBoolean(Object object) {
        return CastUtil.castBoolean(object, false);
    }

    /**
     * 转为 boolean 型（提供默认值）
     *
     * @param obj
     * @param defaultValue
     * @return
     */
    public static boolean castBoolean(Object obj, boolean defaultValue) {
        boolean booleanValue = defaultValue;
        if (obj != null) {
            booleanValue = Boolean.parseBoolean(castString(obj));
        }
        return booleanValue;
    }
}
