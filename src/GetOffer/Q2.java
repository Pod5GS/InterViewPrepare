package GetOffer;
/*
 * 由于Java中String被修改是先创建一个StringBuffer，调用StringBuffer的append方法后再返回StringBuffer类的toString函数返回String，在需要经常修改字符串的情况下，使用StringBuffer更好
 */
public class Q2 {
	public String replaceBlank(StringBuffer str ){
		StringBuffer stb = new StringBuffer();
		for(int i = 0; i < str.toString().length(); i++){
			if(str.charAt(i) == ' ')
				stb.append("%20");
			else
				stb.append(str.charAt(i));
		}
		return stb.toString();
	}
}
