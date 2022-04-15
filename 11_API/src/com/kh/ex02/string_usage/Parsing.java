package com.kh.ex02.string_usage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//https://www.kobis.or.kr/kobisopenapi/homepg/apiservice/searchServiceInfo.do
//http://kobis.or.kr/kobisopenapi/webservice/rest/boxoffice/searchWeeklyBoxOfficeList.json?key=f5eef3421c602c6cb7ea224104795888&targetDt=20120101

/*
 * 
 * �ָ� BoxOfiice
	1�� : �̼����ļ���, ���� ������ : 532����
	2�� : �ȷ�Ȩ�� , ���� ������ : 144����
	3�� : ���� ����, ���� ������ : 173����
	4�� : ����Ʈ ����, ���� ������ : 89����
	5�� : ������, ���� ������ : 20����
	6�� : ������ ����, ���� ������ : 282����
	7�� : ���̿� ŷ, ���� ������ : 17����
	8�� : ������ ���ϸ��� ����Ʈ ���á���ũƼ�Ͽ� ���� ���� ���ö󹫡�, ���� ������ : 28����
	9�� : �ٺ�� ���۹��3, ���� ������ : 51����
	10�� : ������ ���ϸ��� ����Ʈ ���� ����ũƼ�Ͽ� ���� ���� ��ũ�ι���, ���� ������ : 23����
 */
