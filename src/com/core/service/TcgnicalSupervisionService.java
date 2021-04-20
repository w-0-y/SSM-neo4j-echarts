package com.core.service;

import java.io.Serializable;
import java.util.ArrayList;

import net.sf.json.JSONObject;

public interface TcgnicalSupervisionService extends Serializable {
	/** 查询 */
	public JSONObject find(ArrayList<String> list, String isQuestion);

	/** 查询页面下拉框内容 */
	public JSONObject findLables();

}
