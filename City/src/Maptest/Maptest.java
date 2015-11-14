package Maptest;

import java.util.LinkedHashMap;
import java.util.Map;

public class Maptest {
	public static Map<String, String[]> model=new LinkedHashMap<String, String[]>();
	static{
		model.put("北京", new String[]{"北京"});
		model.put("四川", new String[]{"成都","绵阳","广元","南充"});
		model.put("黑龙江", new String[]{"哈尔滨","齐齐哈尔","牡丹江","大庆"});
	}

}
