package com.xiangmu.wyxw.Modle;

import java.util.ArrayList;
import java.util.List;

/**
 * 性别枚举类
 * @author Li Yongqiang
 */
public enum Zpnl { 
	ZPNL1{
		@Override
		public String getName() {
			return "18-27";
		}
	},
	ZPNL2{
		@Override
		public String getName() {
			return "28-37";
		}
	},
	ZPNL3{
		@Override
		public String getName() {
			return "38-48";
		}
	},
	ZPNL4{
		@Override
		public String getName() {
			return "其它";
		}
	};
	/**
	 * 获取名称的抽象方法
	 * @return 名称
	 */
	public abstract String getName();
	public static List<String> getValues(){
		List<String> list = new ArrayList<String>();
		for (Zpnl zpnl:Zpnl.values()) {
			list.add(zpnl.getName());
		}
		return list;
	}
}
