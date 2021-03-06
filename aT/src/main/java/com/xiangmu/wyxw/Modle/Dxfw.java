package com.xiangmu.wyxw.Modle;

import java.util.ArrayList;
import java.util.List;

/**
 * 底薪枚举类
 * @author Li Yongqiang
 */
public enum Dxfw {
	GZDX1{
		@Override
		public String getName() {
			return "4000-5000";
		}
	},
	GZDX2{
		@Override
		public String getName() {
			return "3000-4000";
		}
	},
	GZDX3{
		@Override
		public String getName() {
			return "3000-2000";
		}
	},
	GZDX4{
		@Override
		public String getName() {
			return "2000-1000";
		}
	},
	GZDX5{
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
		for (Dxfw dxfw : Dxfw.values()) {
			list.add(dxfw.getName());
		}
		return list;
	}
}
