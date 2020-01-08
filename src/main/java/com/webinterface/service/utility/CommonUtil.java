/**
 * 
 */
package com.webinterface.service.utility;

import java.util.Collection;
import java.util.Iterator;

/**
 * @author PRASADBolla
 *
 */
public class CommonUtil {
	public static final String NULL = "null";
	public static boolean isNullOrEmpty(String value) {
		return value == null || value.trim().length() == 0 || NULL.equalsIgnoreCase(value);
	}

	/**
	 * @param list
	 * @return
	 */
	public static boolean isEmptyList(Collection<?> list) {
		if (list == null || list.isEmpty())
			return true;

		for (Iterator<?> it = list.iterator(); it.hasNext();) {
			Object obj = it.next();
			if (obj != null) {
				return false;
			}
		}

		return true;
	}
    public static boolean isEmptyArray(Object[] array) {
        return array == null || array.length == 0;
    }
}
