package com.shopping.order.model;

import com.shopping.order.constant.BusinessEnum;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import static com.shopping.order.constant.BusinessEnum.OPERATION_FALL;
import static com.shopping.order.constant.BusinessEnum.OPERATION_SUCCESS;

/**
 * 统一返回结果
 */
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Result<T> {

	private int code;


	private String msg;


	private T data;

	public static <T> Result<T> success() {
		return new Result<>(OPERATION_SUCCESS.getCode(), OPERATION_SUCCESS.getMsg(), null);
	}

	public static <T> Result<T> success(T data) {
		return new Result<>(OPERATION_SUCCESS.getCode(), OPERATION_SUCCESS.getMsg(), data);
	}

	public static <T> Result<T> success(T data, String msg) {
		return new Result<>(OPERATION_SUCCESS.getCode(), msg, data);
	}

	public static <T> Result<T> success(BusinessEnum businessEnum, T data) {
		return new Result<>(businessEnum.getCode(), businessEnum.getMsg(), data);
	}

	public static <T> Result<T> fail() {
		return new Result<>(OPERATION_FALL.getCode(), OPERATION_FALL.getMsg(), null);
	}

	public static <T> Result<T> fail(BusinessEnum businessEnum) {
		return new Result<>(businessEnum.getCode(), businessEnum.getMsg(), null);
	}

	public static <T> Result<T> fail(String msg) {
		return new Result<>(OPERATION_FALL.getCode(), msg, null);
	}

	public static <T> Result<T> fail(int code, String msg) {
		return new Result<>(code, msg, null);
	}
}
