package one;

public class CustomExpDemo {

	private static String mobile;
	
	public static void judgeMobile(){
		if(mobile.length() < 11 && mobile != "") {
			//抛出业务异常
			throw new CustomExeption("手机位数不对");
		}
		
		else if(!mobile.matches("[0-9]+")&& mobile != "")
		{
			    throw new CustomExeption("手机号必须为数字");
		}else if(mobile.equals("")){
				throw new CustomExeption("手机号不能为空");
				}
	}
	
	public static void main(String[] args) {

		mobile = "";
		
		try{
			judgeMobile();
		}catch(CustomExeption ce){
			System.out.println(ce.getMessage());
		}
		
	}

}