public class Parsing {
	// �ؼ��ϴ�. ��ǻ�� ��� : �ܺο� �ִ� Form ����(XML, JSON, CSV)�� ����Ҽ� �ְԲ� ������ȭ �ϴ� �۾�
	static String text = "{\"boxOfficeResult\":{\"boxofficeType\":\"�Ϻ� �ڽ����ǽ�\",\"showRange\":\"20120101~20120101\",\"dailyBoxOfficeList\":[{\"rnum\":\"1\",\"rank\":\"1\",\"rankInten\":\"0\",\"rankOldAndNew\":\"OLD\",\"movieCd\":\"20112207\",\"movieNm\":\"�̼����ļ���-��Ʈ��������\",\"openDt\":\"2011-12-15\",\"salesAmt\":\"2776060500\",\"salesShare\":\"36.3\",\"salesInten\":\"-415699000\",\"salesChange\":\"-13\",\"salesAcc\":\"40541108500\",\"audiCnt\":\"353274\",\"audiInten\":\"-60106\",\"audiChange\":\"-14.5\",\"audiAcc\":\"5328435\",\"scrnCnt\":\"697\",\"showCnt\":\"3223\"},{\"rnum\":\"2\",\"rank\":\"2\",\"rankInten\":\"1\",\"rankOldAndNew\":\"OLD\",\"movieCd\":\"20110295\",\"movieNm\":\"���� ����\",\"openDt\":\"2011-12-21\",\"salesAmt\":\"1189058500\",\"salesShare\":\"15.6\",\"salesInten\":\"-105894500\",\"salesChange\":\"-8.2\",\"salesAcc\":\"13002897500\",\"audiCnt\":\"153501\",\"audiInten\":\"-16465\",\"audiChange\":\"-9.7\",\"audiAcc\":\"1739543\",\"scrnCnt\":\"588\",\"showCnt\":\"2321\"},{\"rnum\":\"3\",\"rank\":\"3\",\"rankInten\":\"-1\",\"rankOldAndNew\":\"OLD\",\"movieCd\":\"20112621\",\"movieNm\":\"�ȷ�Ȩ�� : �׸��� ����\",\"openDt\":\"2011-12-21\",\"salesAmt\":\"1176022500\",\"salesShare\":\"15.4\",\"salesInten\":\"-210328500\",\"salesChange\":\"-15.2\",\"salesAcc\":\"10678327500\",\"audiCnt\":\"153004\",\"audiInten\":\"-31283\",\"audiChange\":\"-17\",\"audiAcc\":\"1442861\",\"scrnCnt\":\"360\",\"showCnt\":\"1832\"},{\"rnum\":\"4\",\"rank\":\"4\",\"rankInten\":\"0\",\"rankOldAndNew\":\"OLD\",\"movieCd\":\"20113260\",\"movieNm\":\"����Ʈ ����\",\"openDt\":\"2011-12-21\",\"salesAmt\":\"644532000\",\"salesShare\":\"8.4\",\"salesInten\":\"-75116500\",\"salesChange\":\"-10.4\",\"salesAcc\":\"6640940000\",\"audiCnt\":\"83644\",\"audiInten\":\"-12225\",\"audiChange\":\"-12.8\",\"audiAcc\":\"895416\",\"scrnCnt\":\"396\",\"showCnt\":\"1364\"},{\"rnum\":\"5\",\"rank\":\"5\",\"rankInten\":\"0\",\"rankOldAndNew\":\"OLD\",\"movieCd\":\"20113271\",\"movieNm\":\"������: ���ͼ��Ǻ�� \",\"openDt\":\"2011-12-29\",\"salesAmt\":\"436753500\",\"salesShare\":\"5.7\",\"salesInten\":\"-89051000\",\"salesChange\":\"-16.9\",\"salesAcc\":\"1523037000\",\"audiCnt\":\"55092\",\"audiInten\":\"-15568\",\"audiChange\":\"-22\",\"audiAcc\":\"202909\",\"scrnCnt\":\"290\",\"showCnt\":\"838\"},{\"rnum\":\"6\",\"rank\":\"6\",\"rankInten\":\"1\",\"rankOldAndNew\":\"OLD\",\"movieCd\":\"19940256\",\"movieNm\":\"���̿� ŷ\",\"openDt\":\"1994-07-02\",\"salesAmt\":\"507115500\",\"salesShare\":\"6.6\",\"salesInten\":\"-114593500\",\"salesChange\":\"-18.4\",\"salesAcc\":\"1841625000\",\"audiCnt\":\"45750\",\"audiInten\":\"-11699\",\"audiChange\":\"-20.4\",\"audiAcc\":\"171285\",\"scrnCnt\":\"244\",\"showCnt\":\"895\"},{\"rnum\":\"7\",\"rank\":\"7\",\"rankInten\":\"-1\",\"rankOldAndNew\":\"OLD\",\"movieCd\":\"20113381\",\"movieNm\":\"������ ����\",\"openDt\":\"2011-12-01\",\"salesAmt\":\"344871000\",\"salesShare\":\"4.5\",\"salesInten\":\"-107005500\",\"salesChange\":\"-23.7\",\"salesAcc\":\"20634684500\",\"audiCnt\":\"45062\",\"audiInten\":\"-15926\",\"audiChange\":\"-26.1\",\"audiAcc\":\"2823060\",\"scrnCnt\":\"243\",\"showCnt\":\"839\"},{\"rnum\":\"8\",\"rank\":\"8\",\"rankInten\":\"0\",\"rankOldAndNew\":\"OLD\",\"movieCd\":\"20112709\",\"movieNm\":\"������ ���ϸ��� ����Ʈ ���á���ũƼ�Ͽ� ���� ���� ���ö󹫡�\",\"openDt\":\"2011-12-22\",\"salesAmt\":\"167809500\",\"salesShare\":\"2.2\",\"salesInten\":\"-45900500\",\"salesChange\":\"-21.5\",\"salesAcc\":\"1897120000\",\"audiCnt\":\"24202\",\"audiInten\":\"-7756\",\"audiChange\":\"-24.3\",\"audiAcc\":\"285959\",\"scrnCnt\":\"186\",\"showCnt\":\"348\"},{\"rnum\":\"9\",\"rank\":\"9\",\"rankInten\":\"0\",\"rankOldAndNew\":\"OLD\",\"movieCd\":\"20113311\",\"movieNm\":\"�ٺ�� ���۹��3\",\"openDt\":\"2011-12-15\",\"salesAmt\":\"137030000\",\"salesShare\":\"1.8\",\"salesInten\":\"-35408000\",\"salesChange\":\"-20.5\",\"salesAcc\":\"3416675000\",\"audiCnt\":\"19729\",\"audiInten\":\"-6461\",\"audiChange\":\"-24.7\",\"audiAcc\":\"516289\",\"scrnCnt\":\"169\",\"showCnt\":\"359\"},{\"rnum\":\"10\",\"rank\":\"10\",\"rankInten\":\"0\",\"rankOldAndNew\":\"OLD\",\"movieCd\":\"20112708\",\"movieNm\":\"������ ���ϸ��� ����Ʈ ���� ����ũƼ�Ͽ� ���� ���� ��ũ�ι���\",\"openDt\":\"2011-12-22\",\"salesAmt\":\"125535500\",\"salesShare\":\"1.6\",\"salesInten\":\"-40756000\",\"salesChange\":\"-24.5\",\"salesAcc\":\"1595695000\",\"audiCnt\":\"17817\",\"audiInten\":\"-6554\",\"audiChange\":\"-26.9\",\"audiAcc\":\"235070\",\"scrnCnt\":\"175\",\"showCnt\":\"291\"}]}}";

