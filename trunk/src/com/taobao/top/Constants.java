package com.taobao.top;

/**
 * 公用常量类。
 * 
 * @author carver.gu
 * @since 1.0, Sep 12, 2009
 */
public abstract class Constants {

	/** TOP默认时间格式 **/
	public static final String DATE_TIME_FORMAT = "yyyy-MM-dd HH:mm:ss";

	/** UTF-8字符集 **/
	public static final String CHARSET_UTF8 = "UTF-8";

	/** GBK字符集 **/
	public static final String CHARSET_GBK = "GBK";

	/** TOP JSON 应格式 */
	public static final String FORMAT_JSON = "json";

	/** TOP正式环境授权相关地址 */
	public static final String PRODUCT_AUTHORIZE_URL = "http://auth.open.taobao.com/";
	public static final String PRODUCT_CONTAINER_URL = "http://container.open.taobao.com/container";

	/** TOP沙箱环境授权相关地址 */
	public static final String SANDBOX_AUTHORIZE_URL = "http://open.taobao.com/isv/authorize.php";
	public static final String SANDBOX_CONTAINER_URL = "http://container.api.tbsandbox.com/container";

}
