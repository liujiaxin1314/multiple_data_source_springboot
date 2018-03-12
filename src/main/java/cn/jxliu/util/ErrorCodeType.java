package cn.jxliu.util;

/**
 * 错误类型公共类
 * 
 * @author jxliu
 *
 */
public enum ErrorCodeType {

	SUCCESS(0), // 成功
	P_FAILURE(-1), // 通用失败
	P_NOTLOGIN(1001), // 未登录
	P_OVERDUE(1010), P_RESOURCEABSENT(1011), P_NOPRIV(1101), // 权限错误
	P_VALIDATIONFAILURE(1120), // 验证错误
	P_NOUSERNAME(1111), // 用户不存在

	DATABASEEXCEPTION(800), // 数据库异常
	CERTIFICATE(900), // 证书错误,
	EXCEPTION(2010);// 系统运行错误

	private int value;

	private ErrorCodeType(int val) {
		this.value = val;
	}

	public int getValue() {
		return value;
	}

}
