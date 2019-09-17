package com.hui.zq.exception;



import com.hui.zq.enums.ResultCode;

/**
 * @author: zq
 * @Description: 参数无效异常
 * @date 2018/8/31 10:07
 */
public class ParameterInvalidException extends BusinessException {

	private static final long serialVersionUID = 3721036867889297081L;

	public ParameterInvalidException() {
		super();
	}

	public ParameterInvalidException(Object data) {
		super();
		super.data = data;
	}

	public ParameterInvalidException(ResultCode resultCode) {
		super(resultCode);
	}

	public ParameterInvalidException(ResultCode resultCode, Object data) {
		super(resultCode, data);
	}

	public ParameterInvalidException(String msg) {
		super(msg);
	}

	public ParameterInvalidException(String formatMsg, Object... objects) {
		super(formatMsg, objects);
	}

}
