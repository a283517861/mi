package com.mi.entity;

/**
 * @Author 张东旭
 * @Description
 * @Date 2018.6.28 23:03
 * @Modified
 */
public enum RespCode {

	SUCCESS(0,"请求成功"),
	WARN(-1,"网络异常，请稍后重试");

	private int code;
	private String msg;

	RespCode(int code, String msg) {
		this.code = code;
		this.msg = msg;
	}

	public int getCode() {
		return code;
	}

	public String getMsg() {
		return msg;
	}
}
