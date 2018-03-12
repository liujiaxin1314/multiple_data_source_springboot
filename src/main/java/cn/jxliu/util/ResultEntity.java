package cn.jxliu.util;

import java.io.Serializable;

/**
 * 接口输出公共类
 * 
 * @author jxliu
 *
 */
public class ResultEntity implements Serializable {

	private static final long serialVersionUID = 5163060880905679964L;

	// 错误代码
	private ErrorCodeType errorCode;

	// 提示信息
	private String message;

	// 结果数据
	private Object data;

	// 单点登录用
	private int result_code;// 返回码， 0-有权限 1-无权限

	private String result_desc;// 返回信息

	private int state;// 抽检车辆列表标志位

	public ResultEntity() {
		this.errorCode = ErrorCodeType.P_FAILURE;
		this.message = "";
		this.data = "";
	}

	public ResultEntity(ErrorCodeType errorCode, String message, Object data) {
		super();
		this.errorCode = errorCode;
		this.message = message;
		this.data = data;
	}

	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
	}

	public int getResult_code() {
		return result_code;
	}

	public void setResult_code(int result_code) {
		this.result_code = result_code;
	}

	public String getResult_desc() {
		return result_desc;
	}

	public void setResult_desc(String result_desc) {
		this.result_desc = result_desc;
	}

	public ErrorCodeType getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(ErrorCodeType errorCode) {
		this.errorCode = errorCode;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

}
