package leetcode.array;

public class TestSQl {

	public static void main(String[] args) {
		//优化项目中sql检索大数据的表时查询慢的问题
		String sql = "select column,column1 from table where occur_time >= to_date(date,'yyyy-mm-dd hh24:mi:mm')"
				+ " and occur_time <= to_date(date,'yyyy-mm-dd hh24:mi:mm') and id in (.......)";
		
		//优化之后
		
		StringBuffer sbSql  = new StringBuffer();
		sbSql.append("select column,column1 from table where occur_time = to_date(date,'yyyy-mm-dd hh24:mi:mm') and id = 'id'"
				+ " union select column,column1 from table where occur_time = to_date(date,'yyyy-mm-dd hh24:mi:mm') and id = 'id'"
				+ "select column,column1 from table where occur_time = to_date(date,'yyyy-mm-dd hh24:mi:mm') and id = 'id'"
				+ "select column,column1 from table where occur_time = to_date(date,'yyyy-mm-dd hh24:mi:mm') and id = 'id'"
				+ "select column,column1 from table where occur_time = to_date(date,'yyyy-mm-dd hh24:mi:mm') and id = 'id'");
		//..... 避免使用in来查询数据
		
	}
}