	public static void main(String[] args) {
		String[] array1 = text.split("\\["); // Delimiter
		for(String str : array1) {
			System.out.println(str);
		}
		System.out.println("Header �и� �Ϸ�!");
		
		String[] array2 = array1[1].split("\\]");
		for(String str : array2) {
			System.out.println(str);
		}
		System.out.println("Tail �и� �Ϸ�!");

		String body = array2[0];
		String[] infoArray = body.split("}");
		for(String str : infoArray) {
			System.out.println(str);
		}
		System.out.println("�������� �и� �Ϸ�!");
		
		for(int i = 0; i < infoArray.length; i++) {
			infoArray[i] = infoArray[i].replace(",{", "").replace("{", "");
			System.out.println(infoArray[i]);
		}
		System.out.println("�������� ������ ���� ���� �Ϸ�!");
		
		String[][] rawDataArray = new String[infoArray.length][];
		for(int i = 0; i < infoArray.length; i++) {
			rawDataArray[i] = infoArray[i].split(",");
//			System.out.println(Arrays.toString(rawDataArray[i]));
			for(int j = 0; j< rawDataArray[i].length; j++ ) {
				rawDataArray[i][j] = rawDataArray[i][j].replace("\"", "").strip();
			}
			System.out.println(Arrays.toString(rawDataArray[i]));
		}
		// ��ü�� Raw������ Ȯ�� 
//		[rnum:1, rank:1, ... movieNm:�̼����ļ���:��Ʈ��������, openDt:2011-12-15, salesAmt:2776060500, salesShare:36.3, salesInten:-415699000, salesChange:-13, salesAcc:40541108500, audiCnt:353274, audiInten:-60106, audiChange:-14.5, audiAcc:5328435, scrnCnt:697, showCnt:3223]

		
		// ġƮŰ.. 
		List<Map<String, String>> jsonList = new ArrayList<>();
		
		for(int i = 0; i< rawDataArray.length; i++) {
			Map<String, String> map = new HashMap<>();
			for(int j =0; j < rawDataArray[i].length; j++) {
				String key = rawDataArray[i][j].split(":")[0];
				String value = rawDataArray[i][j].split(":")[1];
				map.put(key, value);
			}
			System.out.println(map);
			jsonList.add(map);
		}
		System.out.println("��ü �� �������� Key:Value �и� �Ϸ�");
		System.out.println();
		
		System.out.println("�ָ� BoxOfiice");
		for(Map<String, String> map : jsonList) {
			String print = map.get("rank") + "�� : " + map.get("movieNm")
			+ ", ���� ������ : " + Integer.parseInt(map.get("audiAcc")) / 10000 + "����" ;
			System.out.println(print);
		}
		
		// https://codechacha.com/ko/java-parse-json/
		// �ʵ忡 �������� ������ �ڵ带 ���°��� �����մϴ�. 
		// ������ �� �ڵ尡 ���� �ڵ��Դϴ�. �������� ���� ���� �ڵ�� ��� �������� ���� �ڵ�.
		// ���� ���� ���α׷��� ����. -> Test���� ���� case ���� ������ �ʿ��ϴ�. 
		// �������� �Ƿ��� ������ �ƴ϶� �ʵ忡���� ���� �� ���� �߿�.
		// �ڵ� �ƹ��� ���ص� ���״� ���´�. (�������� ���̳ʽ� ���� �Ƚ� ���ʹ�...)
	}
}
